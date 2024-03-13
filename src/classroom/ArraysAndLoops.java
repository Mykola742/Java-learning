package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        //Array
        //Bread;Milk;Eggs;Fruits;
        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};
        int[] grades = {7, 9, 10, 6, 5, 4};
        String[] seasons = {"Summer", "Winter", "Autumn", "Spring"};

        String eggs = shoppingList[2];
        System.out.println(eggs);
        System.out.println(grades[4]);
        grades[0] = 2;
        System.out.println(grades[0]);
        //Print all grades
        System.out.println(Arrays.toString(grades));

        //Create empty arry;
        int[] emptyArray = new int[4];
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));
        //Create String array with name;
        //Name count should be 5;
        //And print than all;
        String[] name = {"Kate", "Oleksandr", "Sandra", "Zana", "Mykola"};
        System.out.println(Arrays.toString(name));
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);

        //Create empty double array with size of 5;
        //Print empty array
        //Update each array value from 0 to number of you choice;
        //Print them all
        int[] emtyArray1 = new int[5];
        System.out.println(Arrays.toString(emtyArray1));
        emtyArray1[0] = 2;
        emtyArray1[1] = 3;
        emtyArray1[2] = 4;
        emtyArray1[3] = 5;
        emtyArray1[4] = 6;
        System.out.println(Arrays.toString(emtyArray1));

        double[] nombers = new double[5];
        System.out.println(Arrays.toString(nombers));
        nombers[0] = 1.1;
        nombers[1] = 2.2;
        nombers[2] = 3.3;
        nombers[3] = 4.4;
        nombers[4] = 5.5;
        System.out.println(Arrays.toString(nombers));

        //Print numbers from 0 to 10;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Calculate sum from 1 to 100;
        //Example: 1+2+3+4+n;
        int summa = 0;
        for (int i = 1; i <= 100; i++) {
            summa = summa + i;


        }
        System.out.println("Sum:" + summa);

        //for....
        for (String s : shoppingList) {
            System.out.println(s);

            //print numbers from 10 to 0;

            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
            int counter = 10;
            while (counter >= 0) {
                System.out.println(counter);
                counter = counter - 1;
            }

            for (int i = 2; i <= 100; i = i + 2) {
                System.out.println(i + "");
            }
            for (int i = 2; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");


                }
            }
        }
    }
}