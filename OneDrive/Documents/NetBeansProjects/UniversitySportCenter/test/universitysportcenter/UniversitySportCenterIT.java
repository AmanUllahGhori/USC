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
public class UniversitySportCenterIT {
    
    public UniversitySportCenterIT() {
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
    public void testUniversitySportCenter() {
        System.out.println("UniversitySportCenter");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.UniversitySportCenter();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UniversitySportCenter.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsertData() {
        System.out.println("InsertData");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.InsertData();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDashBoardData() {
        System.out.println("DashBoardData");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.DashBoardData();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCurrentPurchaseExercises() {
        System.out.println("CurrentPurchaseExercises");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.CurrentPurchaseExercises();
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateExercise() {
        System.out.println("UpdateExercise");
        int UpdateId = 0;
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.UpdateExercise(UpdateId);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCurrentAvailableExercises() {
        System.out.println("CurrentAvailableExercises");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.CurrentAvailableExercises();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPurchaseExercise() {
        System.out.println("PurchaseExercise");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.PurchaseExercise();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPurchaseExerciseByDay() {
        System.out.println("PurchaseExerciseByDay");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.PurchaseExerciseByDay();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPurchaseExerciseByName() {
        System.out.println("PurchaseExerciseByName");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.PurchaseExerciseByName();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaxEarning() {
        System.out.println("MaxEarning");
        UniversitySportCenter instance = new UniversitySportCenter();
        instance.MaxEarning();
        fail("The test case is a prototype.");
    }
    
}
