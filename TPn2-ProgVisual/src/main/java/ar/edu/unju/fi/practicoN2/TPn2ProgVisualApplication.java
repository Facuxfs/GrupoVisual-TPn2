package ar.edu.unju.fi.practicoN2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.ProcesoFecha;

@SpringBootApplication
public class TPn2ProgVisualApplication {

	public static void main(String[] args) {
		SpringApplication.run(TPn2ProgVisualApplication.class, args);
		ProcesoFecha unaFecha = new ProcesoFecha();
		System.out.println("que onda la pipol");
	}

}
