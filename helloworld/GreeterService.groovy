import Dependency

class GreeterService {

    def spring;

    String sayHello(firstName) {
        def greet = new Dependency().message + firstName + " GreeterService2";
        greet
    }
}