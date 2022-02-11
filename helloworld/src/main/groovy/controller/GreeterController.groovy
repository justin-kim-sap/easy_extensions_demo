package controller;

import service;

class GreeterController {

    def execute(parameters) {
        response.'responseCode' = 200;
        response.'body' = 'Hello ' + parameters.firstname;
        return response
    }

}