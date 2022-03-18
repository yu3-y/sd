import static org.junit.Assert.*;
import org.junit.*;
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore
public class sdtest {
    @Test
    public void addition() {
        assertEquals(3, 1 + 1);
    }
}
