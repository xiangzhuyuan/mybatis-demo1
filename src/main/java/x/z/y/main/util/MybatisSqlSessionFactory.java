package x.z.y.main.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * User: xiangzhuyuan
 * Date: 14-5-28
 * Time: 下午11:53
 * To change this template use File | Settings | File Templates.
 */
public class MybatisSqlSessionFactory {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.
                        getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new
                        SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSession() {
        return getSqlSessionFactory().openSession();
    }
}