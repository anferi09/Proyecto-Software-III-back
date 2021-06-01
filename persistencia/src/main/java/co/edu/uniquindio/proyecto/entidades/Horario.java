package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Entity
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "dias_habiles", nullable = false)
    private String days;

    @Positive
    @Max(value = 23, message = "Hora en formato de 24h")
    @Column(name = "hora_apertura", nullable = false)
    private int opening_hour;

    @Positive
    @Max(value = 59, message = "Hora en formato de 24h")
    @Column(name = "minuto_apertura", nullable = false)
    private int opening_minute;

    @Positive
    @Max(value = 23, message = "Hora en formato de 24h")
    @Column(name = "hora_cierre", nullable = false)
    private int closing_hour;

    @Positive
    @Max(value = 59, message = "Hora en formato de 24h")
    @Column(name = "minuto_cierre", nullable = false)
    private int closing_minute;

    @OneToMany
    @JoinColumn(name = "id_clinica")
    private List<Clinica> clinicas;

    @ManyToOne
    @JoinColumn(name = "id_agenda", nullable = false)
    private Agenda agenda;



    public Horario() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getOpening_hour() {
        return opening_hour;
    }

    public void setOpening_hour(int opening_hour) {
        this.opening_hour = opening_hour;
    }

    public int getOpening_minute() {
        return opening_minute;
    }

    public void setOpening_minute(int opening_minute) {
        this.opening_minute = opening_minute;
    }

    public int getClosing_hour() {
        return closing_hour;
    }

    public void setClosing_hour(int closing_hour) {
        this.closing_hour = closing_hour;
    }

    public int getClosing_minute() {
        return closing_minute;
    }

    public void setClosing_minute(int closing_minute) {
        this.closing_minute = closing_minute;
    }

    public List<Clinica> getClinicas() {
        return clinicas;
    }

    public void setClinicas(List<Clinica> clinicas) {
        this.clinicas = clinicas;
    }

    public Agenda getAgendas() {  return agenda;   }

    public void setAgendas(Agenda agenda) {
        this.agenda = agenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horario horario = (Horario) o;

        return id == horario.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
