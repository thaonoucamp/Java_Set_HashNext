package myPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        // Su dung tinh da hinh;
        Set<String> set = new HashSet<String>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("d");

        for (String string : set) {
            System.out.println(string);
        }

        System.out.println("---");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);

            if (s.equals("a")) {
                itr.remove();
            }
        }
        System.out.println("---");

//        set.remove("a");

        for (String string : set) {
            System.out.println(string);
        }
    }
}
// Tap hop phan tu duy nhat trong Mang; gop item giong nhau thanh 1;

// Sap xep theo thu tu tang dan;

// Ko co index truyen remove(obj);

// Ham (hasNext) ko tu sap xep;