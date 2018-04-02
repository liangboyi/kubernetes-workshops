cd ..
./mvnw clean package -Dmaven.test.skip=true
export IMAGE_BASE_URL=boyi
export IMAGE_TAG=latest
cd docker
make
