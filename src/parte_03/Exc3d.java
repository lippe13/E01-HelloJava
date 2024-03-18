package parte_03;

import java.util.Scanner;

public class Exc3d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int i;
        int result = 1;

        System.out.print("Insira um numero: ");
        num1 = scanner.nextInt();

        for(i = num1; i >= 1; i--){
            result = result * i;
        }

        System.out.println("Fatorial de " + num1 + ": " + result);


        scanner.close();
    }
}
