package service;

class GreeterService {

    def configurationService;

    String sayHello(firstName) {
        def message =  "${getMessage()} ${firstName}. This is Easy demo to Bill.";
        return message;
    }

    String getMessage()
    {
        return configurationService.getConfiguration().getString("easy.helloworld.message");
    }

}
