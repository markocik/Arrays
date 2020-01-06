package com.javafee.arrayvslinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        List a2 = new LinkedList();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        a1.remove(2);
        a2.remove(2);
        a1.size();
        a2.size();
        for (Object element : a1) {
            System.out.println(element);
        }
        for (Object element : a2) {
            System.out.println(element);
        }
        a1.clear();
        a2.clear();


    }
}
