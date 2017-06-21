package demo;

import demo.target.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuyiming on 2017/6/21.
 */
public class Main {

    @Autowired()
    private Demo demo1;

    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/aop.xml");
        Demo demo1 = (Demo) ctx.getBean("Demo1");
        Demo demo2 = (Demo) ctx.getBean("Demo2");
        demo1.print();
        System.out.println();
        demo1.print2();
        System.out.println();
        demo2.print();
        System.out.println();
        demo2.print2();
        System.out.println();
    }
}
