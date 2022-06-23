package tasks.Unix;


import java.util.ArrayList;
import java.util.Scanner;

public class TranslatorValue {

    private ArrayList<Integer> arrayList_1 = new ArrayList<>();
    private ArrayList<Integer> arrayList_2 = new ArrayList<>();


    public TranslatorValue() {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        initValue(a,b);

    }

    public void initValue(int a, int b) {

        while (a > 0) {

            arrayList_1.add(a % 10);
            a = a / 10;

        }
        arrayList_1.trimToSize();

        while (b > 0) {

            arrayList_2.add(b % 10);
            b = b / 10;

        }
        arrayList_2.trimToSize();

    }

    public int translatorSystemValue() {


        int a = 0;
        int b = 0;

        int count = 0;

        for (int i = 0; i <= arrayList_1.size() - 1; i++) {

            a += arrayList_1.get(i) * Math.pow(3,count);
            count++;

        }


        count = 0;

        for (int i = 0; i <= arrayList_2.size() - 1; i++) {

            b += arrayList_2.get(i) * Math.pow(3,count);
            count++;

        }


        return sumValue(a,b);
    }

    public int sumValue(int a, int b) { return a + b; }

}
