package br.com.jwt.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Consultar
 * https://dzone.com/articles/spring-boot-security-json-web-tokenjwt-hello-world
 */
@RestController
public class HelloController {

    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }
}