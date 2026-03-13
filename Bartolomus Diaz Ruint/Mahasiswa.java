package com.mycompany.utspemdas;

import java.util.ArrayList;

public class Mahasiswa {
    String nama;
    String nim;
    ArrayList<MataKuliah> listMK;
    double ips;
    
    public Mahasiswa(String nama, String nim) {
    this.nama = nama;
    this.nim = nim;
    listMK = new ArrayList<>();
    ips = 0;
    }
    
    public void tambahMK(MataKuliah mk) {
    listMK.add(mk);
    }
    
    public int getTotalSKS() {
    int total = 0;
    for (int i = 0; i < listMK.size(); i++) {
        total += listMK.get(i).getSks();
    }
    return total;
    }

public double getTotalMutu() {
    double total = 0;
    for (MataKuliah mk : listMK) {
        total = total + mk.getNilaiMutu();
    }
    return total;
    }

public String getNama() { return nama; }
public String getNim() { return nim; }

}
