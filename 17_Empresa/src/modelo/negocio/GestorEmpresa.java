package modelo.negocio;

import java.util.ArrayList;

import modelo.entidad.Empleado;

public class GestorEmpresa {
	private ArrayList<Empleado> listaEmpleados = null;


	
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}



	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public void altaEmpleado(Empleado trabajador) {
		listaEmpleados.add(trabajador);
	}

}


