package controller;

import com.sap.cx.boosters.easyrest.controller.EasyServiceController;
import service.GreeterService;
import java.util.Map;

class GreeterController implements EasyServiceController {

    def greeterService;

    Map execute(Map ctx) {
        def response = [:];
        response.'responseCode' = 200;
        response.'body' = greeterService.sayHello(ctx.parameters.firstname);
        return response
    }

}