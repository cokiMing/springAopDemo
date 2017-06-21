package demo.target.Impl;

import demo.target.Demo;

/**
 * Created by wuyiming on 2017/6/21.
 */
public class Demo2 implements Demo {
    @Override
    public void print() {
        System.out.println("demo2--print");
    }

    @Override
    public void print2() {
        System.out.println("demo2--print2");
    }
}
