import com.dome.entity.Users;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resources;
import java.io.InputStream;
import java.util.List;

/**
 * @author lihaocheng
 * @create 2018-10-26 下午11:27
 **/

public class TestDemo{
    @Test
    public void testDemo() throws Exception{
        //初始化mybatis配置环境
        String resource = "mybatis.xml";
        InputStream is = org.apache.ibatis.io.Resources.getResourceAsStream(resource);
//        if(is==null){
//            System.out.println("is");
//        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //打开和数据库之间的对话
        SqlSession session = factory.openSession();
        if(session==null){
            System.out.println("数据库未连接");
        }

        //data compose
        List<Users> ulist=session.selectList("usersList");

        for(Users user:ulist){
            System.out.println(user);
        }
        //关闭资源
        session.close();
    }






}
