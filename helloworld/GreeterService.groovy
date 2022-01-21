//import Dependency

class GreeterService {

    def spring;

    String sayHello(firstName) {
        //def message = new Dependency().message + firstName;
        def message = "hello " + firstName "from GreeterService";
        println(message);
        return message;
    }
}