package co.edu.uniquindio.proyecto.entidades;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Clinica implements Serializable {

    @Id
    @Column(name = "id_clinica")
    private int id;

    @Column(name = "nombre_clinica", length = 120, nullable = false)
    private String name;

    @Column(name = "descripcion", nullable = false)
    private String description;

    @Column(name = "latitud", nullable = false)
    private float latitude;

    @Column(name = "longitud", nullable = false)
    private float longitude;

    @Column(name = "estado", nullable = false)
    private boolean status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_aprobacion")
    private Date approvedAt;


    @ManyToOne
    @JoinColumn(name = "id_ciudad", nullable = false)
    private Ciudad ciudad;

    @ManyToOne
    @JoinColumn(name = "id_moderador", nullable = false)
    private Moderador moderador;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_agenda", nullable = false)
    private Agenda agenda;


    @ManyToOne
    @JoinColumn(name = "id_horario", nullable = false)
    private Horario horario;


    @ElementCollection
    @JoinColumn(name = "numero_telefono")
    private List<String> phoneNumbers;

    @OneToMany(mappedBy = "clinica")
    private List<Odontologo> odontologos;

    @OneToMany(mappedBy = "clinica")
    private List<Imagen> imagenes;

    @OneToMany(mappedBy = "clinica")
    private List<Favorito> favoritos;

    @OneToMany(mappedBy = "clinica")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "clinica")
    private List<Recomendacion> recomendaciones;

    @OneToMany(mappedBy = "clinica")
    private List<PQRS> pqrs;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;


    public Clinica() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt(Date approvedAt) {
        this.approvedAt = approvedAt;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Moderador getModerador() {
        return moderador;
    }

    public void setModerador(Moderador moderador) {
        this.moderador = moderador;
    }

    public Horario getHorarios() {
        return horario;
    }

    public void setHorarios(Horario horario) {
        this.horario = horario;
    }

    public List<Recomendacion> getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(List<Recomendacion> recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public List<PQRS> getPqrs() {
        return pqrs;
    }

    public void setPqrs(List<PQRS> pqrs) {
        this.pqrs = pqrs;
    }

    public List<Odontologo> getOdontologo() { return odontologos;   }

    public void setOdontologo(List<Odontologo> odontologo) { this.odontologos = odontologos;    }

    public Agenda getAgendas() { return agenda;     }

    public void setAgendas(Agenda agenda) {  this.agenda = agenda;     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clinica clinica = (Clinica) o;

        return id == clinica.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

