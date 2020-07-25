package Tri.Abstract;

import java.util.ArrayList;
import java.util.List;

public   abstract  class Tri {
    public   List<Integer> triBulles(List<Integer> suite) {
        return new ArrayList<>();
    }
    public  Integer[] triBullesTable(Integer[] suite) {
        return new Integer[suite.length];
    }

    public void printTable(Integer[] suite) {
        List.of(suite).stream().forEach(System.out::println);
    }
}
