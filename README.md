# Sample application using Java and the Spring Boot framework

This sample is running on https://java-springboot.is-easy-on-scalingo.com/

## Running locally

Make sure you have a working Java 17 environment setup, and that `JAVA_HOME` is
set:

For example:

```shell
% echo $JAVA_HOME
/usr/lib/jvm/java-17-openjdk-amd64

% java --version
openjdk 17.0.5 2022-10-18
[...]
```

Then:

```shell
% git clone https://github.com/Scalingo/sample-java-springboot
% cd sample-java-springboot
% ./gradlew bootRun --args="--server.port=${PORT}"
```

The app listens by default on the port 8080 or the one defined by the `PORT`
environment variable.

For example, if you'd want to run on port 4321:

```shell
% export PORT=4321
% ./gradlew bootRun --args="--server.port=${PORT}"
```

## Deploy via Git

Create an application on https://scalingo.com, then:

```shell
% scalingo --app my-app git-setup
% git push scalingo master
```

And that's it!

## Deploy via One-Click

[![Deploy to Scalingo](https://cdn.scalingo.com/deploy/button.svg)](https://my.scalingo.com/deploy)
