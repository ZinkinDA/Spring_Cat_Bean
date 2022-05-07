import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBeanTwo = (Cat) applicationContext.getBean("cat");

        System.out.println("BeanOne.equals(BeanTwo) = " + bean.equals(beanTwo));
        System.out.println("CatBeanOne.equals(CatBeanTwo) = " + catBean.equals(catBeanTwo));

    }
}