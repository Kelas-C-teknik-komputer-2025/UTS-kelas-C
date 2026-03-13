import java.util.Scanner;

public class Matkul {

    String nama;
    int sks;
    String nilaiHuruf;
    double bobot;

    Matkul(String nama, int sks, String nilaiHuruf) {
        this.nama = nama;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf.toUpperCase();
        this.bobot = konversiNilai();
    }

    double konversiNilai() {
        switch (nilaiHuruf) {
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }

    double bobotNilai() {
        return bobot * sks;
    }
}

class HitungIPS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Matkul: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Matkul[] matkul = new Matkul[jumlah];

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nMatkul Yang ke-" + (i+1));

            System.out.print("Nama Matkul: ");
            String nama = input.nextLine();

            System.out.print("Jumlah SKS: ");
            int sks = input.nextInt();
            input.nextLine();

            System.out.print("Nilai Matkul: ");
            String nilai = input.nextLine();

            matkul[i] = new Matkul(nama, sks, nilai);

            totalNilai += matkul[i].bobotNilai();
            totalSKS += sks;
        }

        double ips = totalNilai / totalSKS;

        System.out.println("\n========== HASIL IPS ==========");

        for (int i = 0; i < jumlah; i++) {
            System.out.println(
                    matkul[i].nama +
                            " | SKS: " + matkul[i].sks +
                            " | Nilai: " + matkul[i].nilaiHuruf +
                            " | Bobot: " + matkul[i].bobot
            );
        }

        System.out.println("\nIPS : " + String.format("%.2f", ips));
    }
}