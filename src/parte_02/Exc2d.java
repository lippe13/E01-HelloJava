package parte_02;

import java.util.Scanner;

public class Exc2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua nota: ");

        int num1 = scanner.nextInt();

        if(num1 < 40){
            System.out.println("F");
        } else if(num1 >= 40 && num1 <= 59){
            System.out.println("E");
        } else if(num1 >= 60 && num1 <= 69){
            System.out.println("D");
        } else if(num1 >= 70 && num1 <= 79){
            System.out.println("C");
        } else if(num1 >= 80 && num1 <= 89){
            System.out.println("B");
        } else if(num1 >= 90){
            System.out.println("A");
        }

        scanner.close();
    }
}