package backend.beans;

import javax.ejb.EJB;

import entidades.AlmacenVirtual;
import sapo.fachada.FachadaAlmacenVirtual;

public class AlmacenBean {

	@EJB
	FachadaAlmacenVirtual fachadaAV;
	
	private String Nombre;
	private String longitud;
	private String latitud;
	
	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getLongitud() {
		return longitud;
	}



	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}



	public String getLatitud() {
		return latitud;
	}



	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}



	public AlmacenBean() {
		// TODO Auto-generated constructor stub
	}

}
