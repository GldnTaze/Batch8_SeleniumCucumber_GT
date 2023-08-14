package com.Java.day32ARRAYSseri;

public class _3_ornek {
    public static void main(String[] args) {
        int[]sayilar={12,34,54,65,66,3,54};
        String[] isimler=new String[4];
        isimler[1]="bilal";
        isimler[3]="gulsah";

        // isimler[4]="hayriye"; hata alinmasina neden olur cunki 4 elemntli bir diziye 5 elementi yazmak istiyorsun
                                //elementler 0 dan baslar uzunluklar 1 den baslar

        String[] texler={"gulden","selim","ramazan","suheda","tazeoglu"};

        boolean[] evethayir={true,false,false,true};
        double[]  ranges={1.4,3.2,4.6,6.33,22.01};

        System.out.println("ranges.length = " + ranges.length);
     ;
        System.out.println("evetVeHayirlar = " + evethayir.length);
        System.out.println("texler = " + texler.length);


        for (int i = 0; i < texler.length; i++) {
            System.out.println("texler = " + texler[i]);

        }

        for (int i = 0; i < ranges.length; i++) {
            System.out.println("ranges = " + ranges[i]);

        }
        String name;
        name="isim";

        //       String[] adlar;
//        adlar=new String[12];
        String[]  adlar={"isim1","isim2"};


        String[] names={"Tazeoglu","ahmet","suleyman"};
        String[] isimler1={"element"};
        System.out.println("names = " + names.length);//element sayisini verir ve 1 den baslar
        System.out.println("names (ikinci index elementi) = " + names[2]);


    }
}
