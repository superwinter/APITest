package com.yahoo.ect.commontest;

import com.yahoo.asiamps.CommonTest.*;    
import org.testng.annotations.*;
import static org.testng.Assert.*;
import com.yahoo.testnglib.TMReporter.TM;   
                                        
public class MobileWebYQLTest extends WSTest {


    @Test(dataProvider="browseTestCase")
    @TM(isonetoone=true)    
    public void test(String tmdata, String testcasefile){
        executeTestCase(tmdata, testcasefile);
    }
}

