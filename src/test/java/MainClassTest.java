import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import ru.softwareTesting.mobile.MainClass;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass main = new MainClass();
        int expectedNumber = 14;
        int actualNumber = main.getLocalNumber();

        MatcherAssert.assertThat(
                String.format("Error in comparing two values. Expected value = %s , actual value = %s",
                        expectedNumber, actualNumber),
                actualNumber,
                Matchers.is(expectedNumber));
    }


}
