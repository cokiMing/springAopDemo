package demo.aspect;


import org.aspectj.lang.JoinPoint;

/**
 * Created by wuyiming on 2017/6/21.
 */
public class LogHandler {
    public void preLog(JoinPoint joinpoint){
        String name = joinpoint.getTarget().getClass().getName();
        String method = joinpoint.getSignature().getName();
        System.out.println(name + ":" + method + "---方法开始日志");
    }

    public void afterLog(JoinPoint joinpoint){
        String name = joinpoint.getTarget().getClass().getName();
        String method = joinpoint.getSignature().getName();
        System.out.println(name + ":" + method + "---方法结束日志");
    }
}
