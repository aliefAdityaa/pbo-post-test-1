/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Posttest1 {
 public static void main(String[] args) {
        Tokosepatu pembeli1 = new
Tokosepatu ("'Nike'","'alip'",350000);
        Tokosepatu pembeli2 = new
Tokosepatu ("'Adidas'","'pinka'", 150000);
        Tokosepatu pembeli3 = new
Tokosepatu ("'Vans'","'imel'",250000);
        Tokosepatu pembeli4 = new
Tokosepatu( "'Puma'","'taufik'",300000);
        Tokosepatu pembeli5 = new
Tokosepatu ("'Convers'","'rangga'",450000);

        ArrayList<Tokosepatu> buyers = new ArrayList<>();
        buyers.add (pembeli1);
        buyers.add (pembeli2);
        buyers.add (pembeli3);
        buyers.add (pembeli4);
        buyers.add (pembeli5);
        
        for (Tokosepatu dataPembeli: buyers){
            String sepatu = dataPembeli.merekSepatu;
            String nama = dataPembeli.namaPembeli;
            int harga = dataPembeli.harga;
            System.out.println("menu :"+sepatu+"|"+"Nama Pembeli :"+nama+"|"+"Harga"+harga);
                    
        }
    }
}
