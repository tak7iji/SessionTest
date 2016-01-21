/*
 * Copyright (C) 2013-2015 terasoluna.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.sample.SessionTest.app.welcome;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.sample.SessionTest.app.FunctionTestSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/seleniumContext.xml" })
public class HomeControllerTest extends FunctionTestSupport {

    @Test
    public void test01_sessionData() {

        driver.findElement(By.id("sessionData")).click();
        
        assertThat(driver.findElement(By.id("sessionData")).getText(),
                is("sessionData"));
    }
    @Test
    public void test01_sessionData_wo_fh() {

        driver.findElement(By.id("sessionData_wo_fh")).click();
        
        assertThat(driver.findElement(By.id("sessionData_wo_fh")).getText(),
                is("sessionData"));
    }
    @Test
    public void test01_sessionData2() {

        driver.findElement(By.id("sessionData2")).click();
        
        assertThat(driver.findElement(By.id("sessionData2")).getText(),
                is("sessionData2"));
    }
    @Test
    public void test01_sessionData2_wo_fh() {

        driver.findElement(By.id("sessionData2_wo_fh")).click();
        
        assertThat(driver.findElement(By.id("sessionData2_wo_fh")).getText(),
                is("sessionData2"));
    }
    
    @Test
    public void test02_sessionDataClassName() {

        driver.findElement(By.id("sessionDataClassName")).click();
        
        assertThat(driver.findElement(By.id("sessionDataClassName")).getText(),
                is("Class: org.sample.SessionTest.app.welcome.SessionData"));
    }
    @Test
    public void test02_sessionData2ClassName() {

        driver.findElement(By.id("sessionData2ClassName")).click();
        
        assertThat(driver.findElement(By.id("sessionData2ClassName")).getText(),
                is("Class: org.sample.SessionTest.app.welcome.SessionData2"));
    }
    @Test
    public void test02_sessionData2ClassName2() {

        driver.findElement(By.id("sessionData2ClassName2")).click();
        
        assertThat(driver.findElement(By.id("sessionData2ClassName2")).getText(),
                is("Class: org.sample.SessionTest.app.welcome.SessionData2"));
    }

    @Test
    public void test02_sessionData2ClassName_wo_fh() {

        driver.findElement(By.id("sessionData2ClassName_wo_fh")).click();
        
        assertThat(driver.findElement(By.id("sessionData2ClassName_wo_fh")).getText(),
                is("Class: org.sample.SessionTest.app.welcome.SessionData2"));
    }
    @Test
    public void test02_sessionData2ClassName_wo_fh2() {

        driver.findElement(By.id("sessionData2ClassName_wo_fh2")).click();
        
        assertThat(driver.findElement(By.id("sessionData2ClassName_wo_fh2")).getText(),
                is("Class: org.sample.SessionTest.app.welcome.SessionData2"));
    }
    
    @Test
    public void test03_containsKey() {

        driver.findElement(By.id("containsKey")).click();
        
        assertThat(driver.findElement(By.id("containsKey")).getText(),
                is("OK"));
    }
    @Test
    public void test03_notnull() {

        driver.findElement(By.id("notnull")).click();
        
        assertThat(driver.findElement(By.id("notnull")).getText(),
                is("OK"));
    }
 
}
