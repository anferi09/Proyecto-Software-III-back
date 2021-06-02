package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.repositorios.UsuarioRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.text.SimpleDateFormat;
import java.util.Date;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioTest {

    @Autowired
    private UsuarioRepo usuarioRepo;

    @Test
    public void RegistrarUsuarioTest(){

        try {

            Usuario u = new Usuario();
            u.setCedula(111);
            u.setEmail("juana@mail.com");
            u.setLastName("lopez");
            u.setName("Juanita");
            u.setNickname("juana");
            u.setPassword("123");
            u.setCelular(316445000);
            u.setDireccion("chambranas mz 11 casa 4");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date fecha = sdf.parse("1990/02/14");
            u.setFechaNacimiento(fecha);

            //Guardamos el registro
            Usuario guardado = usuarioRepo.save(u);
            //Comprobamos que si haya quedado
            Assertions.assertNotNull(guardado);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
