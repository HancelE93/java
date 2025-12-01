package com.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
	   
		try {

            // 1️⃣ CREAS UNA PERSONA QUE YA EXISTE EN LA BASE DE DATOS
            //    Solo usas el constructor vacío y luego llenas los campos.
            Persona p = new Persona();

            // ESTA ES LA CÉDULA DE LA PERSONA QUE QUIERES ACTUALIZAR.
            // Es la clave primaria, NO se cambia.
            p.setCedula("1723888899");

            // 2️⃣ MODIFICAS LOS DATOS QUE SÍ QUIERES ACTUALIZAR
            p.setNombre("Carlos");         // nuevo nombre
            p.setApellido("Perez");        // nuevo apellido
            p.setEstatura(1.75);           // nueva estatura

            // Convertir un String → Date con la clase Convertidor
            Date fechaNac = Convertidor.convertirFecha("1994/05/18");
            Date horaNac = Convertidor.convertirHora("10:45:00");

            // Asignas la fecha y hora convertida a la persona
            p.setFecha_nacimiento(fechaNac);
            p.setHora_nacimiento(horaNac);

            // Otros campos normales
            p.setCantidad_ahorrada("150.75");  // nuevo valor de dinero ahorrado
            p.setNumero_hijos(2);              // actualizar número de hijos

            // Crear un EstadoCivil para actualizar este dato
            EstadoCivil ec = new EstadoCivil("C", "Casado");
            p.setEstadoCivil(ec);              // asignas estado civil nuevo

            // 3️⃣ SE LLAMA AL MÉTODO QUE ACTUALIZA EN LA BASE DE DATOS
            //    Este método recibe tu objeto persona y ejecuta un UPDATE.
            AdminPersonas.actualizar(p);

            // Si no hubo errores:
            System.out.println("Actualización realizada correctamente.");

        } catch (Exception e) {

            // Si algo salió mal, lo imprime.
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}