all: push clean

IMAGE_NAME=${IMAGE_BASE_URL}/app-ui

addconf:
	cp ../target/ui*.jar ../docker/ui.jar

build: addconf
	docker build -t $(IMAGE_NAME):$(IMAGE_TAG) .

push: build
	docker push $(IMAGE_NAME):$(IMAGE_TAG)

clean:
	rm -rf ../target
	rm -rf ui.jar
