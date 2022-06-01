
/** ***************************************************************************
 *
 * FILE:           Stairway2Heaven.java
 * DATE:           Sep 30, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How tall do you want the staircase to be?");
        int height = input.nextInt();
        int spaces = height;

        for (int x = 0; x < height; x++) {
            int stairs = x + 1;
            int a = 1;
            int b = 1;
            int c = 1;
            int d = 1;

            while (d < spaces) {
                System.out.print("    ");
                d++;
            }
            while (a <= stairs) {
                System.out.print("+---");
                a++;
            }
            System.out.print("+");
            System.out.println();

            while (b < spaces) {
                System.out.print("    ");
                b++;
            }
            while (c <= stairs) {
                System.out.print("|   ");
                c++;
            }
            System.out.print("|");
            System.out.println();
            spaces--;
        }
        int d = 1;
        while (d <= height) {
            System.out.print("+---");
            d++;
        }
        System.out.print("+");

    }

}
