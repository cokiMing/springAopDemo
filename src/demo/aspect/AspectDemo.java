package demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by wuyiming on 2017/6/21.
 */
@Component
@Aspect
public class AspectDemo {

    @Pointcut("execution(* demo.target.Demo.print*(..))")
    public void Controller(){
        //此方法仅仅是一个标记
    }

    @Before("Controller()")
    public void printDemoBefore(){
        System.out.println("aspectDemo test before");
    }

    @After("Controller()")
    public void printDemoAfter(){
        System.out.println("aspectDemo test after");
    }
}
