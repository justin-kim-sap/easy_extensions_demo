class GreeterService {

    def spring;

    String sayHello(firstName) {
        def message = new GreeterMessage().message + firstName + " from GreeterService 2";
        return message;
    }
}