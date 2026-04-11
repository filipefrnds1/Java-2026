package exerciciosudemy.prograam;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramLists {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------");
        list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("-------------------------");

        list.add("Rosana");
        list.add("Filipe");
        list.add("Fernanda");
        list.add("Regina");
        list.add("Vanda");
        list.add("Mayumi");
        list.add("Alberto");
        list.add("Andrea");

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("--------------------------");


        List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());

        for(String res : result){
            System.out.println(res);
        }

        System.out.println("-------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        sc.close();
    }
}
