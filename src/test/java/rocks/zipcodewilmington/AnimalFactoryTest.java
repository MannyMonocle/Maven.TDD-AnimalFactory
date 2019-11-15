package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        Date dogDays = new Date( 1995, 05, 18);
        Animal fido = AnimalFactory.createDog("Fido",dogDays);

        Assert.assertTrue(fido instanceof Dog);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest(){
        Date realNHours = new Date(1993,03,8);
        Animal manny = AnimalFactory.createCat("Nami",realNHours);

        Assert.assertTrue(manny instanceof Cat);
    }
}
