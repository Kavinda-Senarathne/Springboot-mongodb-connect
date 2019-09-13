# Spring Boot MongoDB Example

## Overview

This is a simple web application based on *Spring Boot* to understand the basics of the *Spring Boot MongoDB* feature.

## Dependencies

### Runtime dependencies

*[Spring Boot](http://projects.spring.io/spring-boot/)*: Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".

* *Web*: Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container.

* *MongoDB*: The Spring Data MongoDB project provides integration with the MongoDB document database. Key functional areas of Spring Data MongoDB are a POJO centric model for interacting with a MongoDB DBCollection and easily writing a Repository style data access layer.

* *Actuator*: Spring Boot Actuator includes a number of additional features to help you monitor and manage your application when it’s pushed to production.

* *DevTools*: The aim of this module is to try and improve the development-time experience when working on Spring Boot applications.

*[Thymeleaf](http://www.thymeleaf.org/)*: Thymeleaf is a modern server-side Java template engine for both web and standalone environments.

*[jQuery](https://jquery.com/)*: *jQuery* is a cross-platform JavaScript library designed to simplify the client-side scripting of HTML.

*[Bootstrap](http://getbootstrap.com/)*: HTML, CSS and JS framework for developing responsive, mobile first projects on the web.

### Dev dependencies

*[gradle](https://gradle.org/)*: Gradle is an open source build automation system that builds upon the concepts of Apache Ant and Apache Maven and introduces a Groovy-based domain-specific language (DSL) instead of the XML form used by Apache Maven of declaring the project configuration.

## How to

### Setup

The following software should be installed on your computer.

* [Java](https://www.java.com/)

* [gradle](https://gradle.org/)

* [MongoDB](https://www.mongodb.com/)

### Start

Before starting the application you need a running MongoDB. The connection options can be configured in the *applicationContext-mongodb.xml* file. For example to start a local MongoDB you need to execute the `mongod` command.

To run the web application in place without building a jar first you can use the command `gradle bootrun`. This will start the web application with the specified *port* and *debug port* located in the *build.gradle* file. 

If you made some changes to the HTML or CSS files then you don't need to restart the application. If you make some changes to the Java code then simply build the project with `gradle build` while the application is still running and it will automatically restart. These nice features are possible because the project uses the *Spring Boot Gradle Plugin* and *DevTools*. 
