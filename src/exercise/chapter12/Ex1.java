package exercise.chapter12;

import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> scores = List.of(45,76,38,27,50);
        Stream<Integer> si = scores.stream();
        si.map(i -> i + 10).forEach(System.out::println);
    }
}
