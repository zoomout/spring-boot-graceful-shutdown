# Demo Spring application with Graceful shutdown

## Description of the problem

Implementation of graceful shutdown makes the application disposable, meaning it can be started or stopped at any moment. 
This facilitates fast elastic scaling, rapid deployment of code or config changes, and robustness of production deploys.
Processes shut down gracefully when they receive a SIGTERM signal from the process manager.

## Credits

 - Spring boot application is initialized via: https://start.spring.io
 - Graceful shutdown example is taken from: https://dzone.com/articles/graceful-shutdown-spring-boot-applications

# How to test graceful shutdown

0. Start the application and record the PID:
     ```
    ./gradlew bootRun
   ...
   Started GracefulShutdownApp in XXX seconds
   ...
    ```
1. Send curl request
    ```
    curl -i localhost:8080/long-process 
    ```
2. Kill the application
    ```
   Ctrl+C
   ```
   
4. Even after killing the application you get successful response
    ```
    HTTP/1.1 200 
    Content-Type: text/plain;charset=UTF-8
    Content-Length: 16
    Date: Sat, 12 Oct 2019 19:45:34 GMT
    
    Process finished
    ```