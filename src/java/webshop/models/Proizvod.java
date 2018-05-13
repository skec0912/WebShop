package webshop.models;

public class Proizvod {

    private int id;
    private String naziv;
    private Double cijenaPoKomadu;
    private int kategorijaId;

    public Proizvod() {
    }

    public Proizvod(int id, String naziv, Double cijenaPoKomadu, int kategorijaId) {
        this.id = id;
        this.naziv = naziv;
        this.cijenaPoKomadu = cijenaPoKomadu;
        this.kategorijaId = kategorijaId;
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
     * @return the cijenaPoKomadu
     */
    public Double getCijenaPoKomadu() {
        return cijenaPoKomadu;
    }

    /**
     * @param cijenaPoKomadu the cijenaPoKomadu to set
     */
    public void setCijenaPoKomadu(Double cijenaPoKomadu) {
        this.cijenaPoKomadu = cijenaPoKomadu;
    }

    /**
     * @return the kategorijaId
     */
    public int getKategorijaId() {
        return kategorijaId;
    }

    /**
     * @param kategorijaId the kategorijaId to set
     */
    public void setKategorijaId(int kategorijaId) {
        this.kategorijaId = kategorijaId;
    }
}
