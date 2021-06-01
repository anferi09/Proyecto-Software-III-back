package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Pais implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_pais", unique = true, nullable = false)
    private int name;

    @OneToMany(mappedBy = "pais")
    private List<Departamento> departamentos;

    public Pais() {
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

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pais pais = (Pais) o;

        return id == pais.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
