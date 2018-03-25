all: push clean

IMAGE_NAME=${IMAGE_BASE_URL}/test-demo

addconf:
	cp ../target/demo*.jar ../docker/demo.jar

build: addconf
	docker build -t $(IMAGE_NAME):$(IMAGE_TAG) .

push: build
	docker push $(IMAGE_NAME):$(IMAGE_TAG)

clean:
	rm -rf ../target
