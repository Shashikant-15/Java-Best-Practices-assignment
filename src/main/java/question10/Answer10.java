package question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Answer10 {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>(
                Arrays.asList("Ankit", "Deepak", "Harsh", "Krishna", "Vasudev", "Yadaav"));

        List<String> co = names.stream().sorted(
                Comparator.comparing(n -> n)).collect(Collectors.toList());

        System.out.println(co);

    }
}