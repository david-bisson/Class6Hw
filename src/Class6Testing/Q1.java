package Class6Testing;

import org.testng.Assert;
import org.testng.annotations.*;

public class Q1 {

    public Q1() {
    }

    // Run once at the beginning of the test
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("Before all");
    }

    // Run once at the end of the test
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("After all");
    }

    // Run before each method
    @BeforeMethod
    public void runBeforeTestMethod() {
        System.out.println("@Before - run before @Test method");
    }

    // Run after each method
    @AfterMethod
    public void runAfterTestMethod() {
        System.out.println("@After - run after @Test method");
    }


    @Test
    public void isXandYnotEquals() {
        int x = 1;
        int y = 7;

        Assert.assertNotEquals(x, y);
    }

    @Test(priority = 3)
    public void print_letter_c() {
        System.out.println("C");
    }

    @Test(priority = 2)
    public void print_letter_b() {
        System.out.println("B");
    }

    @Test(priority = 1)
    public void print_letter_a() {
        System.out.println("A");
    }


}
