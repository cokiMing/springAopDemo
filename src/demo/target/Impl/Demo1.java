package demo.target.Impl;

import demo.target.Demo;

/**
 * Created by wuyiming on 2017/6/21.
 */
public class Demo1 implements Demo {
    @Override
    public void print() {
        System.out.println("demo1--print");
    }

    @Override
    public void print2() {
        System.out.println("demo1--print2");
    }
}
