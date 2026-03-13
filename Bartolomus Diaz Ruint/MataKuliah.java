package com.mycompany.utspemdas;

public class MataKuliah {
    String Nama;
    int SKS;
    String NilaiHuruf;
    double Bobot;
    double NilaiMutu;
    
    public MataKuliah(String Nama, int SKS, String NilaiHuruf) {
        this.Nama = Nama;
        this.SKS = SKS;
        this.NilaiHuruf = NilaiHuruf;
        this.Bobot = konversiNilai(NilaiHuruf);
        this.NilaiMutu = Bobot * SKS;
    }
    
    public String getNama() { return Nama; }
    public int getSks() { return SKS; }
    public String getNilaiHuruf() { return NilaiHuruf; }
    public double getBobot() { return Bobot; }
    public double getNilaiMutu() { return NilaiMutu; }
    
    private double konversiNilai(String NilaiHuruf) {
    if (NilaiHuruf.equals("A")) return 4.0;
    if (NilaiHuruf.equals("A-")) return 3.7;
    if (NilaiHuruf.equals("B+")) return 3.3;
    if (NilaiHuruf.equals("B")) return 3.0;
    if (NilaiHuruf.equals("B-")) return 2.7;
    if (NilaiHuruf.equals("C+")) return 2.3;
    if (NilaiHuruf.equals("C")) return 2.0;
    if (NilaiHuruf.equals("C-")) return 1.7;
    if (NilaiHuruf.equals("D")) return 1.0;
    if (NilaiHuruf.equals("E")) return 0;
    return 0.0;
    }
}