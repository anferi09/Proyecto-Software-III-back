package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public class Persona implements Serializable {

    @Id
    @Column(name = "cedula") //DNI
    private int cedula;

    @Column(name = "nombre", length = 80, nullable = false)
    private String name;

    @Column(name = "apellido", length = 80, nullable = false)
    private String lastName;

    @Column(name = "seudonimo", length = 80, nullable = false, unique = true)
    private String nickname;

    @Column(name = "correo", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "clave", length = 30, nullable = false)
    private String password;

    public Persona() {
        super();
    }



    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return cedula == persona.cedula;
    }

    @Override
    public int hashCode() {
        return cedula;
    }


}