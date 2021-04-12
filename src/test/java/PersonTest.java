import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person = new Person(40, "Zlatan");
    private String expectedName, actualName;
    private int expectedAge, actualAge;

    @Test
    public void getAge() {
        //Right here i make use of the person object to se if the getAgeI method returns the right age
        System.out.println("GET AGE!");
        expectedAge = 40;
        actualAge = person.getAge();

        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void setAge() {
        // Here i make use of my person object to try out if the setAgeI method, does whats it supposed to do
        System.out.println("SET AGE");
        expectedAge = 40;
        person.setAge(expectedAge);
        actualAge = person.getAge();

        Assert.assertEquals(expectedAge,actualAge);
    }

    @Test
    public void getName() {
        // Right here i control with help of my person object to se that the getNameS method is working correctly
        System.out.println("GET NAME");
        expectedName = "Zlatan";
        actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setName() {
        // Here, with help of the object called person. I check if the setNameS, sets the value correctly
        System.out.println("SET NAME");
        expectedName = "Zlatan";
        person.setName(expectedName);
        actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void reverse() {
        // Here i make use of the person object to se it the Reverse method, reverses the name.
        System.out.println("REVERSE");
        expectedName = "natalZ";
        actualName = person.reverse();

        Assert.assertEquals(expectedName, actualName);
    }

}