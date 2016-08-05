package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {

  public static void main(String[] args) {
    // Spring Bean Container 생성
    ApplicationContext ctx = 
        new ClassPathXmlApplicationContext("test/app-ctx.xml");
    
    String[] beanNames = ctx.getBeanDefinitionNames();
    for(String beanName : beanNames){
      System.out.println(beanName);
    }
  }

}
