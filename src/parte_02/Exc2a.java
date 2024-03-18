package parte_02;

import java.util.Scanner;
class Exc2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");

        int num1 = scanner.nextInt();

        if(num1 % 2 == 0){
            System.out.println("O numero eh par");
        } else{
            System.out.println("O numero eh impar");
        }

        scanner.close();
    }
}