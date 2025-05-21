package cdc;

import java.util.*;

public class test28 {
    public static void main(String[] args) {
        List<Object> l1 = new ArrayList<Object>();
        l1.add(12);         
        l1.add("hi");       
        l1.add(87);         
        l1.add(2, "hellow"); 
        System.out.println(l1); 

        List<Object> extra = Arrays.asList(9, 89, 90); 
        l1.addAll(extra); 

        System.out.println(l1.get(5)); 
        Object[] arr = l1.toArray();
        for (Object a1 : arr) {
            System.out.println(a1);
        }
    }
}
