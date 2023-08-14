package com.Java.day23;

public class _5_ {
    public static void main(String[] args) {

            main("ismet", "bilal", "semra");
            //Main methodunu overloading yaptik

        }

        public static void main(String str1){
            System.out.println("str1 = " + str1);
        }

        public static void main(String str1, String str2){
            System.out.println("str1 + str2 = " + str1+str2);
        }
        public static void main(String str1, String str2, String str3){
            System.out.println("str1 + str2 + str3 = " + str1+str2+str3);
        }
    }


