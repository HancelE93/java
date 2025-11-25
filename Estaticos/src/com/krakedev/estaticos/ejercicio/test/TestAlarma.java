package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

;


public class TestAlarma {

	public static void main(String[] args) {
		

        // 1. Crear el administrador de alarmas
        // Este objeto tendrá internamente un ArrayList vacío listo para guardar alarmas
        AdminAlarmas admin = new AdminAlarmas();


        // 2. Crear alarmas usando las CONSTANTES de DiasSemana e ingresarlas al admin
        // new Alarma(dia, hora, minuto)

        admin.agregarAlarmas(new Alarma(DiasSemana.LUNES, 5, 45));   
        // Crea una alarma para el lunes 05:45 y la guarda dentro del ArrayList de admin

        admin.agregarAlarmas(new Alarma(DiasSemana.MARTES, 6, 30));  
        // Martes 06:30

        admin.agregarAlarmas(new Alarma(DiasSemana.VIERNES, 7, 15)); 
        // Viernes 07:15


        // 3. Recuperar la lista completa de alarmas que están dentro de AdminAlarmas
        ArrayList<Alarma> alarmasActuales = admin.getAlarmas();


        // 4. Imprimir toda la lista
        // Esto automáticamente llama al toString() de cada alarma dentro de la lista
        System.out.println(alarmasActuales);
    }
}