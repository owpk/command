package ru.geekbrains.javacommand.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authenticated")
public class SecuredController {
   @GetMapping("/hello")
   public String hello() {
      return "Hello!";
   }
}
