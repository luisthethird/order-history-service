package com.orderhistoryservice;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OrderHistoryController {

    @RequestMapping(value = "/orderhistory", method = RequestMethod.GET, produces = "application/json")
    public String orderhistory() {
        return "{\"body\" = \"orderhistory\"}";
    }

}
