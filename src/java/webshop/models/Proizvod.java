package webshop.models;

public class Proizvod {
    private int id;
    private String naziv;
    private Double cijenaPoKomadu;
    private Kategorija kategorija;
    private Slika slika;

    public Proizvod() {
    }

    public Proizvod(int id, String naziv, Double cijenaPoKomadu, Kategorija kategorija, Slika slika) {
        this.id = id;
        this.naziv = naziv;
        this.cijenaPoKomadu = cijenaPoKomadu;
        this.kategorija = kategorija;
        this.slika = slika;
    }

    /**
     * @return the kategorija
     */
    public Kategorija getKategorija() {
        return kategorija;
    }

    /**
     * @param kategorija the kategorija to set
     */
    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    /**
     * @return the slika
     */
    public Slika getSlika() {
        return slika;
    }

    /**
     * @param slika the slika to set
     */
    public void setSlika(Slika slika) {
        this.slika = slika;
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
}
