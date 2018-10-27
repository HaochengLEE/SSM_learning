import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resources;
import java.io.InputStream;

/**
 * @author lihaocheng
 * @create 2018-10-26 下午11:27
 **/

public class TestDemo {
    //cscs
    String resource = "mybatis.xml";
    InputStream is = Resources.class.getResourceAsStream(resource);
    SqlSession factory = new SqlSessionFactoryBuilder().build(is);




}
