package com.Java.day30dateAndTime;

public class odev2 {
    public static void main(String[] args) {
     //   Verilen String icersindeki karakterlerin her bir karakterin kac kez tekrar ettigini veren programi yaziniz.

         int counter=0;
        String word="kertenkele";
        char harf=0;
        for (int j = 0; j < word.length(); j++) {
            counter=0;
            harf=word.charAt(j);
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i)==word.charAt(j)) {
                    counter++;
                }
            }System.out.println(harf+ " " +word +" nin icerisinde "+counter+" kez var");
        }
    }
}
