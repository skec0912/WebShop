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
class Korisnik {

    private int id;
    private String ime;
    private String prezime;
    private Boolean aktivan;
    private Boolean administrator;
    private ArrayList<Kupnja> kupnje;

    public Korisnik() {
    }

    public Korisnik(int id, String ime, String prezime, Boolean aktivan, Boolean administrator, ArrayList<Kupnja> kupnje) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.aktivan = aktivan;
        this.administrator = administrator;
        this.kupnje = kupnje;
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
     * @return the ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * @param ime the ime to set
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * @return the prezime
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * @param prezime the prezime to set
     */
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    /**
     * @return the aktivan
     */
    public Boolean getAktivan() {
        return aktivan;
    }

    /**
     * @param aktivan the aktivan to set
     */
    public void setAktivan(Boolean aktivan) {
        this.aktivan = aktivan;
    }

    /**
     * @return the administrator
     */
    public Boolean getAdministrator() {
        return administrator;
    }

    /**
     * @param administrator the administrator to set
     */
    public void setAdministrator(Boolean administrator) {
        this.administrator = administrator;
    }

    /**
     * @return the kupnje
     */
    public ArrayList<Kupnja> getKupnje() {
        return kupnje;
    }

    /**
     * @param kupnje the kupnje to set
     */
    public void setKupnje(ArrayList<Kupnja> kupnje) {
        this.kupnje = kupnje;
    }
}
