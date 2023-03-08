import java.util.Scanner;

//2. Написать метод, который определяет, является ли год високосным, и возвращает boolean 
//(високосный - true, не високосный - false). 
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year: ");
        int yaer=in.nextInt();
        boolean flag= yaer%4==0 || yaer%10==0 ^ yaer%400==0;
        System.out.println(flag);
    }

}
