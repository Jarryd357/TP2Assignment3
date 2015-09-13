/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.jpretorius.assignment3.CollectionInterface;
import com.jpretorius.assignment3.Impl.CollectionInterfaceImpl;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class CollectionInterfaceImplTest 
{
    
    public CollectionInterfaceImplTest() 
    {
        
    }

    @Test
    public void ListOfArrayTest() 
    {
        CollectionInterface collectionInterface = new CollectionInterfaceImpl();
        List result = collectionInterface.ListOfArray();
        System.out.println(result);
        
        List list = new ArrayList();
        list.add("January");
        list.add("February");
        list.add("March");

        Assert.assertEquals(list, result);
    }
    
    @Test
    public void ListOfMapTest() 
    {
        CollectionInterface collectionInterface = new CollectionInterfaceImpl();
        Map result = collectionInterface.ListOfMap();
        System.out.println(result);
        
        Map map = new HashMap();
        map.put("One", "January");
        map.put("Two", "February");
        map.put("Three", "March");
        Assert.assertEquals(map, result);
    }
    
    @Test
    public void ListOfHashTest() 
    {
        CollectionInterface collectionInterface = new CollectionInterfaceImpl();
        Set result = collectionInterface.ListOfHashSet();
        System.out.println(result);
        
        Set set = new HashSet();
        set.add("Bacon");
        set.add("Egg");
        set.add("Cheese");
        set.add("Toast");

        Assert.assertEquals(set, result);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
