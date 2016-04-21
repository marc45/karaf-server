package cn.com.mapper;

import cn.com.domain.Example;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by xiaxuan on 16/4/21.
 */
public interface ExampleMapper {

    @Insert("insert into example(id, say) values(#{id}, #{say})")
    void save(Example example);
}
