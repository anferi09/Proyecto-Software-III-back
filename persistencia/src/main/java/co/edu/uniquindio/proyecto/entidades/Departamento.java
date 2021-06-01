package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Departamento implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_depto", unique = true, nullable = false)
    private int name;

    @ManyToOne
    @JoinColumn(name = "id_pais", nullable = false)
    private Pais pais;

    @OneToMany(mappedBy = "departamento")
    private List<Ciudad> ciudades;

    public Departamento() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departamento that = (Departamento) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
