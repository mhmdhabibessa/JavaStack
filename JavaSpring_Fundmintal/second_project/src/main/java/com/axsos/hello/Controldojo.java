package com.axsos.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class Controldojo {

	  @RequestMapping("/coding")
      public String index(){
        return "Hello Coding Dojo!";
      }
      @RequestMapping(value="/coding/python", method=RequestMethod.GET)
      public String hello(){
        return "'Python/Django was awesome!";
      }
      @RequestMapping("/coding/java")
      public String world(){
      	return "java is the best";
      }
  }


