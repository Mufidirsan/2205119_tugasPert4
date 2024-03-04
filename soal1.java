package tugas.perulangan;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        
        if (n <= 0){
            System.out.println("Inputan harus lebih besar dari 0");
        }else{
            for(int i = 1; i <= n; i++){
            System.out.println(i);
            }
        } 
    }  
}
