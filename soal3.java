package tugas.perulangan;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        do {
            System.out.println("Masukkan panjang tiga sisi segitiga (a <= b <= c):");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if (a > b || b > c) {
                System.out.println("Panjang sisi tidak valid, masukkan kembali.");
            }
        } while (a > b || b > c);

        if (a * a + b * b == c * c) {
            System.out.println("Segitiga siku-siku");
        } else if (a * a + b * b < c * c) {
            System.out.println("Segitiga lancip");
        } else {
            System.out.println("Segitiga tumpul");
        }

    }
}

