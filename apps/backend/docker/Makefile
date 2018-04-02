all: push clean

IMAGE_NAME=${IMAGE_BASE_URL}/app-backend

addconf:
	cp ../target/backend*.jar ../docker/backend.jar

build: addconf
	docker build -t $(IMAGE_NAME):$(IMAGE_TAG) .

push: build
	docker push $(IMAGE_NAME):$(IMAGE_TAG)

clean:
	rm -rf ../target
	rm -rf backend.jar
