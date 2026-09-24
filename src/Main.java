public class Main {

    public static void main(String[] args){

        //this is my first Java program

        /*
        * this a
        * multiline
        * comment
        * in java
        * */

        //uncomment this to see the result
//        System.out.println("I like coding");
//        System.out.println("I like java");
//        System.out.println("Teach me Java");
//        System.out.println("shortcut");



        // int

        int age = 19;
//        int year = 2026;

        //uncomment this to see the result
        //System.out.println("We are in " + year);
        //System.out.println("I am " + age);

        double price = 19.99;
//        double gpa = 3.5;
//        double temperature = -12.5;

        //uncomment this to see the result
        //System.out.println("$" + price);
        //System.out.println(gpa);
        //System.out.println("the temperature degree is " + temperature);

//        char grade = 'B';
//        char symbol = '?';
        char currency = '$';

        //uncomment this to see the result
//        System.out.println(grade);
        //System.out.println(symbol);
        //System.out.println(currency);

        boolean isTeacher;

        if (age < 18) {
            isTeacher = false;
//            System.out.println("You are not a teacher");
        } else if (age >= 18 && age < 19) {
            isTeacher = true;
//            System.out.println("You are a teacher");
        }

        String name = "G. Kevin";
        String food = "Pizza";

        System.out.println("Hey " + name + " your food is " + food + " which is " + currency + price);
        System.out.println("Hey your " + age + " years old ");

    }
}
