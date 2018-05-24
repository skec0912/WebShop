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
public class Slika {

    private int id;
    private String naziv;
    private byte[] varBinary;

    public Slika(){}
    public Slika(int id, String naziv, byte[] varBinary) {
        this.id = id;
        this.naziv = naziv;
        this.varBinary = varBinary;
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
     * @return the naziv
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * @param naziv the naziv to set
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    /**
     * @return the varBinary
     */
    public byte[] getVarBinary() {
        return varBinary;
    }

    /**
     * @param varBinary the varBinary to set
     */
    public void setVarBinary(byte[] varBinary) {
        this.varBinary = varBinary;
    }
}
