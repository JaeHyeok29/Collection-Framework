package main.java.com.nhnacademy.example;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Example09 {
    private static List<String> list = new Vector<>(Arrays.asList("red", "blue", "white", "yellow"));
    /**
     * 원래는 아래와 같다.
     * private static List<String> list = new ArrayList<>(){{
     *         add("red");
     *         add("blue");
     *         add("white");
     *         add("yello");
     *     });
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                list.add("green");
                list.forEach(color -> {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("thread1:" + color);
                        }
                );
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                list.forEach(color -> {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thread2:" + color);
                });
            }
        });

        thread1.start();
        thread2.start();
    }
}
