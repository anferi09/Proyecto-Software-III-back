package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Agenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "diaCita")
    private Date dia;

    private String observacion;

    @OneToMany(mappedBy = "agenda")
    private List<Clinica> clinicas;

    @OneToMany(mappedBy = "agenda")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "agenda")
    private List<Odontologo> odontologos;

    @OneToMany(mappedBy = "agenda")
    private List<Horario> horarios;

    @OneToMany(mappedBy = "agenda")
    private List<Cita> citas;

    public Agenda() {  super();  }

    public Integer getId() { return id;  }

    public void setId(Integer id) { this.id = id;  }

    public Date getDia() { return dia;  }

    public void setDia(Date dia) {  this.dia = dia;  }

    public String getObservacion() { return observacion;   }

    public void setObservacion(String observacion) { this.observacion = observacion;  }

    public List<Clinica> getClinicas() { return clinicas;  }

    public void setClinicas(List<Clinica> clinicas) { this.clinicas = clinicas;  }

    public List<Usuario> getUsuarios() { return usuarios;   }

    public void setUsuarios(List<Usuario> usuarios) { this.usuarios = usuarios;    }

    public List<Odontologo> getOdontologos() {  return odontologos;  }

    public void setOdontologos(List<Odontologo> odontologos) { this.odontologos = odontologos;     }

    public List<Horario> getHorarios() {  return horarios;   }

    public void setHorarios(List<Horario> horarios) {  this.horarios = horarios;   }

    public List<Cita> getCitas() {  return citas;  }

    public void setCitas(List<Cita> citas) {  this.citas = citas;   }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agenda agenda = (Agenda) o;

        return id.equals(agenda.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
