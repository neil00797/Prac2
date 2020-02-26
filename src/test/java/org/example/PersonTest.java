package org.example;


import org.junit.*;

public class PersonTest {

    Person Neil, Brandon, Strauss;

    @Before
    public void setUp(){
        Neil = new Person("Neil");

        Brandon= new Person("Neil");

        Strauss = Neil;
    }



    @After
    public void tearDown(){}


    @Test
    public void testIdentity(){
        System.out.println(Neil.hashCode());
        System.out.println(Strauss.hashCode());

        Assert.assertTrue(Strauss==Neil);
    }

    @Test
    public void testEquality(){
        System.out.println(Neil.toString());
        System.out.println(Brandon.toString());

        Assert.assertTrue(Neil==Brandon);
    }

    @Test(timeout = 4000)
    public void testTimeout(){
        while (true){

        }
    }

    @Ignore
    @Test
    public void testIgbore(){
        while (true){

        }
    }
}
