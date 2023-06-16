
import lombok.extern.slf4j.Slf4j;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import ru.softwareTesting.mobile.MainClass;

@Slf4j
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
        int actualNumber = Main.getClassNumber();
        if (actualNumber > 45){
            log.info("testGetClassNumber: The actual number = {} is greater than 45.", actualNumber);
            MatcherAssert.assertThat("The actual number is greater than 45.", true);
        } else {
            log.error("testGetClassNumber: The actual number = {} is less than 45.", actualNumber);
            MatcherAssert.assertThat("The actual number is less than 45.", false);
        }
    }

    @Test
    public void testGetClassString(){
        String actualText = Main.getClassString();
    }

}
