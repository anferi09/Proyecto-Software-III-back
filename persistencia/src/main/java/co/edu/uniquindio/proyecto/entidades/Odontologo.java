package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Odontologo extends Persona{

    @ManyToOne
    @JoinColumn(name = "id_administrador", nullable = false)
    private Administrador administrador;

    @ManyToOne
    @JoinColumn(name = "id_clinica", nullable = false)
    private Clinica clinica;

    @ManyToOne
    @JoinColumn(name = "id_agenda", nullable = false)
    private Agenda agenda;

    public Odontologo() { super();  }

    public Administrador getAdministrador() { return administrador;    }

    public void setAdministrador(Administrador administrador) {  this.administrador = administrador;   }

    public Clinica getClinicas() { return clinica;  }

    public void setClinicas(Clinica clinica) {  this.clinica = clinica;  }

    public Agenda getAgendas() {  return agenda;  }

    public void setAgendas(Agenda agendas) {   this.agenda = agenda;  }


}
