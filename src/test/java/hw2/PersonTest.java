package hw2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by bakla410 on 29.09.17.
 */
public class PersonTest {

    Map<String, Person> persons = new HashMap<>();

    @Before
    public void createEnv() {
        persons.put("Bob", new Person(true, "Bob"));
        persons.put("Mary", new Person(false, "Mary"));
        persons.put("Alex", new Person(true, "Alex"));
        persons.put("John", new Person(true, "John"));
    }

    @Test
    public void marryThemAll() {
        persons.get("Bob").marry(persons.get("Mary"));
        assertEquals(persons.get("Bob").marry(persons.get("John")), false);

        persons.get("Bob").marry(persons.get("Mary"));

        assertEquals(persons.get("Bob").getSpouse(), persons.get("Mary"));
    }
}
