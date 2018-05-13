/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webshop.models;

import java.util.ArrayList;

/**
 *
 * @author Andrej
 */
public class Repository {

    ArrayList<Proizvod> proizvodi = new ArrayList<>();

    public Repository() {
        proizvodi.add(new Proizvod(1, "Nike tenisice AIR MAX", 500.0, 1));
    }

    public ArrayList<Proizvod> dohvatiProizvodeKategorije(int idKategorije) {
        ArrayList<Proizvod> proizvodiKategorije = new ArrayList<>();
        for (Proizvod p : proizvodi) {
            if (p.getKategorijaId() == idKategorije) {
                proizvodiKategorije.add(p);
            }
        }
        return proizvodiKategorije;
    }
}
