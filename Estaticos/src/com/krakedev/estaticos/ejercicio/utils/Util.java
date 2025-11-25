package com.krakedev.estaticos.ejercicio.utils;

public class Util {
    // Método estático: se puede usar sin crear un objeto de la clase.
    // Ejemplo: Util.formatearHora(5);
    public static String formatearHora(int numero) {

        // 1️⃣ Convertimos el entero a String concatenándolo con ""
        //    Esto es lo que pide EXACTAMENTE el enunciado.
        //
        //    "" + 5   -> "5"
        //    "" + 12  -> "12"
        //
        //    Es una forma rápida de pasar de int a String.
        String valor = "" + numero;

        // 2️⃣ Queremos que siempre tenga dos caracteres.
        //    Si el número tiene solo 1 dígito (por ejemplo "5"),
        //    entonces le agregamos un "0" al inicio → "05"
        if (valor.length() == 1) {
            valor = "0" + valor;
        }

        // 3️⃣ Retornamos el resultado final ya formateado
        return valor;
    }
    
    public static String  formatearDia(int numero) {
        
        
        // Verificamos el número uno por uno
        if (numero == 0) {
            return "Lunes";        // Si numero es 0 → devolvemos "Lunes"
        } 
        else if (numero == 1) {
            return "Martes";       // Si numero es 1 → devolvemos "Martes"
        } 
        else if (numero == 2) {
            return "Miércoles";    // Si numero es 2 → devolvemos "Miércoles"
        } 
        else if (numero == 3) {
            return "Jueves";       // Si numero es 3 → devolvemos "Jueves"
        } 
        else if (numero == 4) {
            return "Viernes";      // Si numero es 4 → devolvemos "Viernes"
        } 
        else if (numero == 5) {
            return "Sábado";       // Si numero es 5 → devolvemos "Sábado"
        } 
        else if (numero == 6) {
            return "Domingo";      // Si numero es 6 → devolvemos "Domingo"
        } 
        else {
            // Si llega un número incorrecto
            // Ejemplo: -1, 7, 20, etc.
            return "Día inválido"; // Retornamos un mensaje de error
        }
    }
}