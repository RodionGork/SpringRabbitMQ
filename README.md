SpringRabbitMQ
==============

Test project with Spring framework (java) utilizing RabbitMQ messaging facilities

Install and run RabbitMQ Server.

Build and run project with maven:

    mvn jetty:run

Then go to `http://localhost:8080/` and try to send message - you should see it in console.

Message is sent with `RabbitTemplate` from `SimpleController` and received by `Receiver` class with the help of
some adapters (see context file).

Technically Sender and Receiver could be separated.
