package projekjava;

import java.util.Scanner;

class MK {
    String nama;
    int sks;
    String nilaiHuruf;

    MK(String nama, int sks, String nilaiHuruf) {
        this.nama = nama;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf;
    }

    double getPoin() {
        if (nilaiHuruf.equalsIgnoreCase("A")) return 4.0;
        if (nilaiHuruf.equalsIgnoreCase("A-")) return 3.7;
        if (nilaiHuruf.equalsIgnoreCase("B+")) return 3.3;
        if (nilaiHuruf.equalsIgnoreCase("B")) return 3.0;
        if (nilaiHuruf.equalsIgnoreCase("B-")) return 2.7;
        if (nilaiHuruf.equalsIgnoreCase("C+")) return 2.3;
        if (nilaiHuruf.equalsIgnoreCase("C")) return 2.0;
        if (nilaiHuruf.equalsIgnoreCase("D")) return 1.0;
        return 0.0;
    }
}

public class ProjekJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== MENGHITUNG NILAI IPS ===");
        System.out.print("Ketiklah Nama Anda: ");
        String namaMhs = scan.nextLine();
        
        System.out.print("Ketiklah NIM Anda: ");
        String nimMhs = scan.nextLine();
        
        System.out.print("Jumlah MK yang diambil: ");
        int jumlah = scan.nextInt();
        scan.nextLine();

        
        MK[] listMK = new MK[jumlah]; 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput data ke-" + (i + 1));
            System.out.print("Nama MK: ");
            String nama = scan.nextLine();
            System.out.print("SKS MK: ");
            int sks = scan.nextInt();
            System.out.print("Nilai: ");
            String nilai = scan.next();
            scan.nextLine();

            listMK[i] = new MK(nama, sks, nilai);
        }

        double totalPoinMutu = 0;
        int totalSKS = 0;

        for (int i = 0; i < listMK.length; i++) {
            totalPoinMutu += (listMK[i].getPoin() * listMK[i].sks);
            totalSKS += listMK[i].sks;
        }

        double ips = (totalSKS == 0) ? 0 : totalPoinMutu / totalSKS;

        System.out.println("\n============================");
        System.out.println("Nama Mahasiswa : " + namaMhs);
        System.out.println("NIM Mahasiswa  : " + nimMhs);
        System.out.println("Total SKS      : " + totalSKS);
        System.out.printf("Nilai IPS      : %.2f\n", ips);
        System.out.println("============================");
    }
}