package com.o2.co.uk.Accessory.Tests;

import com.o2.co.uk.Accessory.Utility.Helper;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by ee on 20/05/16.
 */
public class AccessoryTest {

    @BeforeClass
    public void setUp()
    {

    }
    @Test
    public void accTest() throws Exception {
        WebDriver driver = new FirefoxDriver();
        Helper.setExcelFile("/home/ee/accessoryredirects .xlsx","Brand Pages");
        String URL;
        for(int row =1; row<10;row++)
        {
            for(int col=0;col<1;col++)
            {
               URL= Helper.getCellData(row,col);
                driver.get(URL);

                Helper.setCellData("resrule",1,3);
            }
        }
       // String URL= Helper.getCellData(1,0);
       // System.out.println(URL);

      //  driver.get("http://accessoryshop.o2.co.uk/brands/krusell");
    }

    @AfterClass
    public void cleanUp()
    {

    }
}
