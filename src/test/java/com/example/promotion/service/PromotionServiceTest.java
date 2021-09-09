package com.example.promotion.service;

import com.example.promotion.model.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PromotionServiceTest {
    @Autowired
    ClienteService clienteService;

    @Test
    void sendEmailPromoted() {
        Cliente cliente1 = new Cliente();
        cliente1.setEmail("edsonrosas321@gmail.com");
        cliente1.setUsername("Edson");
        cliente1.setBirthdate("08-04-1998");

        Cliente cliente2 = new Cliente();
        cliente2.setEmail("edsonrosas321@gmail.com");
        cliente2.setUsername("Agenl");
        cliente2.setBirthdate("09-06-1998");

        Cliente cliente3 = new Cliente();
        cliente3.setEmail("edsonrosas321@gmail.com");
        cliente3.setUsername("Carla");
        cliente3.setBirthdate("08-04-2000");


    }
}