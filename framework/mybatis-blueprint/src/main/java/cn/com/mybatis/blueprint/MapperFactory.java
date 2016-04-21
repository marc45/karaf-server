package cn.com.mybatis.blueprint;

import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by xiaxuan on 16/4/21.
 */
public class MapperFactory {

    public static <T> T get(SqlSessionFactory sessionFactory, Class<T> clazz) {
        return new SqlSessionTemplate(sessionFactory).getMapper(clazz);
    }
}
