package tugas.perulangan;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sisi1 = 0, sisi2 = 0, sisi3 = 0;

        int i = 0;
        while (i < 3) {
            System.out.print("Masukkan panjang sisi ke-" + (i + 1) + ": ");
            int sisi = scanner.nextInt();

            while (sisi <= 0) {
                System.out.println("Panjang sisi harus positif. Masukkan kembali:");
                sisi = scanner.nextInt();
            }
            switch (i) {
                case 0:
                    sisi1 = sisi;
                    break;
                case 1:
                    sisi2 = sisi;
                    break;
                case 2:
                    sisi3 = sisi;
                    break;
            }
            i++;
        }
        boolean isKubus = sisi1 == sisi2 && sisi2 == sisi3;

        System.out.println(isKubus ? "adalah Kubus" : "tidak Kubus");
    }
}
