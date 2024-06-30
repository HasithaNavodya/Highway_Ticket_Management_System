package lk.ijse.ticket_service.controller;/*
    this application is copyright protected
    Author : kumara
    Date : 6/26/2024
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @GetMapping
    public String get(){
        return "Ticket get method invoked";
    }
}
