class GreeterService {

    def spring;

    String sayHello(firstName) {
        def greeterMessage = new GreeterMessage();
        greeterMessage.configurationService = spring.getBean("configurationService");
        def message = greeterMessage.getMessage() + " " + firstName + " from GreeterService for Korea team";
        return message;
    }

    String sayHelloFromSpring(firstName) {
        def message = spring.getBean("easyTestBeanService").sayHello("Yannick");
        return message;
    }

}