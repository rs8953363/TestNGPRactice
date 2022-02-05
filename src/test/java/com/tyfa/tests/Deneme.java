package com.tyfa.tests;

import com.tyfa.utilities.*;
import org.testng.annotations.*;

public class Deneme {

    @Test
    public void deneme(){
//To access a method from Driver class from this class without creating an object, the method should be both public and static
        Driver.getDriver();//You can call a static method from a non-static method.
        // But you cannot call a non-static method from a static method.
    }
    @Test
    public void deneme1(){
        Driver.getDriver();
    }
    @Test
    public void deneme2(){
        Driver.getDriver();
    }
}
