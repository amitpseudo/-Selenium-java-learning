package com.example;

import org.junit.jupiter.api.Test;
import  org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen{

    @Test 
    public void check(){
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.selenium.dev/");
    }

}

