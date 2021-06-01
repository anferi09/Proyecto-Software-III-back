package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class PQRS implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_solicitante", nullable = false)
    private Usuario applicant;

    @ManyToOne
    @JoinColumn(name = "id_ayudante")
    private Usuario helper;

    @ManyToOne
    @JoinColumn(name = "id_clinica", nullable = false)
    private Clinica clinica;

    @Lob()
    @Column(name = "mensaje", nullable = false)
    private String  message;

    @Lob()
    @Column(name = "respuesta")
    private String  answer;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_respuesta")
    private Date resolvedAt;

    @Enumerated(EnumType.STRING)
    private Clase clase;

    public PQRS() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getApplicant() {
        return applicant;
    }

    public void setApplicant(Usuario applicant) {
        this.applicant = applicant;
    }

    public Usuario getHelper() {
        return helper;
    }

    public void setHelper(Usuario helper) {
        this.helper = helper;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(Date resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PQRS pqrs = (PQRS) o;

        return id == pqrs.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
