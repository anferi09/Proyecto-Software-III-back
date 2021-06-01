package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cita implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "estado") // 5 estados
    private Boolean status;

   /* @Enumerated(EnumType.STRING)
    private Enum<Tipo> tipoConsulta;*/

    @ManyToOne
    @JoinColumn(name = "id_horario", nullable = false)
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "id_agenda", nullable = false)
    private Agenda agenda;

    public Integer getId() { return id;    }

    public void setId(Integer id) {  this.id = id;  }

    public Boolean getStatus() {   return status;   }

    public void setStatus(Boolean status) {   this.status = status;   }

  /*  public Enum<Tipo> getTipoConsulta() {  return tipoConsulta;    }

    public void setTipoConsulta(Enum<Tipo> tipoConsulta) {   this.tipoConsulta = tipoConsulta;  } */

    public Horario getHorario() { return horario;  }

    public void setHorario(Horario horario) {  this.horario = horario;  }

    public Agenda getAgendas() {  return agenda; }

    public void setAgendas(Agenda agendas) {  this.agenda = agendas;   }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cita cita = (Cita) o;

        return id.equals(cita.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
