package generalstore.hooks;

import generalstore.utils.ConfigReader;
import generalstore.utils.Driver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;


public class Hooks {
    @BeforeAll
    public static void beforeAll() {
        Driver.serverBaslat(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));
    }

//    @Before
//    public void setUp() {
//    }

    @After
    public static void tearDown() {
        Driver.uygulamayiKapat();

    }

    @AfterAll
    public static void afterAll() {
        Driver.serverKapat();
    }
}
