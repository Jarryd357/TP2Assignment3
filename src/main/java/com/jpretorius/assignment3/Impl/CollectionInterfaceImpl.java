/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jpretorius.assignment3.Impl;

import com.jpretorius.assignment3.CollectionInterface;
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
public class CollectionInterfaceImpl implements CollectionInterface
{
    private List list1 = new ArrayList();
    private Map map1 = new HashMap();
    private Set set1 = new HashSet();
     
    public List ListOfArray()
    {
        list1.add("January");
        list1.add("February");
        list1.add("March");
        return list1;
    }
    
    public Map ListOfMap()
    {
        map1.put("One", "January");
        map1.put("Two", "February");
        map1.put("Three", "March");
        return map1;
    }
    
    public Set ListOfHashSet()
    {
        set1.add("Bacon");
        set1.add("Egg");
        set1.add("Cheese");
        set1.add("Toast");
        return set1;
    }
    
}
