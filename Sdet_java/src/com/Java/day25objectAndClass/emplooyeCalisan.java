package com.Java.day25objectAndClass;

public class emplooyeCalisan {
    String name;
    String jobTitle;
    double salary;
    int workHours;


    public void wor(){
        emplooyeCalisan emplooye =new emplooyeCalisan();
        System.out.println(name+ "is work very hard");

    }
    public void introduce(){
        System.out.println("Employee`s name :"+name+"\n Job Title : "+jobTitle+ "\n Salary : "
                +salary+"\n Work Hours : "+workHours);
    }
}

class objectEmployee{
    public static void main(String[] args) {

        emplooyeCalisan employee=new emplooyeCalisan();//Burada bir nesne olusturduk

        employee.introduce();
        System.out.println();

        //Degiskenlere deger atadimz
        employee.workHours=8;
        employee.name="Ayse";
        employee.salary=5630.345;
        employee.jobTitle="Senior QA";

        //Method cagirdim
        employee.introduce();

    }
}
