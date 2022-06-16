package tasks.Два_Бандита;

import java.util.Arrays;
import java.util.Scanner;


public class Gangsters {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CountJar countJar = new CountJar();


        Arrays.stream(countJar.countJarGangster(scanner.nextInt(), scanner.nextInt())).forEach(e -> System.out.print(e + " "));

        countJar = null;



    }
}

