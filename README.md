
## Innledning


Implementing Event Sourcing using Axon and Spring Boot

http://progressivecoder.com/2019/02/event-sourcing-and-cqrs-with-axon-and-spring-boot-part-2/

http://progressivecoder.com/2019/01/implementing-event-sourcing-using-axon-and-spring-boot-part-1/

http://localhost:8080/swagger-ui.html

http://localhost:8080/h2-console
http://event-sourcing-cqrs-axon-spring-boot-myproject.192.168.99.104.nip.io/swagger-ui.html
--------
openshift
IP Address:  192.168.99.104/24
oc login https://192.168.99.10:8443
https://www.baeldung.com/spring-boot-deploy-openshift

Minishift


https://192.168.99.102:8443/console/catalog
--------
mongodn
The following service(s) have been created in your project: mongodb.
       passord admin: toregard
       
       Username: toregard
       Password: toregard
  Database Name: toregarddb
 Connection URL: mongodb://toregard:toregard@mongodb/toregarddb

For more information about using this template, including OpenShift considerations, see https://github.com/sclorg/mongodb-container/blob/master/3.2/README.md .


---------------
minishift addons install --defaults
minishift addons enable admin-user

---------
https://spring.io/guides/gs/spring-boot-docker/

-------
mvnw install dockerfile:build
mvnw dockerfile:push