package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Moderador extends Persona{

    @ManyToOne
    @JoinColumn(name = "id_administrador", nullable = false)
    private Administrador administrador;

    @OneToMany(mappedBy = "moderador")
    private List<Clinica> clinicas;

    public Moderador() {
        super();
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public List<Clinica> getClinicas() {
        return clinicas;
    }

    public void setClinicas(List<Clinica> clinicas) {
        this.clinicas = clinicas;
    }
}
