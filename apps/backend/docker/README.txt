docker run --name backend \
       -p 0.0.0.0:8787:8787 \
       -e PRJ_PORT=8787 \
       -e DB_NAME=db_example \
       -e DB_IP=10.34.54.60 \
       -e DB_PORT=3306 \
       -e DB_USERNAME=springuser 
       -e DB_PASSWORD=123456 \
       -d boyi/backend
