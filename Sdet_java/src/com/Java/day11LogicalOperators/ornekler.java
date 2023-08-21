package com.Java.day11LogicalOperators;

public class ornekler {
    public static void main(String[] args) {

        //   && VE

        //bizim okula 3 yasindan buyuk ve 15 yasindan kucukolanlari kaydediyoruz
        // ogr>=3
        // ogr<=15
        //
      //  (org>=3 && ogr<=15)  boolean true false
        //ogr 3 yasind ve 15 yasindan kucuk mu
      //  (sayi==3 && sayi==5 && sayi== 7) asal sayi olma durumu


        int x;
        x=6;
        System.out.println(x<5 && x <10); //FALSE bir sarti saglamiyorsa false cikar ikisinide sagliyorsa true

        //  VEYA isareti (||)

        x=7;

        System.out.println(x<5 || x<10);   //veya durumunda sartlardan birinin saglanmasiyla treu donemr.


        x=3;

        System.out.println(x <=100|| x>=15|| x==3 ); //treu

        System.out.println(x<=100|| x>=15 && x==4);  // false

        x=35;
        System.out.println(x<20|| x<=12 || x>15 && x==35);

        //burada islem oncelik onemli degil sonuca gidilmesionemli

        int sayi=40;
        System.out.println(sayi<=30 || sayi==41 && sayi>=45);

        /*
        true && true  -> true
        true && false --> false
        false && true --> false
        false && false--> false

        && --> sartlardan biri false sonuc false
         */

        //ISLEM ONCELIGI

      //  Eger ve && varsa oncelik onundur.operatorlerde de parantez ile belirtmediginiz surece
      //DEFAULT olarak oncelikleri yapar. && || den once gelir
        //&& operatoru islmein saginda vesolundaki oncelikli olur

        System.out.println(sayi<=50|| (sayi==41 && sayi >=45));




        /*
         OPERATION RESULT
         || veya

         true || true ----> true
         true ||treu ---> true
         false || false --->true
         false || false -->false
         */

        // (!)NOT DEGILI , olmayani gibi anlamlarda kullanilan operator(!)


        int y;
        y=12;
        System.out.println((y<=20 && y >=4));   //-->true                 // (12 olamayan sayilar)


         System.out.println(!(y<=20 && y >=4));  //  ! degil ise // false

       // SARTIN DEGILI --> tanimlanan sinirda haraketle tanimlanamayan kismi ifade etmeye yarar


        // LOGIC OPERATOR -->sartlarin degerlendirilmesi

        int num1=20;
        int num2=68;

        //  -->   || , &&, !

        System.out.println(!(4>=num1/num2 && num1*num2<=600) || num2>num1 || num1+num2==3);  //-->true




















    }
}
