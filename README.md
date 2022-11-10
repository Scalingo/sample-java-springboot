# Sample application using Java and the Spring Boot framework

This sample is running on https://java-springboot.is-easy-on-scalingo.com/


## Deploying using Git

Create an application on https://scalingo.com, then:

```shell
% scalingo --app my-app git-setup
% git push scalingo master
```

And that's it!


## Deploying using our One-Click

[![Deploy to Scalingo](https://cdn.scalingo.com/deploy/button.svg)](https://my.scalingo.com/deploy)


## Running locally

```shell
% git clone https://github.com/Scalingo/sample-java-springboot.git
% cd sample-java-springboot
% docker compose up
```

By default, the app listens on port 8080. The app is available at
[http://localhost:8080/](http://localhost:8080/).
