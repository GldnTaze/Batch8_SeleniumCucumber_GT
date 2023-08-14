package com.Java.day57;

import java.util.List;
import java.util.Stack;

public class stream_lamda {
    public static void main(String[] args) {
        List<String>sehirler=new Stack<>();
        sehirler.add("istanbul");
        sehirler.add("izmir");
        sehirler.add("bolu");
        sehirler.add("urfa");
        sehirler.add("antep");
        sehirler.add("diyarbakir");
        sehirler.stream().filter(a->a.length()>5).forEach(a-> System.out.println(a));
    }
}
