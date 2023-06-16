import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import ru.softwareTesting.mobile.MainClass;


public class MainClassTest {

    MainClass Main = new MainClass();
    @Test
    public void testGetLocalNumber() {

        int expectedNumber = 14;
        int actualNumber = Main.getLocalNumber();

        MatcherAssert.assertThat(
                String.format("Error in comparing two values. Expected value = %s , actual value = %s",
                        expectedNumber, actualNumber),
                actualNumber,
                Matchers.is(expectedNumber));
    }

    @Test
    public void testGetClassNumber(){

        if (Main.getClassNumber() > 45){
        }


    }


}
