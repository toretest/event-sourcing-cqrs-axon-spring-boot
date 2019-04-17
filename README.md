
## Innledning
oc start-build event-sourcing-cqrs-axon-spring-boot-s2i -n myproject

## post
post

http://eventsourcing-myproject.192.168.99.101.nip.io/bank-accounts

Content-Type : application/json
```
{
  "currency": "string",
  "startingBalance": 0
}
```

```
curl -X POST "http://eventsourcing-myproject.192.168.99.101.nip.io/bank-accounts" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"currency\": \"string\", \"startingBalance\": 0}"
```

### odo
* https://github.com/openshift/odo/blob/master/docs/getting-started.md
* https://openshiftdo.org/getting-started/#1-running-openshift


* odo login -u developer -p developer
* odo app create eventapp
* git clone <https://github.com/openshift/nodejs-ex>
* cd <nodejs-ex>
* odo create openjdk18 ( image version )
* odo push
* odo url create
* odo url create --open

* OPENJDK18 odo virker
```
oc import-image my-redhat-openjdk-18/openjdk18-openshift --from=registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift --confirm
```
Fra <https://github.com/openshift/odo/issues/500> 

* OPENJDK18-OPENSHIFT

OPENJDK18-OPENSHIFT

Fra <https://github.com/openshift/odo/issues/500> 
```
apiVersion: image.openshift.io/v1
kind: ImageStream
metadata:
  name: openjdk18
  namespace: openshift
spec:
  lookupPolicy:
    local: false
  tags:
    - annotations:
        description: >-
          Build and run Java Microservices such as Spring Noot
        iconClass: icon-spring
        openshift.io/display-name: OpenJDK 1.8 (Latest)
        openshift.io/provider-display-name: 'Red Hat, Inc.'
        tags: 'builder,java,spring-boot'
      from:
        kind: DockerImage
        name: registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift
      generation: 1
      importPolicy: {}
      name: latest
      referencePolicy:
        type: Source
```



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

https://blog.openshift.com/part-2-creating-a-template-a-technical-walkthrough/

-------
mvnw install dockerfile:build
mvnw dockerfile:push

