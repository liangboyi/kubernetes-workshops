cd ..
./mvnw clean package
export IMAGE_BASE_URL=boyi
export IMAGE_TAG=latest
cd docker
make
