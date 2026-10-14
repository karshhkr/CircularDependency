package com.my.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

//
//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }
    public void pay() {
      System.out.println("Payment Done");


      // yeh kaam iska nhi hona chaiye ki wo payment k baad orderDetails handle kre wo orderService sambhalega
   //     orderService.getOrderDetails();
    }

}
