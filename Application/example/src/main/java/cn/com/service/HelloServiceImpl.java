package cn.com.service;

import cn.com.domain.Example;
import cn.com.mapper.ExampleMapper;
import lombok.Data;

/**
 * Created by Administrator on 2016/4/20.
 */
@Data
public class HelloServiceImpl implements HelloService {

    private ExampleMapper exampleMapper;

    public String hello() {
        Example example = new Example();
        example.setId(1);
        example.setSay("hello world");
        exampleMapper.save(example);
        return "hello world!";
    }

    public String hi(String name) {
        return "hello " + name;
    }
}
