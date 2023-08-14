package com.Java.day16ternaryOperatirs;

public class _5_ {
    public static void main(String[] args) {
        int score=45;
        String aldiginot;
        if (score>=90){
            aldiginot="notunuz A";
            System.out.println(aldiginot=" notunuz A ");
        }else if (score>=80){
            aldiginot="notunuz B";
            System.out.println("aldiginot = " + aldiginot);
        } else if (score>=70) {
            aldiginot="aldigi not C ";
            System.out.println("aldiginot = " + aldiginot);

        } else if (score>=60) {
            aldiginot=" aldigi not D ";
            System.out.println("aldiginot = " + aldiginot);

        } else if (score>=50) {
            aldiginot=" notunuz E ";
            System.out.println("aldiginot = " + aldiginot);

        } else  {
            aldiginot="notunuz F ; dersten kaldiniz";
            System.out.println("aldiginot = " + aldiginot);

        }
        aldiginot=score>90? "notunuz A":
                         score>=80?"notunuz B":
                                 score>=70 ? "notunuz C":
                                         score>=60 ?"notunuz D ":
                                                 score>=50?" notunuz E":
                                                         "notunuz F ; dersten kaldiniz";
        System.out.println("aldiginot = " + aldiginot);



    }
}
