
package pertemuan6;

import java.util.Scanner;

public class latihan25EjaanNama {
   
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nama
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();
        
        // Menampilkan ejaan setiap huruf
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
        
        scanner.close();
    }

}
