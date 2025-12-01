package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps=null;
		try {
		Class.forName("org.postgresql.Driver");
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","H@ncel1723439319");
		System.out.println("conexion exitosas a POSTGRES");
		ps=connection.prepareStatement("insert into personas (cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos,estado_civil_codigo)\r\n"
				+ "		values (?, ?, ?, ?, ?, ?, ?::money, ?,?)");
		ps.setString(1, "1723439317");
		ps.setString(2, "Stefy");
		ps.setString(3, "luna");
		ps.setDouble(4, 1.85);
		// DATE (usar formato YYYY-MM-DD)
		ps.setDate(5, java.sql.Date.valueOf("1994-05-04"));

		// TIME (HH:MM:SS)
		ps.setTime(6, java.sql.Time.valueOf("14:15:00"));

		// MONEY 
		ps.setString(7, "50.0");

		// INT
		ps.setInt(8, 2);
		ps.setString(9, "S");
		
		ps.executeUpdate();
		System.out.println("Ejecuta el insert de BDD");
		
		//USUARIO
				ps=connection.prepareStatement("insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)\r\n"
						+ "		values (?,?, ?, ?, ?::money)");
				ps.setString(1, "17504");
				ps.setString(2, "David");
				ps.setString(3, "Hernandez");
				ps.setString(4, "Ahorro");
				ps.setString(5, "500");
				ps.executeUpdate();
				System.out.println("Ejecuta el insert de Usuario");
				
		
		//CUENTAS
		ps=connection.prepareStatement("insert into  cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)\r\n"
				+ "		values (?, ?, ?, ?::money)");
		ps.setString(1, "25569");
		ps.setString(2, "17504");
		ps.setDate(3, java.sql.Date.valueOf("2022-08-21"));
		ps.setString(4, "500");
		ps.executeUpdate();
		System.out.println("Ejecuta el insert de Cuenta");
		
		
		
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
		
	}

}
