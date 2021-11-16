package com.company;

public class Main {

    public static void main(String[] args) {
        String myText = "Progamming is amazing! No seriously.";
        System.out.println(myText.length());
        System.out.println(myText.charAt(0));
        System.out.println(myText.substring(0,7));
        System.out.println(myText.replace("ing is", "ers are"));

        int a = 'A';
        System.out.println(a);

        char b = 66;
        System.out.println(b);

        int myInt = 9;
        double myDouble = myInt; //automatic casting: into to a double

        System.out.println(myInt); // = 9
        System.out.println(myDouble); // = 9.0

        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2); // = 9.78
        System.out.println(myInt2); // = 9
    }
}
