import com.pei.spring_02.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestUser
 * @Deacription
 * @Author peipei
 * @Date 2020/1/16 23:52
 * @Version 1.0
 **/

public class TestUser {

    @Test
    public  void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);

    }
}
