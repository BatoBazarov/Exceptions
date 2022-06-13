package lesson2;


import static lesson2.Method.getMethod;

public class Square {

    static String[][] negative1 = {{"4", "5", "7"}, {"1", "2", "5"}, {"6", "5", "2"}};
    static String[][] negative2 = {{"2", "2", "3", "4"}, {"5", "6", "2", "8"}, {"9", "7", "1", "t"}, {"3", "4", "1", "6"}};
    static String[][] positive = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "7", "1", "2"}, {"3", "4", "1", "6"}};


    public static void main(String[] args) {

        try {
            System.out.println("Array sum: " + getMethod(positive) + " - Right size");
        } catch (MyArraySizeException | MyArrayDataException ex) {}

        try {
            System.out.println("Array sum: " + getMethod(negative1));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println("Wrong size");
        }
        try {
            System.out.println("Array sum: " + getMethod(negative2));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println("One of the numbers is not a number");
        }
    }
}


