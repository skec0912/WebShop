/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webshop.models;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Andrej
 */
public class Repository {

    private SQLServerDataSource ds = SqlHelper.getDataSource();

    public void unesiKorisnika(Korisnik k) {

        try (Connection conn = ds.getConnection()) {
//            CallableStatement st = conn.prepareCall("{call CreateDoctor(?,?,?,?,?,?,?,?,?,?)}");
//            st.setString(1, doctor.getName());
//            st.setString(2, doctor.getSurname());
//            st.setString(3, doctor.getSex());
//            st.setDate(4, doctor.getDateOfBirth());
//            st.setString(5, doctor.getTelephone());
//            st.setString(6, doctor.getMobile());
//            st.setString(7, doctor.getPager());
//            st.setString(8, doctor.getFax());
//            st.setString(9, doctor.getAddress());
//            st.setString(10, doctor.getActivityArea());
            //st.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

     public Korisnik dohvatiKorisnika(int korisnikId) {
        //implement
        return new Korisnik();
    }
    
    public ArrayList<Kategorija> dohvatiKategorije() {
        //implement
        return new ArrayList<Kategorija>();
    }

    public Kategorija dohvatiKategoriju(int kategorijaId) {
        //implement
        return new Kategorija();
    }

    public void unesiKategoriju(Kategorija kategorija) {
        //implement
    }

    public ArrayList<Proizvod> dohvatiSveProizvodeKategorije(int kategorijaId) {
        //implement
        return new ArrayList<Proizvod>();
    }

    public Proizvod dohvatiProizvod(int proizvodId) {
        //implement
        return new Proizvod();
    }

    public void dodajUKosaricu(Proizvod proizvod, int kolicina) {
        //implement
    }

    public void obrisiIzKosarice(int proizvodId, int kolicina) {
        //implement
    }

    public void kreirajKupnju(Kupnja kupnja) {
    }

    public void zapisiUHistoryKupnji(History history) {
    }

    public void procitajIzHistoryaKupnji(int korisnikid) {
    }

    public void zapisiUHistory(HistoryLogiranja historyLogiranja) {
    }

    public void procitajIzHistoryaLogiranja(int korisnikid) {
    }
}
