package com.mycompany.utspemdas;

import java.util.Scanner;

public class ProgramUtama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        Mahasiswa Mhs = new Mahasiswa(nama, nim);
        
        System.out.print("Jumlah mata kuliah: ");
        int jmlMK = 0;
        while (true) {
            try {
                jmlMK = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.print("input harus angka, coba lagi: ");
            }
        }
        
        for (int i = 0; i < jmlMK; i++) {
        System.out.println("Mata kuliah ke-" + (i+1) + ":");
        System.out.print("Nama Mata Kuliah: ");
        String NamaMK = sc.nextLine();

        System.out.print("Jumlah SKS: ");
        int sks = 0;
        while (true) {
            try {
                sks = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.print("input harus angka, coba lagi: ");
            }
        }

        System.out.print("Nilai: ");
        String nilaiH = sc.nextLine().trim().toUpperCase();

        MataKuliah mk = new MataKuliah(NamaMK, sks, nilaiH);
        Mhs.tambahMK(mk);
        }
        
        double ips = Mhs.getTotalMutu() / Mhs.getTotalSKS();

        System.out.println("\nHASIL IPS");
        System.out.println("Nama: " + Mhs.getNama());
        System.out.println("NIM: " + Mhs.getNim());
        System.out.println("Total SKS: " + Mhs.getTotalSKS());
        System.out.printf("Total Mutu: %.2f%n", Mhs.getTotalMutu());
        System.out.printf("IPS: %.2f%n", ips);

        sc.close();
    }
}