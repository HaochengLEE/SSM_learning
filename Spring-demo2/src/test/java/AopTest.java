import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import service.impl.UserServiceImpl;

import entity.User;


public class AopTest {

    @Test
	public void aopTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
		UserService service = (UserService) ctx.getBean("service");
		
		User user = new User();
		user.setId(1);
		user.setUsername("test");
		user.setPassword("123456");
		user.setEmail("test@xxx.com");

		service.addNewUser(user);
		service.deleteNewUser(user);
	}

}
