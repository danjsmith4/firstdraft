/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstdraft;

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aelek
 */
public class MainFrameTest {
    
    public MainFrameTest() {
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

    /**
     * Test of CreateHost method, of class MainFrame.
     */
    @Test
    public void testCreateHost() {
        System.out.println("CreateHost");
        String name = "host1";
        MainFrame instance = new MainFrame();
        instance.CreateHost(name);
        assertEquals(instance.hostMap.containsKey("host1"), true);
        
    }

    /**
     * Test of CreateSwitch method, of class MainFrame.
     */
    @Test
    public void testCreateSwitch() {
        System.out.println("CreateSwitch");
        String name = "switch1";
        MainFrame instance = new MainFrame();
        instance.CreateSwitch(name);
        assertEquals(instance.switchMap.containsKey("switch1"), true);
        
    }

    /**
     * Test of CreateHub method, of class MainFrame.
     */
    @Test
    public void testCreateHub() {
        System.out.println("CreateHub");
        String name = "hub1";
        MainFrame instance = new MainFrame();
        instance.CreateHub(name);
        assertEquals(instance.hubMap.containsKey("hub1"), true);
        
    }

    /**
     * Test of getHostCord method, of class MainFrame.
     */
    @Test
    public void testGetHostCord() {
        System.out.println("getHostCord");
        String hname = "host2";
        MainFrame instance = new MainFrame();
        instance.hostListUpdate.addElement(hname);
        int expResult = 30;
        int result = instance.getHostCord(hname);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetHostCord2() {
        System.out.println("getHostCord");
        String hname = "host2";
        String hname2 = "host3";
        MainFrame instance = new MainFrame();
        instance.hostListUpdate.addElement(hname);
        instance.hostListUpdate.addElement(hname2);
        int expResult = 64;
        int result = instance.getHostCord(hname2);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSwitchCord method, of class MainFrame.
     */
    @Test
    public void testGetSwitchCord() {
        System.out.println("getSwitchCord");
        String hname = "switch2";
        MainFrame instance = new MainFrame();
         instance.switchListUpdate.addElement(hname);
        int expResult = 30;
        int result = instance.getSwitchCord(hname);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSwitchCord2() {
        System.out.println("getSwitchCord");
        String hname = "switch2";
        String hname2 = "switch3";
        MainFrame instance = new MainFrame();
        instance.switchListUpdate.addElement(hname);
        instance.switchListUpdate.addElement(hname2);
        int expResult = 64;
        int result = instance.getSwitchCord(hname2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getHubCord method, of class MainFrame.
     */
    @Test
    public void testGetHubCord() {
        System.out.println("getHubCord");
        String hname = "hub2";
        MainFrame instance = new MainFrame();
         instance.hubListUpdate.addElement(hname);
        int expResult = 30;
        int result = instance.getHubCord(hname);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetHubCord2() {
        System.out.println("getHubCord");
        String hname = "hub2";
        String hname2 = "hub3";
        MainFrame instance = new MainFrame();
        instance.hubListUpdate.addElement(hname);
        instance.hubListUpdate.addElement(hname2);
        int expResult = 64;
        int result = instance.getHubCord(hname2);
        assertEquals(expResult, result);
    }

    /**
     * Test of paintHostSwitch method, of class MainFrame.
     */
    @Test(expected=NullPointerException.class)
    public void testPaintHostSwitch() {
        System.out.println("paintHostSwitch");
        Graphics g = null;
        int hostY = 0;
        int switchY = 0;
        MainFrame instance = new MainFrame();
        instance.paintHostSwitch(g, hostY, switchY);
        // TODO review the generated test code and remove the default call to fail.
        fail("Unable to see JPanel in Test Mode.");
    }

    /**
     * Test of paintHubSwitch method, of class MainFrame.
     */
    @Test (expected=NullPointerException.class)
    public void testPaintHubSwitch() {
        System.out.println("paintHubSwitch");
        Graphics g = null;
        int hubY = 0;
        int switchY = 0;
        MainFrame instance = new MainFrame();
        instance.paintHubSwitch(g, hubY, switchY);
        // TODO review the generated test code and remove the default call to fail.
        fail("Unable to see JPanel in Test Mode.");
    }

    /**
     * Test of paintHostHub method, of class MainFrame.
     */
    @Test(expected=NullPointerException.class)
    public void testPaintHostHub() {
        System.out.println("paintHostHub");
        Graphics g = null;
        int hostY = 0;
        int hubY = 0;
        MainFrame instance = new MainFrame();
        instance.paintHostHub(g, hostY, hubY);
        // TODO review the generated test code and remove the default call to fail.
        fail("Unable to see JPanel in Test Mode.");
    }

    /**
     * Test of main method, of class MainFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainFrame.main(args);
    }
    
}
