package controller;

import service.GreeterService;

class GreeterController {

    def greeterService;

    def execute(parameters) {
        def response = [:];
        response.'responseCode' = 200;
        response.'body' = greeterService.sayHello(parameters.firstname);
        return response
    }

}