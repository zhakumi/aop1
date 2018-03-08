package com.aop.theory;

import com.aop.AopConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes=AopConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DynamicTest {

  @Test
    public void dynamicTest(){
      DogProxyDynamic proxy=new DogProxyDynamic();
      Animal animal=(Animal) proxy.bind(new DogImpl());
      animal.call();
  }

  @Test
  public void cglibTest(){
    DogProxyCglib proxy=new DogProxyCglib();
    Dog dog=(Dog)proxy.getInstance(new Dog());
    dog.call();
  }

}

