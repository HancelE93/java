package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;

public class CalculadoraAmortizacion {

    // =========================
    // 1️⃣ Calcular cuota mensual
    // =========================
    public static double calcularCuota(Prestamo prestamo) {

        double C = prestamo.getMonto();  
        double i = prestamo.getInteres() / 100 / 12;  // interés mensual
        int n = prestamo.getPlazo();  

        // Fórmula francesa de amortización
        double cuota = (C * i) / (1 - Math.pow(1 + i, -n));

        return cuota;  
    }
    
    // ====================================
    // 2️⃣ Generar tabla de amortización
    // ====================================
    public static void generarTabla(Prestamo prestamo) {

        // Cuota fija mensual
        double cuotaFija = calcularCuota(prestamo);

        // Lista de cuotas
        ArrayList<Cuota> cuotas = prestamo.getCuotas();

        // Asignar cuota fija a todas las cuotas
        for (int i = 0; i < cuotas.size(); i++) {
            cuotas.get(i).setCuota(cuotaFija);
        }

        // La primera cuota inicia con el monto total del préstamo
        cuotas.get(0).setInicio(prestamo.getMonto());

        // Interés mensual en decimal
        double interesMensual = prestamo.getInteres() / 100.0 / 12.0;

        // Calcular cada cuota
        for (int i = 0; i < cuotas.size(); i++) {

            Cuota actual = cuotas.get(i);
            Cuota siguiente = (i < cuotas.size() - 1) ? cuotas.get(i + 1) : null;

            double saldoAnterior = actual.getInicio();

            // Cálculo del interés del mes
            double valorInteres = saldoAnterior * interesMensual;

            // Cálculo del abono a capital
            double abonoCapital = cuotaFija - valorInteres;

            // Saldo final del mes
            double saldo = saldoAnterior - abonoCapital;

            // Guardar valores en la cuota
            actual.setInteres(valorInteres);
            actual.setCapital(abonoCapital);
            actual.setAbonoCapital(abonoCapital);
            actual.setSaldo(saldo);

            // Pasar saldo a la siguiente cuota
            if (siguiente != null) {
                siguiente.setInicio(saldo);
            }
        }

        // Ajuste de la última cuota por redondeo
        cuotas.get(cuotas.size() - 1).setSaldo(0);
    }

    // ====================================
    // 3️⃣ Mostrar la tabla completa
    // ====================================
    public static void mostrarTabla(Prestamo prestamo) {

        System.out.println("N° | Inicio | Cuota | Interés | Capital | AbonoCapital | Saldo");
        System.out.println("---------------------------------------------------------------");

        ArrayList<Cuota> cuotas = prestamo.getCuotas();
        for (int i = 0; i < cuotas.size(); i++) {
            cuotas.get(i).mostrarPrestamo();
        }
    }
}