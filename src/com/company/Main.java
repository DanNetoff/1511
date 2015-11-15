package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("RED","GREEN","BLUE" );
        Collections.sort(list1);

        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);

        String gg ;
        gg.compareTo();
        List<String> list2 = Arrays.asList("green","red", "yellow", "blue");
        Collections.sort(list2, Collections.reverseOrder());

        System.out.println(list2);





    }
}
