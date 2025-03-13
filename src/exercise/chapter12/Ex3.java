package exercise.chapter12;

import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> list = List.of("갈매기", "나비", "다람쥐", "라마");
        list.stream()
                .filter(s -> s.length() == 2)
                .forEach(System.out::println);
    }
}
