class GreeterService {

    def spring;

    String sayHello(firstName) {
        //def message = new GreeterMessage().message + firstName + " from GreeterService";
        def message = spring.getBean("easyTestBeanService").sayHello("Yannick");
        return message;
    }
}
