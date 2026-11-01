package org.example;

public class Test {
    public static void main(String[] args) {
        System.out.println("This text is test!\n");
        System.out.printf("Hello and welcome!\n");
        System.out.printf("Testing create a new branch!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    public class StashTest {
        public void printStash() {
            System.out.println("Testing how stash stuff works!\n");

            System.out.println("Another made changed for fetch!\n");
        }

    }
}

