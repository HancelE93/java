package com.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {

        String cedulaAEliminar = "1723888899"; 
        // Esta es la cédula que quiero eliminar. 
        // Debe existir en la base para que realmente se borre.

        try {
            AdminPersonas.eliminar(cedulaAEliminar);
            // Aquí llamo al método eliminar del AdminPersonas.
            // Si la cédula existe → se eliminará.
            // Si no existe → igual no da error, solo no borra nada.

            System.out.println("Persona eliminada correctamente");
            // Si llegó aquí significa que NO hubo excepción.

        } catch (Exception e) {
            // Si algo salió mal en el método eliminar, cae acá.

            System.out.println("Error al eliminar persona: " + e.getMessage());
            // Muestro el mensaje del error en pantalla
        }
    }
}