# The VideoGame API

This is a personal API application, providing information about video game industry and its trivia.

# Getting started:

##Download

```
git clone https://github.com/alangaraujo/thevideogameapi.git
```

##Build:

###Enter the project directory and run:

```
Linux
./mvnw package
(if you get an error, change the file permission with command: 'chmod 755 mvnw')

Windows
mvnw package
```

The /target folder will be created with the jar file, access this folder, and run:

```
java -jar thevideogameapi-x.x.x-SNAPSHOT.jar

Note: 'x' means the version number, change it according to the file name. 
```

# Testing

This project provides Swagger tool(API Documentation through web page), you don't need to install any API testing tool (e.g Postman/Insomnia), when application starts just head to **http://localhost:8080/swagger-ui.html** at your favourite web browser.