/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webshop.models;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Andrej
 */
class HistoryLogiranja {

    public HistoryLogiranja(){}
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the korisnikId
     */
    public Integer getKorisnikId() {
        return korisnikId;
    }

    /**
     * @param korisnikId the korisnikId to set
     */
    public void setKorisnikId(Integer korisnikId) {
        this.korisnikId = korisnikId;
    }

    /**
     * @return the lokacija
     */
    public String getLokacija() {
        return lokacija;
    }

    /**
     * @param lokacija the lokacija to set
     */
    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    /**
     * @return the vrijeme
     */
    public LocalDate getVrijeme() {
        return vrijeme;
    }

    /**
     * @param vrijeme the vrijeme to set
     */
    public void setVrijeme(LocalDate vrijeme) {
        this.vrijeme = vrijeme;
    }
    private Integer id;
    private Integer korisnikId;
    private String lokacija;
    private LocalDate vrijeme;
}
