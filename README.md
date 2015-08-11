spring-cloud-client-starter
============================

This is a sample of Spring cloud config client.

For more information about Spring Cloud, see the
[Spring Cloud Document](http://projects.spring.io/spring-cloud/docs/1.0.3/spring-cloud.html).

Usage
-----------

**It assumes config server is already started on port 8888, see (https://github.com/spring-cloud/spring-cloud-config).**

Run this sample:

```
mvn spring-boot:run
```

The Spring boot service will start on default port 8080, check /env endpoint:

```
http://localhost:8080/env
```

The bootstrap properties will show up:

```
{
    "profiles": [],
    "configService:https://github.com/spring-cloud-samples/config-repo/application.yml": {
        "info.description": "Spring Cloud Samples",
        "info.url": "https://github.com/spring-cloud-samples",
        "eureka.client.serviceUrl.defaultZone": "http://user:${eureka.password:}@localhost:8761/eureka/",
        "eureka.password": "******"
    },
    "servletContextInitParams": {},
    "systemProperties": { ... },
    "systemEnvironment": { ... },
    "applicationConfig: [classpath:/bootstrap.properties]": {
        "application.name": "Justina",
        "spring.cloud.config.uri": "http://localhost:8888"
    },
    "defaultProperties": {
        "spring.application.name": "bootstrap"
    }
}
```
