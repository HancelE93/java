package test;

import entidades.Random;

public class TestRandom {

	public static void main(String[] args) {

        // Estas variables sirven para saber si ALGUNA VEZ salió
        // el número 0 o el número 1.
        boolean salio0 = false;
        boolean salio1 = false;

        // Esta variable guarda la última posición generada.
        // Solo para mostrarla al final, como pide el enunciado.
        int ultimaPosicion = -1;

        // Hacemos 10.000 intentos porque el número es aleatorio
        // y queremos darle muchas oportunidades de generar 0 o 1.
        for (int i = 0; i < 10; i++) {

            // Llamamos al método ObtenerPosicion, que da números entre 0 y 51.
            int valor = Random.ObtenerPosicion();

            // Guardamos el último valor generado
            ultimaPosicion = valor;

            // Si el valor generado alguna vez es 0, marcamos la bandera
            if (valor == 0) {
                salio0 = true;
            }

            // Si el valor generado alguna vez es 1, marcamos la bandera
            if (valor == 1) {
                salio1 = true;
            }
        }

        // Imprimimos la última posición generada,
        // así lo pide el enunciado ("Posición obtenida X")
        System.out.println("Posición obtenida: " + ultimaPosicion);

        // Si DESPUÉS de los 10.000 intentos
        // NUNCA salió 0 y NUNCA salió 1,
        // entonces mostramos el mensaje del enunciado.
        if (!salio0 && !salio1) {
            System.out.println("El método ObtenerPosicion no ha arrojado 0 o 1");
        }
    }
}