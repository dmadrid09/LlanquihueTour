package cl.duoc.llanquihuetour.model;

public class Direccion {
    private String calle;
    private String numero;
    private String Comuna;

    public Direccion(String calle, String numero, String comuna) {
        this.calle = calle;
        this.numero = numero;
        Comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String comuna) {
        Comuna = comuna;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion = " +
                "calle = " + calle + '\'' +
                ", numero = " + numero + '\'' +
                ", Comuna = " + Comuna + '\'';
    }
}

