package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {
    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 25);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

        numerosDobrados.forEach(System.out::println);

    }
}
