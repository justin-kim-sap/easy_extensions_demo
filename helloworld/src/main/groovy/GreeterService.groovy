class GreeterService {

    def spring;

    String sayHello(firstName) {
        def greeterMessage = new GreeterMessage();
        greeterMessage.configurationService = spring.getBean("configurationService");
        def message =  "${greeterMessage.getMessage()} ${firstName}. This is Easy @d-kom 2";
        return message;
    }

}
