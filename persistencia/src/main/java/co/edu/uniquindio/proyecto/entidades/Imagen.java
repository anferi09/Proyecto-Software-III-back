package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Imagen implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "url_imagen", nullable = false, unique = true)
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_clinica", nullable = false)
    private Clinica clinica;

    public Imagen() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imagen imagen = (Imagen) o;

        return id == imagen.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
