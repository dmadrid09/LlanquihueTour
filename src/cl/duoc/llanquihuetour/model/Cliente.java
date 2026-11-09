package cl.duoc.llanquihuetour.model;

public class Cliente extends Persona{
    private String nacionalidad;
    private String idioma;

    public Cliente(String nombre, String telefono, Direccion direccion, String rut, String nacionalidad, String idioma) {
        super(nombre, telefono, direccion, rut);
        this.nacionalidad = nacionalidad;
        this.idioma = idioma;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "DATOS DEL CLIENTE\n" +
                "-----------------\n" +
                "Nombre       : " + getNombre() + "\n" +
                "RUT          : " + getRut() + "\n" +
                "Teléfono     : " + getTelefono() + "\n" +
                "Dirección    : " + getDireccion().toString() + "\n" +
                "Nacionalidad : " + nacionalidad + "\n" +
                "Idioma       : " + idioma + "\n";

    }
}
