package com.Java.day18nestedForloops;

public class _9_breakForLoop {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){

            if (i==4){
                //System.out.println("Burada kirilma olacak. ");
                // break;
                continue; // Burayi ES anlamindadir. (Buradaki sarti ATLA), kod calismaya devam eder.
                //FAKAT -->Buradaki DEVAM bu sarti yazdirmadan ilerle anlamindadir.
            }
            System.out.println(i);

        }

    }
}
