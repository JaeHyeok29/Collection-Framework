package main.java.com.nhnacademy.example;

import java.util.ArrayList;
import java.util.List;

public class Example05 {
    public static void main(String[] args) {
        System.out.println("### list1 ###");

        List<String> list  = new ArrayList();
        list.add("red");
        list.add("green");
        list.set(0,"white");
        list.add("blue");

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("### remove white element ###");
        list.remove("white");

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // Contains 존재 여부를 확인 흰색은 위에서 삭제 되었으므로 false 나머지는 true
        System.out.println("### contains green element");
        System.out.println( list.contains("green") );

    }
}
