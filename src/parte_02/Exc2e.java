package parte_02;

import java.util.Scanner;

public class Exc2e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 2 numeros(A e B): ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("A eh maior");
        } else if (num2 > num1){
            System.out.println("B eh maior");
        } else {
            System.out.println("Sao numeros iguais");
        }

        scanner.close();
    }
}