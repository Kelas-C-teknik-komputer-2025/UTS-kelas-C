/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Matkul {
    
    String nama;
    int sks;
    String nilai;
    
    float bobotNilai(){
        
        if(nilai.equals("A")) return 4.0f;
        else if(nilai.equals("A-")) return 3.7f;
        else if(nilai.equals("B+")) return 3.3f;
        else if(nilai.equals("B")) return 3.0f;
        else if(nilai.equals("B-")) return 2.7f;
        else if(nilai.equals("C+")) return 2.3f;
        else if(nilai.equals("C")) return 2.0f;
        else if(nilai.equals("D")) return 1.0f;
        else if(nilai.equals("E")) return 0.0f;
        else return 0.0f;
                
    }
    
}
