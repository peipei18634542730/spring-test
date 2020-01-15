import com.pei.spring_test.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestHello
 * @Deacription
 * @Author peipei
 * @Date 2020/1/15 23:35
 * @Version 1.0
 **/

public class TestHello {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");//输入的是想要spring生成的对象的xml配置文件
        Hello hello = (Hello) context.getBean("hello"); //getBean()输入的是配置文件命名的id
        System.out.println(hello.getName());

    }
}
