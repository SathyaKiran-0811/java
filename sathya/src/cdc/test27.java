package cdc;
import java.util.*;

public class test27 {
    public static void main(String[] args) {
        List<Object> l1 = new ArrayList<Object>();
        l1.add(12);
        l1.add(35);
        l1.add(87);

        List<Object> l2 = new ArrayList<Object>();
        l2.add(47);
        l2.add(98);
        l2.add(23);
        l2.add(56);
        l2.add(null); 
        l2.addAll(l1);
        System.out.println(l2);
    }
}
