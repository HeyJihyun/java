package kr.ac.kopo.day05.practice;

public class ExamMain06 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
