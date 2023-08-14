package com.Java.day12IfStatement;

public class ifElse {
    public static void main(String[] args) {

        int sayi = -4;
        if (sayi == 0)
            System.out.println("sayi sifirdir");

        if (sayi < 0)
            System.out.println("sayi negatiftir");
        if (sayi < 0)
            System.out.println("sayi pozitiftir");

        // bir degerin kosullarin saglamasi icn if statement kullaniyoruz
        //bu kosulun disinda kalan durumu ifade eden durum nasil olur
        //diger durumlari ifade etmek icin ELSE KULLANIRIZ
        //yani degilini ifade  eder


        int orgKayit = 23;//ilk okul ogrenci kayiti icin
        if (orgKayit > 7 && orgKayit < 15) {

            System.out.println("ilkOgretimeKayitYaptirabilir");
        }
        else  //if kosulu gibi suslu parantezle calisir

        {


            System.out.println("kayit yaptiramayan");


            double balance=150;
            int score=5;
            double taxAvarage=0.20;
            int income=5000;

            //kisinin gelir seviyesi net olarak 3000 uzerinde ise kayit yaptira bilir
            //net icin sadece gelirden vergiyi odeyin

            if ((income-=income*taxAvarage)>=3000){

                System.out.println("kayitYaptirabilir");
            } //output: kayit yaptira bilir
            else
            {
                System.out.println("gelir arttirilmalidir");

             // baska bir kosulu ayni main icerisinde test ede biliriz

                if (balance>=income){
                    System.out.println("asgari yasamin uzerinde dir");
                }
                else {

                    System.out.println("yoksultur");
                    if (score==4){
                        System.out.println("basarili sayilmktatir");
                    }
                    else {
                        //her else kendinden once if kosulunun disindaki tum kosullari ifade eder.
                    }

                    //DEGIL ISE -->gelir dengesi 100 uzerinden buyuk degil ise

                    if (!(balance*taxAvarage>10)) {
                        income = 2000;
                        int support = 1200;
                        income += support;
                        int totallIncome = income;
                        System.out.println("totallIncome = " + totallIncome);
                    }

                        else{ // yani denge seviyesi 100 den buyuk haline doner
                        System.out.println(score);

                        }
                        score++;
                    System.out.println("yeterlidir, cunku score degeri="+score);



                    }
                }

            }



}




    }


