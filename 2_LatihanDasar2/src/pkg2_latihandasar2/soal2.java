package pkg2_latihandasar2;

//librari untuk menginpor class scanner untuk melakukan sebuah inputan
import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //pendekrarasian variabel
        int rangking;
        boolean naikKelas, dapatHadiah;
        
        //menginput ranking
        System.out.println("masukan ranking anda :");
        rangking = scanner.nextInt();
        
        //menginput naik kelas
        System.out.println("apa anda naik kelas? true/false :");
        naikKelas = scanner.nextBoolean();
        
        //kondisi menggunakan if dan else 
        dapatHadiah = (rangking == 1) && naikKelas;
        if(dapatHadiah){
            System.out.println("selamat anda diberi hadiah");
        }else{
            System.out.println("anda tidak menerima hadiah");
        }
    }
    
}
