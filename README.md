# Datadog Java Logs

## For use this repos, you should:

1. Create datadog account
2. Create API key in the Organization Settings section
3. Copy key and paste it into docker-compose.yml file in DD_API_KEY=<YOUR-APLI_KEY>
4. Create docker image, running: 
> mvn spring-boot:build-image 
5. Run docker stack, running:
> docker-compose -f src/main/docker/docker-compose.yml up
6. Run spring boot service on port 8080:
```
curl --location --request GET 'http://localhost:8080/datadog' \
--header 'Content-Type: text/plain' \
--data-raw 'Enter to sendDatadogLog field1=dataz field2=dataz field3=dataz id=log-test'
```
7. Check in datadog logs
