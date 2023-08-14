package com.Java.day20;

public class _1_ {
    public static void main(String[] args) {
        // the number ıst 14
        //the number ıst 105

        int sum= 0, number=0;
        boolean kontrol=true;

      while (kontrol){
          number++;
          if (sum < 100) {
              sum += number;
          }else {
              number--;
              kontrol = false;
          }

      }
        System.out.println("The number is " + number);

        System.out.println("The sum is " + sum);
    }
}
