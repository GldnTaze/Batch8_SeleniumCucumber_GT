package com.Java.day36wrapperClasses;

public class _4_ornek {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
        //alphabetic degerleri yeni bir stringe atayip yazdiriniz.method kullaniniz

        System.out.println(newLetter(str));
    }
    public static String newLetter(String s){
        String newStr="";
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i)==' '){
                newStr=newStr+s.charAt(i);     //burada onune veya arkasina ne eklenirse string olarak algilar ve ekler
            }
        }
        return newStr;
    }
}
