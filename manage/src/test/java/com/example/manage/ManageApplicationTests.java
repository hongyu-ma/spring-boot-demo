package com.example.manage;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ManageApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  public void increment() {
    int i = 1;
    /*int j = (++i)+(++i)+(++i);*/
    int a = ++i;
    int b = ++i;
    int c = ++i;
    System.out.println("a" + a + ",b" + b + ",c" + c);
    int j = a + b + c;
    int m = ++j;
    int n = j++;
    System.out.println("j" + j);
    System.out.println("m" + m + ", n" + n);


  }

}
