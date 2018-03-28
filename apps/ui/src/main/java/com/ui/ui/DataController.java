package com.ui.ui;

import com.ui.domain.User;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bliang on 28/03/2018.
 */
@Controller
public class DataController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${provider.url}")
    String providerUrl;

    @Value("${provider.port}")
    String providerPort;

    @RequestMapping("/list")
    public String list(Map<String, Object> model) {

        String url = "http://"+providerUrl+":"+providerPort+"/demo/all";
        User[] users = restTemplate.getForObject(url,User[].class);
        model.put("users",users);

        return "list";
    }

    @RequestMapping("/input")
    public String input(Map<String, Object> model) {
        return "add";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(Map<String, Object> model,HttpServletRequest request) {
        String url = "http://"+providerUrl+":"+providerPort+"/demo/add?name={name}&email={email}";

        String userName = request.getParameter("userName");
        String email = request.getParameter("email");

        Map requestParam = new HashMap();
        requestParam.put("name",userName);
        requestParam.put("email",email);

        String result = restTemplate.getForObject(url,String.class,requestParam);
        list(model);
        if("Saved".equals(result))
            return "list";
        else{
            model.put("error",result);
            return "error";
        }
    }
}
