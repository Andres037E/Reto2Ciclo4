package Reto2;
// modelo
// interface
//repositorio
//servicio 
//controlador
import Reto2.interfaces.InterfaceFootwears;
import Reto2.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2Application implements CommandLineRunner {
        @Autowired
        private InterfaceFootwears interfaceFootwears;
        @Autowired
        private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(Reto2Application.class, args);
	}
        @Override
    public void run(String... args) throws Exception{
        interfaceFootwears.deleteAll();
        interfaceUser.deleteAll();
    }
}
