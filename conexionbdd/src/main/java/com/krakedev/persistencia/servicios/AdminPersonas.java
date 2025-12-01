package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER= LogManager.getLogger(AdminPersonas.class);
	
	public static void insertar(Persona persona) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a Insertar >>>>  "+persona);
		try {
			con= ConexionBDD.conectar();
			//AQUI LLAMO EL METODO CONECTAR CADA QUE VALLA NECESITAR 
			ps=con.prepareStatement("insert into personas (cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos,estado_civil_codigo)\r\n"
					+ "		values (?, ?, ?, ?, ?, ?, ?::money, ?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDouble(4, persona.getEstatura());
			// DATE (usar formato YYYY-MM-DD)
			ps.setDate(5, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(6, new java.sql.Time(persona.getHora_nacimiento().getTime()));

			// MONEY 
			ps.setString(7,persona.getCantidad_ahorrada());

			// INT
			ps.setInt(8, 0);
			
			ps.setString(9, persona.getEstadoCivil().getCodigo());
			
			ps.executeUpdate();
			
			}catch (Exception e) {
				
				//logger el error
				LOGGER.error("Erro al insertar",e);
				throw new Exception("Erro al insertar");
			}finally {
				//cerrar la coneccion
				//con este finally  cerramos la coneccion
				try {
				con.close();
				}catch(SQLException e) {
					LOGGER.error("Erro con la base de datos",e);
					throw new Exception ("Erro con la base de datos ");
				}
			}
		
		
	/*	
		try {
		con= ConexionBDD.conectar();
		//AQUI LLAMO EL METODO CONECTAR CADA QUE VALLA NECESITAR 
		System.out.println("Insertar");
		}catch (Exception e) {
			//mostrar el error al uusuario
			System.out.println(e.getMessage());
			//logger el error
			e.printStackTrace();
		}finally {
			//cerrar la coneccion
			//con este finally  cerramos la coneccion
			try {
			con.close();
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}
		*/
	}
	
	public static void actualizar(Persona persona) throws Exception {
	    Connection con = null;
	    PreparedStatement ps = null;
	    LOGGER.trace("Persona a actualizar >>> " + persona);

	    try {
	        con = ConexionBDD.conectar();

	        // 1. UPDATE con todas las columnas EXCEPTO la cédula
	        // 2. Las incógnitas se rellenan en el MISMO orden en que aparecen
	        ps = con.prepareStatement(
	                "UPDATE personas SET " +
	                "nombre = ?, " +               // 1
	                "apellido = ?, " +             // 2
	                "estatura = ?, " +             // 3
	                "fecha_nacimiento = ?, " +     // 4
	                "hora_nacimiento = ?, " +      // 5
	                "cantidad_ahorrada = ?::money, " + // 6
	                "numero_hijos = ?, " +         // 7
	                "estado_civil_codigo = ? " +   // 8
	                "WHERE cedula = ?"             // 9  (NO SE ACTUALIZA)
	        );

	        // 3. Reemplazar incógnitas en orden
	        ps.setString(1, persona.getNombre());
	        ps.setString(2, persona.getApellido());
	        ps.setDouble(3, persona.getEstatura());
	        ps.setDate(4, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
	        ps.setTime(5, new java.sql.Time(persona.getHora_nacimiento().getTime()));
	        ps.setString(6, persona.getCantidad_ahorrada());
	        ps.setInt(7, persona.getNumero_hijos());
	        ps.setString(8, persona.getEstadoCivil().getCodigo());

	        // 4. La cédula va en el WHERE (incógnita 9)
	        ps.setString(9, persona.getCedula());

	        // 5. Ejecutar igual que en insertar
	        ps.executeUpdate();

	    } catch (Exception e) {
	        LOGGER.error("Error al actualizar persona", e);
	        throw new Exception("Error al actualizar persona");
	    } finally {
	        try {
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            LOGGER.error("Error con la base de datos", e);
	            throw new Exception("Error con la base de datos");
	        }
	    }
	}
	
	public static void eliminar(String cedula) throws Exception {
	    Connection con = null;            // Se declara la conexión (aquí se guardará la conexión a la base)
	    PreparedStatement ps = null;      // Aquí se guardará la sentencia SQL preparada

	    LOGGER.trace("Persona a eliminar >>> " + cedula);  
	    // Log que sirve para ver en consola cuál cédula se quiere eliminar

	    try {
	        con = ConexionBDD.conectar();   // Se abre la conexión con la base de datos

	        // Se prepara la sentencia SQL DELETE con una incógnita "?"
	        // Solo se necesita la cédula para borrar
	        ps = con.prepareStatement("DELETE FROM personas WHERE cedula = ?");

	        // Se reemplaza la incógnita con el valor real (la cédula que llegó al método)
	        // Como solo hay un "?", el índice es 1
	        ps.setString(1, cedula);

	        // Aquí se ejecuta el DELETE en la base
	        // executeUpdate retorna CUÁNTAS FILAS se borraron
	        int filas = ps.executeUpdate();

	        // Si filas == 0 significa que NO EXISTE una persona con esa cédula
	        if (filas == 0) {
	            throw new Exception("No existe una persona con esa cédula");
	        }

	    } catch (Exception e) {
	        // Si algo falla (conexión, SQL, etc.), se registra el error en el logger
	        LOGGER.error("Error al eliminar persona con cédula " + cedula, e);

	        // Se lanza una excepción para informarle al usuario
	        throw new Exception("Error al eliminar persona");

	    } finally {
	        // Este bloque SIEMPRE se ejecuta, falle o no falle el try
	        if (con != null) {
	            try {
	                con.close();    // Se cierra la conexión a la base
	            } catch (SQLException e) {
	                // Si ocurre un error cerrando la conexión, también se registra
	                LOGGER.error("Error al cerrar conexión", e);
	            }
	        }
	    }
	}
}