package BitPanda.WebUI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestCreateAccount extends TestMethods {

    @BeforeClass
    public void setUpClass() {
        sStartBrowser();
    }

    @Test
    public void mainTestCase() throws InterruptedException {
        signUp();
    }

    @AfterClass
    public void tearDownClass() {
        sStopBrowser();
    }

}
