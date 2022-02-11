package service;

class GreeterMessage {
    def configurationService;
    
    String getMessage()
    {
        return configurationService.getConfiguration().getString("easy.helloworld.message");
    }
    
}