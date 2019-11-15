package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    private Cat burglar;


    @Before
    public void constructor() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        this.burglar = new Cat(givenName, givenBirthDate, givenId);
    }


    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameEqualsTest(){


        burglar.setName("Nami");

        String expected = "Nami";
        String actual = burglar.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAndGetNameNotEqualsTest(){

        burglar.setName("Nami");

        String unexpected = "Zula";
        String actual = burglar.getName();

        Assert.assertNotEquals(unexpected, actual);
    }

    // TODO - Create tests for `speak`

    @Test
    public void catSpeakTest(){

        String expected = "meow!";
        String actual = burglar.speak();

        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setAndGetBirthDateTest(){

        Date birthDate = new Date(1993, 3, 8);

        burglar.setBirthDate(birthDate);
        Date actual = burglar.getBirthDate();

        Assert.assertEquals(birthDate, actual);

    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void catEatTest(){

        Food meal = new Food();

        Integer preMeal = burglar.getNumberOfMealsEaten();
        burglar.eat(meal);
        Integer postMeal = burglar.getNumberOfMealsEaten();

        Assert.assertEquals( (Integer) 0 ,preMeal);
        Assert.assertEquals( (Integer) 1, postMeal);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIdTest() {

        Integer expected = 0;
        Integer actual = burglar.getId();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void instanceOfAnimalTest(){
        Assert.assertTrue(burglar instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void instanceOfMammalTest(){
        Assert.assertTrue(burglar instanceof Animal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat burglar = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = burglar.getName();
        Date retrievedBirthDate = burglar.getBirthDate();
        Integer retrievedId = burglar.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
