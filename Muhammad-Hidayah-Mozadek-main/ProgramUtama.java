package ProgramUtama;

import java.util.Scanner;

class MataKuliah {
    private String nama;
    private int sks;
    private String nilaiHuruf;

    public MataKuliah(String nama, int sks, String nilaiHuruf) {
        this.nama = nama;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf;
    }

    public int getSks() {
        return sks;
    }

    public double getBobot() {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "B-":
                return 2.7;
            case "C+":
                return 2.3;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0;
        }
    }

    public double getNilaiMutu() {
        return getBobot() * sks;
    }
}

class Semester {
    private MataKuliah[] Matakuliah;
    private int totalMatakuliah;

    public Semester(int totalMatakuliah) {
        this.totalMatakuliah = totalMatakuliah;
        Matakuliah = new MataKuliah[totalMatakuliah];
    }

    public void setMataKuliah(int index, MataKuliah mk) {
        if (index >= 0 && index < totalMatakuliah) {
            Matakuliah[index] = mk;
        }
    }

    public double hitungIPS() {
        double totalNilaiMutu = 0;
        int totalSks = 0;

        for (int i = 0; i < totalMatakuliah; i++) {
            totalNilaiMutu += Matakuliah[i].getNilaiMutu();
            totalSks += Matakuliah[i].getSks();
        }

        if (totalSks == 0) return 0;

        return totalNilaiMutu / totalSks;
    }
}

public class ProgramUtama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total Matakuliah yang diambil: ");
        int totalMatakuliah = scanner.nextInt();
        scanner.nextLine();

        Semester semester = new Semester(totalMatakuliah);

        for (int i = 0; i < totalMatakuliah; i++) {
            System.out.println("\nMatakuliah ke-" + (i + 1));

            System.out.print("Nama Matakuliah: ");
            String nama = scanner.nextLine();

            System.out.print("Jumlah SKS: ");
            int sks = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nilai huruf (Contoh: A, A-, B+, B, B-, C+, C, D, E): ");
            String nilaiHuruf = scanner.nextLine().toUpperCase();

            MataKuliah mk = new MataKuliah(nama, sks, nilaiHuruf);
            semester.setMataKuliah(i, mk);
        }

        double ips = semester.hitungIPS();

        System.out.printf("\nIndeks Prestasi Semester (IPS) Anda adalah: %.2f\n", ips);

        scanner.close();
    }
}