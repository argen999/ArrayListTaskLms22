package main;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add(i,random.nextInt(1,100) );
            if (arrayList.get(i) % 2 == 0) {
                arrayList1.add(arrayList.get(i));
            } else {
                arrayList2.add(arrayList.get(i));
            }
        }
        System.out.println("This is all number: "+arrayList);
        System.out.println("This is even number: "+arrayList1);
        System.out.println("This is exact number: "+arrayList2);



    }
}