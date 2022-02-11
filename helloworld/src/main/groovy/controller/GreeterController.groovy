package controller;

import com.sap.cx.boosters.easyrest.controller.EasyServiceController;
import service.GreeterService;

class GreeterController implements EasyServiceController {

    def greeterService;

    def execute(parameters) {
        def response = [:];
        response.'responseCode' = 200;
        response.'body' = greeterService.sayHello(parameters.firstname);
        return response
    }

}