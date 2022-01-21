class HelloWorldService {

    def spring;

    String sayHello(firstName) {
        def message = new GreeterMessage().message + firstName + " from HelloWorldService";
        return message;
    }
}