package cn.com.service;

/**
 * Created by Administrator on 2016/4/20.
 */
public class HelloServiceImpl implements HelloService {

    public String hello() {
        return "hello world!";
    }

    public String hi(String name) {
        return "hello " + name;
    }
}
