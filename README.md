#This is a basic spring boot application that is configured to run on a docker container.

##Commands necessary to run this application:
1) mvn clean package (clean the target and build new package)

2) To Build Docker Image: docker build -f Dockerfile -t learn_to_code .

3) Running the image on the docker container: docker run -p 8081:8081

4) Note: you app should run on port 8081 but this can be changed if you are willing to change the config.