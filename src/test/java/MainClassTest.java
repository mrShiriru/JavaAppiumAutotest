
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
                String.format("Error in comparing two values. Expected value = %d , actual value = %d",
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

        String expectedSub1 = "hello";
        String expectedSub2 = "Hello";

        boolean result = actualText.contains(expectedSub1) || actualText.contains(expectedSub2) ;
        MatcherAssert.assertThat(String.format("The actual line does not contain the desired text, such as:%s, %s",
                        expectedSub1, expectedSub2),
               result, Matchers.is(true));
    }

}
