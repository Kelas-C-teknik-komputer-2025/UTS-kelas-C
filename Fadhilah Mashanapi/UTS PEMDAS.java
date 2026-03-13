import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlahMK;
        int totalSKS = 0;
        double totalMutu = 0;
        
        System.out.println("Masukkan jumlah mata kuliah: ");
        jumlahMK = input.nextInt();
        input.nextLine();
        
        for (int i = 1; i <= jumlahMK; i++) {
            System.out.println("\nMata kuliah ke-" + i);
            System.out.println("Nama mata kuliah: ");
            String nama = input.nextLine();
            System.out.println("Jumlah SKS: ");
            int SKS = input.nextInt();
            input.nextLine();
            
            System.out.println("Nilai huruf (A/B/C/D/E): ");
            String nilai = input.nextLine();
            double bobot = 0;
            
            switch(nilai.toUpperCase()) {
                case "A" :
                bobot = 4.0;
                break;
                case "A-":
                bobot = 3.7;
                break;
                case "B+" :
                bobot = 3.3;
                break;
                case "B":
                bobot = 3.0;
                break;
                case "B-":
                bobot = 2.7;
                break;
                case "C+" :
                bobot = 2.3;
                break;
                case "C":
                bobot = 2.0;
                break;
                case "D":
                bobot= 1.0;
                break;
                case "E" :
                bobot = 0.0;
                break;
            }
            double mutu = bobot * SKS;
            
            totalSKS += SKS;
            totalMutu += mutu;
        }
        
        double ips = totalMutu / totalSKS;
        System.out.println("\nTotal SKS = " + totalSKS);
        System.out.println("IPS Semester = " + ips);
    }
}