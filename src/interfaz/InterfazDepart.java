package interfaz;

import org.neodatis.odb.ODB;

import logica.Excepciones.NumDepartDuplicado;

public interface InterfazDepart {

	void insertarDep(ODB odb) throws NumDepartDuplicado;

	void borrarDep(ODB odb);

	String consultarDep(ODB odb, int num1, int num2);

	void modificarDep(ODB odb);

}