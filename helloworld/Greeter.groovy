import Dependency

class Greeter {

    def spring;

    String sayHello(firstName) {
        def greet = new Dependency().message + firstName;
        greet
    }
}