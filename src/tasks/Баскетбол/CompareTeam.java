package tasks.Баскетбол;

import java.util.Scanner;

public class CompareTeam {

    private int[] massive;

    public CompareTeam() {

        massive = new int[8];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 7; i++) {

            massive[i] = scanner.nextInt();

        }

    }

    public void compareSumValue() {

        int result_team_1 = 0;
        int result_team_2 = 0;

        for (int i = 0; i <= 7; i += 2)
            result_team_1 += massive[i];

        for (int i = 1; i <= 7; i += 2)
            result_team_2 += massive[i];


        if (result_team_1 > result_team_2)
            System.out.println(1);
        else if (result_team_1 < result_team_2)
            System.out.println(2);
        else
            ReturnDraw();


    }

    public void ReturnDraw() { System.out.println("DRAW"); }
}
