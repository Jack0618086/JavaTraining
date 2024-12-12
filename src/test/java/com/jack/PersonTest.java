package com.jack;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {
    @Test
    public void bmiTest() {
        Person person = new Person(1.81f, 75.5f);
        Assertions.assertEquals(75.5f/(1.81f*1.81f), person.bmi());
    }
}
