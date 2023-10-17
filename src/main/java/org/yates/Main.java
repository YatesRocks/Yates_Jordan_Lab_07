package org.yates;

public class Main {

    private static void partA() {
        System.out.println("Part 1");
        for (int i = 0; i <= 30; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Part 2");
        for (int i = 30; i >= 0; i--)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Part 3");
        for (int i = 0; i <= 18; i += 3)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Part 4");
        for (int i = 10; i >= 0; i -= 2)
            System.out.print(i + " ");
    }

    private static void partB() {
        System.out.print("Part 1");
        for (int x = 0; x <= 5; x++)
            System.out.println("*".repeat(x));
        System.out.println("\nPart 2");
        for (int x = 5; x >= 0; x--)
            System.out.println("*".repeat(x));
        System.out.println("\nPart 3");
        for (int x = 0; x < 5; x++)
            System.out.println("*".repeat(5));
        System.out.println();
    }

    private static void printJ(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (x == 0 || y == size / 2 || (x == size - 1 && y <= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        partB();
        printJ(6);
    }

}