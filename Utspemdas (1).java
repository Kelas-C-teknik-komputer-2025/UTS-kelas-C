package com.mycompany.utspemdas;
import java.util.Scanner;
public class Utspemdas {   

    public static void main(String[] args) {
        class Matakuliah {
            String nama;
            int sks;
            String nilaiHuruf;

        public Matakuliah(String nama, int sks, String nilaiHuruf) {
            this.nama = nama;
            this.sks = sks;
            this.nilaiHuruf = nilaiHuruf;
    }

    public double konversiNilai() {

        if (nilaiHuruf.equalsIgnoreCase("A"))
            return 4.0;
        else if (nilaiHuruf.equalsIgnoreCase("A-"))
            return 3.7;
        else if (nilaiHuruf.equalsIgnoreCase("B+"))
            return 3.3;
        else if (nilaiHuruf.equalsIgnoreCase("B"))
            return 3.0;
        else if (nilaiHuruf.equalsIgnoreCase("B-"))
            return 2.7;
        else if (nilaiHuruf.equalsIgnoreCase("C+"))
            return 2.3;
        else if (nilaiHuruf.equalsIgnoreCase("C"))
            return 2.0;
        else if (nilaiHuruf.equalsIgnoreCase("D"))
            return 1.0;
        else
            return 0.0;
    }

    public double nilaiMutu() {
        return konversiNilai() * sks;
    }
}

class HitungIPS {

    public double hitungIPS(Matakuliah[] mk) {

        double totalMutu = 0;
        int totalSks = 0;

        for (int i = 0; i < mk.length; i++) {
            totalMutu += mk[i].nilaiMutu();
            totalSks += mk[i].sks;
        }

        return totalMutu / totalSks;
    }
}
        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Masukkan jumlah matakuliah: ");
            int jumlahMK = input.nextInt();
            input.nextLine();

            Matakuliah[] mk = new Matakuliah[jumlahMK];

            for (int i = 0; i < jumlahMK; i++) {

                System.out.println("\nData Matakuliah ke-" + (i + 1));

                System.out.print("Nama Matakuliah : ");
                String nama = input.nextLine();

                System.out.print("Jumlah SKS : ");
                int sks = input.nextInt();
                input.nextLine();

                System.out.print("Nilai Huruf : ");
                String nilai = input.nextLine();

                mk[i] = new Matakuliah(nama, sks, nilai);
            }

            HitungIPS hitung = new HitungIPS();

            double ips = hitung.hitungIPS(mk);

            System.out.println("\nIPS Semester = " + ips);

        } catch (Exception e) {
            System.out.println("Input tidak valid!");
        }

        input.close();
    }
}
