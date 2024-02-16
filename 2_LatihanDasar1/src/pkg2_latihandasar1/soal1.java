package pkg2_latihandasar1;

//librari untuk menginpor class scanner untuk melakukan sebuah inputan
import java.util.Scanner;

public class soal1 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //pendeklarasian 
        double bil1, bil2, bil3;
        double penjumlahan, pengurangan, perkalian, pembagian; 
        
        //input bilangan ke-1
        System.out.println("input bilangan ke-1");
        bil1 = scanner.nextDouble();
        
        //input bilangan ke-2
        System.out.println("input bilangan ke-2");
        bil2 = scanner.nextDouble();
        
        //input bilangan ke-3
        System.out.println("input bilangan ke-3");
        bil3 = scanner.nextDouble();
        
        //operasi dari penjumlahan
        penjumlahan = bil1 + bil2 + bil3;
        System.out.println("hasil dari penjumlahan = " + penjumlahan);
        
        //operasi dari pengurangan
        pengurangan = bil1 - bil2 - bil3;
        System.out.println("hasil dari pengurangan = " + pengurangan);
        
        //operasi dari perkalian
        perkalian = bil1 * bil2 * bil3;
        System.out.println("hasil dari perkalian = " + perkalian);
        
        //operasi dari pembagian
        pembagian = bil1 / bil2 / bil3;
        System.out.println("hasil dari pembagian = " + pembagian);
        
    }
    
}
