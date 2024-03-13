package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {
/*
if(condition){
//Code to be executed if the condition is true!
*/

        if (true) {
            System.out.println("This code is executed!");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");

        }
        if (x > 12) {
            System.out.println("x is greater than 12");
        }
        boolean isSpring = false;
        if (isSpring) {
            System.out.println("It Is Spring");
        }
        //Child <=12;
        //Teenager=>13&<=19;
        //Adult=>20&<=59;
        //Else: Senior;

        int age = 25;
        if (age <= 12) {
            System.out.println("This is child!");
        } else {
            System.out.println("Something else!");
        }
        //IF-ELSE-IF-ELSE
        if (age <= 12) {
            System.out.println("This is child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is adult!");

        } else {
            System.out.println("This is senior!");
        }
        //Write a Java program that checks if a given number is pozitive, negative,or zero.
        //Step 1 : define variable (int number=10);
        //Step 2: Create logic;
        //Step 3:For each condition print out message( is positive, is negative, is zero);

        int number = 0;
        if (number == 0) {
            System.out.println("This is zero!");
        } else if (number > 0) {
            System.out.println("This is pozitive number!");
        } else if (number < 0) {
        }
        System.out.println("This is a negative number!");

        //Write a Java program that datermines the time of the day based on given hour:
        //If the hour is between 0 and 11, will print : Good morning;
        //if the hour is between 12 and 17, will print : Good day;
        //if the hour is between 18 and 23 , will print: Good evening;
        //In all other cases should say that : Invalid hour provided;

        int hour = 25;
        if (hour >=0 && hour <= 11) {
            System.out.println("Good morning");
        } else if (hour >=12 && hour <=17) {
            System.out.println("Good day");
        } else if (hour >=18 && hour <=23) {
            System.out.println("Good evening;");
        } else {
            System.out.println("Invalid hour provided");
        }




    }
}