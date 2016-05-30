package by.my.learning.spring.app;

import by.my.learning.spring.classes.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.debug("App.main - START");
        ApplicationContext context = new ClassPathXmlApplicationContext("/by/my/learning/spring/conf/app-context.xml");

        Person person = (Person) context.getBean("person");
        person.speak();

        ((ClassPathXmlApplicationContext) context).close();
        LOG.debug("App.main - END");
    }
}
