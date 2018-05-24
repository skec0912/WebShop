/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webshop.models;

/**
 *
 * @author Andrej
 */
public class History {
    private Integer id;
    private Integer korisnikId;
    private Integer kupnjaId;
    
    public History(){}
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
     * @return the kupnjaId
     */
    public Integer getKupnjaId() {
        return kupnjaId;
    }

    /**
     * @param kupnjaId the kupnjaId to set
     */
    public void setKupnjaId(Integer kupnjaId) {
        this.kupnjaId = kupnjaId;
    }
}
