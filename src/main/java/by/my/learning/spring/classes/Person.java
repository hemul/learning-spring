package by.my.learning.spring.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author hemul on 5/30/16.
 */
public class Person {
    private static final Logger LOG = LoggerFactory.getLogger(Person.class);

    public void speak(){
        LOG.debug("I'm a person!");
    }
}
