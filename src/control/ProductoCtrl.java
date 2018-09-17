package control;

import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Cliente;

public class ProductoCtrl {
	private Conexion conexion; // unico atributo
	
	public ProductoCtrl (Conexion conexion) { //constructor de la clase conexion se ocupa de conectar java con la base de datos y es una interfase de datos 
		this.conexion = conexion;             
	}

	/*
	 * *****************************************************************************
	 * List
	 ******************************************************************************/
	public int list(int codigo) throws Throwable { //arraylist es una estructura de tipo arreglo con tamaño indefinido es una estructura dinamica
		
		ResultSet rs; //donde se guardan los resultados de nuestra consulta
		int monto=0;
		System.out.println("eNTRO METOD");

		conexion.SQL("Select * from auto where codigoAuto = '"+codigo+"'"); // metemos la consulta

		rs = conexion.resultSet(); // guarda el resultado de la consulta y devuelve todo lo de la consulta

		if (rs.next()) { // while para que vaya recoriendo y nos devuelva todos los elementos del rs 
			monto = rs.getInt("precio");
			System.out.println("eNCONTRO");
		}

		return monto;

	}

	/*
	 * *****************************************************************************
	 * Insert
	 ******************************************************************************/
	
}