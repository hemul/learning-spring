package by.my.learning.spring.app;

import by.my.learning.spring.classes.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.debug("App.main - START");
        ApplicationContext context = new FileSystemXmlApplicationContext("app-context.xml");

        Person person = (Person) context.getBean("person");
        person.speak();

        ((FileSystemXmlApplicationContext) context).close();
        LOG.debug("App.main - END");
    }
}
