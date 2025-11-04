import java.util.Scanner;

public class ukl3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long faktorial = 1;

        System.out.println("masukan bilangan bulat positif:");
        n = input.nextInt();

        if (n < 0) {
            System.out.println("MAAF GK BISA DI HITUNG !");
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i;

            }
            System.out.println("Faktorial dari" + n + faktorial);

        }
        input.close();
    }

}
