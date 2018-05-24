/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webshop.models;

import java.time.LocalDateTime;

/**
 *
 * @author Andrej
 */
public class Kupnja {

    private int id;
    private LocalDateTime vrijemeKupnje;
    private int kolicina;
    private Proizvod proizvod;
    private Korisnik korisnik;

    public Kupnja() {
    }

    public Kupnja(int id, LocalDateTime vrijemeKupnje, int kolicina, Proizvod proizvod, Korisnik korisnik) {
        this.id = id;
        this.vrijemeKupnje = vrijemeKupnje;
        this.kolicina = kolicina;
        this.proizvod = proizvod;
        this.korisnik = korisnik;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the vrijemeKupnje
     */
    public LocalDateTime getVrijemeKupnje() {
        return vrijemeKupnje;
    }

    /**
     * @param vrijemeKupnje the vrijemeKupnje to set
     */
    public void setVrijemeKupnje(LocalDateTime vrijemeKupnje) {
        this.vrijemeKupnje = vrijemeKupnje;
    }

    /**
     * @return the kolicina
     */
    public int getKolicina() {
        return kolicina;
    }

    /**
     * @param kolicina the kolicina to set
     */
    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    /**
     * @return the proizvod
     */
    public Proizvod getProizvod() {
        return proizvod;
    }

    /**
     * @param proizvod the proizvod to set
     */
    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    /**
     * @return the korisnik
     */
    public Korisnik getKorisnik() {
        return korisnik;
    }

    /**
     * @param korisnik the korisnik to set
     */
    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
}
