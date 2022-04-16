/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package universitysportcenter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shahr
 */
public class PurchaseExercisesIT {
    
    public PurchaseExercisesIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        PurchaseExercises instance = new PurchaseExercises();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        PurchaseExercises instance = new PurchaseExercises();
        instance.setName(name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        PurchaseExercises instance = new PurchaseExercises();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        PurchaseExercises instance = new PurchaseExercises();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        PurchaseExercises instance = new PurchaseExercises();
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 0;
        PurchaseExercises instance = new PurchaseExercises();
        instance.setPrice(price);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMembers() {
        System.out.println("getMembers");
        PurchaseExercises instance = new PurchaseExercises();
        int expResult = 0;
        int result = instance.getMembers();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMembers() {
        System.out.println("setMembers");
        int members = 0;
        PurchaseExercises instance = new PurchaseExercises();
        instance.setMembers(members);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDay() {
        System.out.println("getDay");
        PurchaseExercises instance = new PurchaseExercises();
        String expResult = "";
        String result = instance.getDay();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDay() {
        System.out.println("setDay");
        String day = "";
        PurchaseExercises instance = new PurchaseExercises();
        instance.setDay(day);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTime() {
        System.out.println("getTime");
        PurchaseExercises instance = new PurchaseExercises();
        String expResult = "";
        String result = instance.getTime();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String Time = "";
        PurchaseExercises instance = new PurchaseExercises();
        instance.setTime(Time);
        fail("The test case is a prototype.");
    }
    
}
