package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Usuario extends Persona{

    @Column(name = "celular", length = 80, nullable = false)
    private int celular;

    @Column(name = "direccion", length = 80, nullable = false)
    private String direccion;

    @Column(name = "fechaNacimiento", nullable = false)
    private Date fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_ciudad", nullable = false)
    private Ciudad ciudad;

    @OneToMany(mappedBy = "usuario")
    private List<Clinica> clinicas;

    @OneToMany(mappedBy = "usuario")
    private List<Favorito> favoritos;

    @OneToMany(mappedBy = "usuario")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "emisor")
    private List<Recomendacion> recomendados;

    @OneToMany(mappedBy = "receptor")
    private List<Recomendacion> recomendaciones;

    @OneToMany(mappedBy = "applicant")
    private List<PQRS> solicitudes;

    @OneToMany(mappedBy = "helper")
    private List<PQRS> respuestas;

    @ManyToOne
    @JoinColumn(name = "id_agenda", nullable = false)
    private Agenda agenda;

    public Usuario() {
        super();
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setClinicas(List<Clinica> clinicas) {
        this.clinicas = clinicas;
    }

    public List<Clinica> getClinicas() {  return clinicas;   }

    public List<Favorito> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Recomendacion> getRecomendados() {
        return recomendados;
    }

    public void setRecomendados(List<Recomendacion> recomendados) {
        this.recomendados = recomendados;
    }

    public List<Recomendacion> getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(List<Recomendacion> recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public List<PQRS> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<PQRS> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public List<PQRS> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<PQRS> respuestas) {
        this.respuestas = respuestas;
    }

    public int getCelular() { return celular;   }

    public void setCelular(int celular) { this.celular = celular;   }

    public String getDireccion() { return direccion;     }

    public void setDireccion(String direccion) { this.direccion = direccion;  }

    public Date getFechaNacimiento() { return fechaNacimiento;  }

    public void setFechaNacimiento(Date fechaNacimiento) {  this.fechaNacimiento = fechaNacimiento;  }

    public Agenda getAgendas() {  return agenda;   }

    public void setAgendas(Agenda agenda) { this.agenda = agenda;  }
}
