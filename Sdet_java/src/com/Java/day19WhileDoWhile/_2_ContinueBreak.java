package com.Java.day19WhileDoWhile;

public class _2_ContinueBreak {
    public static void main(String[] args) {

        byte x=4;
        for (;x<=13;x++){
            if (x==8){
                System.out.println("sihirli sayiyi buldunuz");
              //  x=15;  //bu degerle bir break yaptim
                break; // kosul saglanmasi durunda break sadece kendisinden onceki adimlari yazdirir
                       // kendisinden sonraki for dongusunu kirar
            }
            System.out.println("x="+x);
        }

        int y=6;
        for (; y<=11; y++){
            if (y%8==0){  //burada  y==8 farkli yazilis
                System.out.println("sayiyi buldunuz");
                y=22;
                break;
                //continue;  //ATLAMA ISLEMI YAPARkendisinden sonraki FOR dongusu icindeki STATEMENT lari atlar
            }
            System.out.println("y="+y);
        }


    }
}
