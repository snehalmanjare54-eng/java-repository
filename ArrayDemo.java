package Assig1;

import java.util.*;

class ArrayDemo {
    public static void main(String args[]) {
        int a[] = {40, 10, 30, 20, 50};
        int sum = 0;

        for(int x : a)
            sum = sum + x;

        Arrays.sort(a);

        System.out.println("Sum = " + sum);
        System.out.println("Ascending order:");

        for(int x : a)
            System.out.print(x + " ");
    }
    
}