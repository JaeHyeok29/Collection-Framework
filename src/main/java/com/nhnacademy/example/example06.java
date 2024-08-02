package main.java.com.nhnacademy.example;

import java.util.ArrayList;
import java.util.List;

public class example06 {
    private static final int ARRAY_MAX_SIZE = 10000000;
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int[] arr = new int[ARRAY_MAX_SIZE];
        for (int i = 0; i < ARRAY_MAX_SIZE; i++) {
            arr[i] = i;
        }
        long end = System.currentTimeMillis();
        long result = end-start;
        System.out.println("array-run-time" + result);

        start = System.currentTimeMillis();
        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < ARRAY_MAX_SIZE; i++) {
            arr2.add(i);
        }

        end = System.currentTimeMillis();
        result = end-start;

        System.out.println("arraylist-run-time" + result);
    }
}
/**
 * rrayList 가 Array비해서 할당되는 시간이 더 걸린다는것을 확인할 수 있습니다.
 * ArrayList 가 array에 비해서 15배이상 느림...
 * 실행결과는 대략적인 참고용.. PC 환경에 따라 다를 수 있음
 * 초로 변환하면 /1000
 */