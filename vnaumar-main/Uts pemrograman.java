import java.util.Scanner;
public class MataKuliah {
    String Nama;
    int SKS;
    String Nilai;
    MataKuliah(String Nama, int SKS, String Nilai){
        this.Nama = Nama;
        this.SKS = SKS;
        this.Nilai = Nilai;        
    }   
    double getBobot() {
        double bobot;
        switch (Nilai.toUpperCase()) {
            case "A":
            bobot = 4.0;
            break;
            case "A-":
            bobot = 3.7;
            break;
            case "B+":
            bobot = 3.3;
            break;
            case "B":
            bobot = 3.0;
            break;
            case "B-":
            bobot = 2.7;
            break;
            case "C+":
            bobot = 2.3;
            break;
            case "C":
            bobot = 2.0;
            break;
            case "D":
            bobot = 1.0;
            break;
            default:
            bobot = 0.0;
            break;
        }       
        return bobot;        
    }    
    double hitungMutu(){
        return getBobot() * SKS;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Mata Kuliah: ");
        int Jumlah = input.nextInt();
        input.nextLine();        
        int totalSKS = 0;
        double totalMutu = 0;        
        for (int i = 1; i <= Jumlah; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            System.out.print("Nama Mata Kuliah: ");
            String nama = input.nextLine();   
            System.out.print("Jumlah SKS: ");
            int SKS = input.nextInt();
            input.nextLine();            
            System.out.print("Nilai Huruf: ");
            String Nilai = input.nextLine();
            MataKuliah mk = new MataKuliah(nama, SKS, Nilai);            
            totalSKS += SKS;
            totalMutu += mk.hitungMutu();
        }        
        double ips = totalMutu / totalSKS;
        System.out.println("\nTotal SKS = " + totalSKS);
        System.out.println("IPS Semester = " + ips);        
    }
}