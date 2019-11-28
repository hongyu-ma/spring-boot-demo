package com.example.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@ImportResource("classpath:/config/*.xml")*/
public class ManageApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManageApplication.class, args);
  }

}
