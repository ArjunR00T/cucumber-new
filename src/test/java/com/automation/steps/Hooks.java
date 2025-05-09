package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        ConfigReader.init();
        DriverManager.init();
    }

    @After
    public void cleanUp() {
        DriverManager.getDriver().quit();
    }
}
