class HelloWorldService {

    def spring;

    String sayHello(String firstName) {
        def message = new GreeterMessage().message + firstName + " from HelloWorldService";
        return message;
    }
}