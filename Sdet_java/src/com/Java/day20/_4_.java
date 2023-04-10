package com.Java.day20;

public class _4_ {
    public static void main(String[] args) {


      tex1:  for (int i = 0; i < 10; i++) {

         tex2:   for (int j = 0; j <10 ; j++) {

                if (i==3){
                    System.out.println("j="+j);
                    break tex1;
                }

            }

        }


    }
}
