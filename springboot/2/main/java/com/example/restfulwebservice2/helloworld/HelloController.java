package com.example.restfulwebservice2.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!!!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean!!!");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean2(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello WorldBean, %s", name));
    }

    @GetMapping("/hello-world-internationalized")
    public String helloworldInternationalized(
            @RequestHeader(name = "Accept-Language", required = false)Locale locale){
        return messageSource.getMessage("greeting.message", null, locale);
    }
}
