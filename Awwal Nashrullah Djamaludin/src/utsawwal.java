/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class utsawwal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah Matkul:");
        
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        
        float totalMutu = 0;
        int totalSks = 0;
        
        for(int i=0;i<jumlah;i++){
            
            Matkul m = new Matkul();
            
            System.out.println("\nMatkul ke-" + (i+1));
            
            System.out.print("Nama: ");
            m.nama = sc.next();
            
            System.out.print("SKS: ");
            m.sks = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Nilai huruf: ");
            m.nilai = sc.next();
            
            float mutu = m.bobotNilai()* m.sks;
            
            totalMutu += mutu;
            totalSks  += m.sks;
            
            float ips = totalMutu / totalSks;
            
            System.out.println("Total SKS: " + totalSks);
            System.out.println("Total Mutu: " + totalMutu);
            System.out.println("Indeks Prestasi Semester: " + ips);
        }
    }
    
}
