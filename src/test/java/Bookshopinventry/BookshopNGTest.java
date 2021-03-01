/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bookshopinventry;

import static org.testng.Assert.*;

/**
 *
 * @author Zubairul Islam
 */
public class BookshopNGTest {
    
    public BookshopNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of Connect method, of class Bookshop.
     */
    @org.testng.annotations.Test
    public void testConnect() {
        System.out.println("Connect");
        Bookshop1 instance = new Bookshop1();
        instance.Connect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Bookshop.
     */
    @org.testng.annotations.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bookshop1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
