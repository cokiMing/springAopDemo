package demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wuyiming on 2017/6/21.
 */
public class TimeHandler {
    public void printTime(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        System.out.println(dateFormat.format(date));
    }

    public void aroundMethod(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("around start");
        pjp.proceed();
        System.out.println("around end");
    }
}
