class GreeterService {

    def spring;

    String sayHello(firstName) {
        def greeterMessage = new GreeterMessage();
        greeterMessage.configurationService = spring.getBean("configurationService");
        def message = greeterMessage.getMessage() + " " + firstName + " from GreeterService 2";
        return message;
    }

}
