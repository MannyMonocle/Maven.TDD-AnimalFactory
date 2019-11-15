package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    private Dog burglar = new Dog(null, null, 21);

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void dogConstructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog test = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = test.getName();
        Date retrievedBirthDate = test.getBirthDate();
        Integer retrievedId = test.getId();

        // Then (we expect the given data, to match the retrieved data)

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`

    @Test
    public void dogSpeakTest(){

        String expected = "bark!";
        String actual = burglar.speak();

        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setAndGetBirthDateTest() {

        Date birthDate = new Date(1993, 3, 8);

        burglar.setBirthDate(birthDate);
        Date actual = burglar.getBirthDate();

        Assert.assertEquals(birthDate, actual);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void dogEatTest(){

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

        Integer expected = 21;
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
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
