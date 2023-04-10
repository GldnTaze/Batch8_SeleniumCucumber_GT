package com.Java.day26.person;

public class person {

   String name;
   String surname;
   int age;
   int id;
   public void getBirthYear()
   {
      int simdikiYil=2023;
      int simdikiYasi=age;
      System.out.println(name+" Dogum yili : "+(simdikiYil-simdikiYasi));
   }
   public void getVerifyId(int num){
      int birler=num%10;
      int ilkBasamak=0;
      while (num>=10){
         num=num/10;
         ilkBasamak=num;
      }
      if (ilkBasamak==birler){
         System.out.println("ilk ve son basamak aynidir");
      }else {
         System.out.println("ilk ve son basamak farklidir");
      }
   }

   public void kisiBilgileri(){

      System.out.println("Adi : "+name+"\nSoyadi : "+surname+"\nYasi: "+age+"\nId NO :"+id);
   }

}


