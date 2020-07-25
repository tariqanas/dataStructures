package Pgcd;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProcessPGCD {

    static List<Integer> diviseurA = new ArrayList<>();
    static List<Integer> diviseurB = new ArrayList<>();
    static List<Integer> communDivs = new ArrayList<>();

    public static int thePgcd(int a, int b) {

        if (a == 0 || b == 0) { return OptionalInt.of(0).getAsInt(); }
        diviseurA = IntStream.rangeClosed(1, a).filter(el -> a % el == 0).boxed().collect(Collectors.toList());
        diviseurB = IntStream.rangeClosed(1, b).filter(el -> a % el == 0).boxed().collect(Collectors.toList());
        communDivs = diviseurA.stream().filter(el -> diviseurB.contains(el)).collect(Collectors.toList());
        OptionalInt max = communDivs.stream().mapToInt(Integer::valueOf).max();
        return max.getAsInt();
    }


    public static void main(String[] args) {
        System.out.println(thePgcd(100, 50));
    }

}
