import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        if (withdraw % 100 == 0 && balance - withdraw >= 1000)
            System.out.println("Success");
        else
            System.out.println("Failed");
    }
}