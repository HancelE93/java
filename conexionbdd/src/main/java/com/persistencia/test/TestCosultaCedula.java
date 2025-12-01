package com.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestCosultaCedula {

	public static void main(String[] args) {
		
		try {
            ArrayList<Persona> p = AdminPersonas.buscarPorCedula("1723439319");

            if (p == null) {
                System.out.println("No se encontró ninguna persona con esa cédula.");
            } else {
                System.out.println(p); // imprime los datos usando toString()
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
