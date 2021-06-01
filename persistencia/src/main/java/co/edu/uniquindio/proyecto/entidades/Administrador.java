package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Administrador extends Persona{ 

    @OneToMany(mappedBy = "administrador")
    private List<Moderador> moderadores;

    @OneToMany(mappedBy = "administrador")
    private List<Odontologo> odontologos;

    public Administrador() {
        super();
    }

    public List<Moderador> getModeradores() {
        return moderadores;
    }

    public void setModeradores(List<Moderador> moderadores) {
        this.moderadores = moderadores;
    }

    public List<Odontologo> getOdontologos() { return odontologos;   }

    public void setOdontologos(List<Odontologo> odontologos) {   this.odontologos = odontologos;   }
}
