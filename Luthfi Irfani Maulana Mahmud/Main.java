import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class matkul {

        String nama, nilai;
        int sks;
        double bobot;

        matkul(String nama, int sks, String nilai) {
            this.nama = nama;
            this.sks = sks;
            this.nilai = nilai.toUpperCase();

            if (this.nilai.equals("A")) bobot = 4.0;
            else if (this.nilai.equals("A-")) bobot = 3.7;
            else if (this.nilai.equals("B+")) bobot = 3.3;
            else if (this.nilai.equals("B")) bobot = 3.0;
            else if (this.nilai.equals("B-")) bobot = 2.7;
            else if (this.nilai.equals("C+")) bobot = 2.3;
            else if (this.nilai.equals("C")) bobot = 2.0;
            else if (this.nilai.equals("D")) bobot = 1.0;
            else if (this.nilai.equals("E")) bobot = 0.0;
        }

        double nilaiMutu() {
            return bobot * sks;
        }
    }

    static class hitungIPS {
        ArrayList<matkul> list = new ArrayList<>();

        void tambah(matkul mk) {
            list.add(mk);
        }

        int totalSKS() {
            int total = 0;
            for (int i = 0; i < list.size(); i++) {
                total = total + list.get(i).sks;
            }
            return total;
        }

        double totalNM() {
            double total = 0;
            for (int i = 0; i < list.size(); i++) {
                total = total + list.get(i).nilaiMutu();
            }
            return total;
        }

        double getIPS() {
            return totalNM() / totalSKS();
        }

        void printHasil() {
            System.out.println("\n============================");
            System.out.println("HASIL IPS");
            System.out.println("============================");
            for (int i = 0; i < list.size(); i++) {
                matkul mk = list.get(i);
                System.out.println(mk.nama + " | SKS: " + mk.sks + " | Nilai: " + mk.nilai + " | Bobot: " + mk.bobot + " | Nilai Mutu: " + mk.nilaiMutu());
            }
            System.out.println("----------------------------");
            System.out.println("Total SKS: " + totalSKS());
            System.out.println("Total Nilai Mutu: " + totalNM());
            System.out.println("IPS: " + getIPS());
            System.out.println("============================");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        hitungIPS kalkulator = new hitungIPS();

        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("SKS: ");
            int sks = sc.nextInt();
            sc.nextLine();
            System.out.print("Nilai: ");
            String nilai = sc.nextLine();
            matkul mk = new matkul(nama, sks, nilai);
            kalkulator.tambah(mk);
        }

        kalkulator.printHasil();
        sc.close();
    }
}
