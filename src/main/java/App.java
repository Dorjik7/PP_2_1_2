import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHello1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHello2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        boolean compareHello = beanHello1 == beanHello2;
        System.out.println(compareHello);

        boolean compareCats = beanCat1 == beanCat2;
        System.out.println(compareCats);

        //System.out.println(bean.equals(bean1));
        //System.out.println(bean2.equals(bean3));

        //System.out.println(bean.getMessage());
    }
}