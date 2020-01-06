package com.javafee.arrayvslinked;

import java.util.ArrayList;
import java.util.LinkedList;

public class Research {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        //researchAddIndexElement(arrayList, linkedList, 100);
        researchAdd(arrayList, linkedList, 10000000);
//        researchRemoveIndexElement(arrayList, linkedList, 100);
        researchGetIndexElement(arrayList, linkedList, 10000000);
    }

    // 1. Dodawanie elementu (metoda add(index, element)):
    //  - na początek;
    //  - na koniec.
    public static void researchAddIndexElement(ArrayList arrayList, LinkedList linkedList, long numberOfElements) {
        // Filling lists with values
        long numberOfElement = 0;
        while (numberOfElement < numberOfElements) {
            arrayList.add(1);
            linkedList.add(1);
            numberOfElement++;
        }

        ArrayList arrayListCopy = arrayList;
        LinkedList linkedListCopy = linkedList;

        System.out.println("Number of elements: " + numberOfElements);

        System.out.println("Adding first element measures ---------------------------");
        System.out.println("Research 1 [ArrayList] Adding first element measures");
        long startTime = System.nanoTime();
        arrayList.add(0, 1);
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("ArrayList [" + elapsedNanos + "ns]");

        System.out.println("Research 2 [LinkedList] Adding first element measures");
        startTime = System.nanoTime();
        linkedList.add(0, 1);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("LinkedList [" + elapsedNanos + "ns]");

        System.out.println("Adding last element measures ---------------------------");
        System.out.println("Research 3 [ArrayList] Adding last element measures");
        startTime = System.nanoTime();
        arrayListCopy.add(arrayList.size() - 1, 1);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("ArrayList [" + elapsedNanos + "ns]");

        System.out.println("Research 4 [LinkedList] Adding last element measures");
        startTime = System.nanoTime();
        linkedListCopy.add(linkedList.size() - 1, 1);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("LinkedList [" + elapsedNanos + "ns]");
    }

    // 2. Dodawanie wielu elementów (metoda add(element))
    public static void researchAdd(ArrayList arrayList, LinkedList linkedList, long numberOfElements) {
        // Filling lists with values
        System.out.println("Number of elements: " + numberOfElements);
        System.out.println("Adding elements measures ---------------------------");
        System.out.println("Research 1 [ArrayList] Adding elements measures");
        long numberOfElement = 0;
        long startTime = System.nanoTime();
        while (numberOfElement < numberOfElements) {
            arrayList.add(1);
            numberOfElement++;
        }
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("ArrayList [" + elapsedNanos + "ns]");

        System.out.println("Research 2 [LinkedList] Adding elements measures");
        numberOfElement = 0;
        startTime = System.nanoTime();
        while (numberOfElement < numberOfElements) {
            linkedList.add(1);
            numberOfElement++;
        }
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("LinkedList [" + elapsedNanos + "ns]");
    }

    // 3. Usuwanie elementu (metoda remove(index):
    //  - na początek;
    //  - na koniec.
    public static void researchRemoveIndexElement(ArrayList arrayList, LinkedList linkedList, long numberOfElements) {
        ArrayList arrayListCopy = arrayList;
        LinkedList linkedListCopy = linkedList;
        System.out.println("Number of elements: " + numberOfElements);
        System.out.println("Removing first element measures ---------------------------");
        System.out.println("Research 1 [ArrayList] Removing first element measures");
        long startTime = System.nanoTime();
        arrayList.remove(0);
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("ArrayList [" + elapsedNanos + "ns]");

        System.out.println("Research 2 [LinkedList] Removing first element measures");
        startTime = System.nanoTime();
        linkedList.remove(0);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("LinkedList [" + elapsedNanos + "ns]");

        System.out.println("Removing last element measures ---------------------------");
        System.out.println("Research 3 [ArrayList] Removing last element measures");
        startTime = System.nanoTime();
        arrayListCopy.remove(arrayList.size() - 1);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("ArrayList [" + elapsedNanos + "ns]");

        System.out.println("Research 4 [LinkedList] Removing last element measures");
        startTime = System.nanoTime();
        linkedListCopy.remove(linkedList.size() - 1);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("LinkedList [" + elapsedNanos + "ns]");
    }

    // 3. Pobieranie elementu (metoda get(index)):
    //  - na początek;
    //  - na koniec.
    public static void researchGetIndexElement(ArrayList arrayList, LinkedList linkedList, long numberOfElements) {

        ArrayList arrayListCopy = arrayList;
        LinkedList linkedListCopy = linkedList;

        System.out.println("Number of elements: " + numberOfElements);

        System.out.println("Getting first element measures ---------------------------");
        System.out.println("Research 1 [ArrayList] Getting first element measures");
        long startTime = System.nanoTime();
        arrayList.get(0);
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("ArrayList [" + elapsedNanos + "ns]");

        System.out.println("Research 2 [LinkedList] Getting first element measures");
        startTime = System.nanoTime();
        linkedList.get(0);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("LinkedList [" + elapsedNanos + "ns]");

        System.out.println("Getting last element measures ---------------------------");
        System.out.println("Research 3 [ArrayList] Getting last element measures");
        startTime = System.nanoTime();
        arrayListCopy.get(arrayList.size() - 1);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("ArrayList [" + elapsedNanos + "ns]");

        System.out.println("Research 4 [LinkedList] Getting last element measures");
        startTime = System.nanoTime();
        linkedListCopy.get(linkedList.size() - 1);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("LinkedList [" + elapsedNanos + "ns]");
    }

}
