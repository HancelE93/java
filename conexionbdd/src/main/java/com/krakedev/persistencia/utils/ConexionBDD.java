package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USUARIO = "postgres";
	private final static String CLAVE = "H@ncel1723439319";
	 ///si el metodo es statico  las contamtes igual deven de ser
	private static final Logger LOGGER= LogManager.getLogger(ConexionBDD.class);
	public static Connection conectar()throws Exception {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
			LOGGER.debug("Conexion exitosa");;
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la Infraestructura",e);
			throw new Exception("Error en la Infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse, revise usuario clave",e);
			throw new Exception("Error al conectarse, revise usuario clave");
		}
		return connection;
	}
}