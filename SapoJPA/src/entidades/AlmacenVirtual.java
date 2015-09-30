package entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AlmacenVirtual
 *
 */
@Entity

public class AlmacenVirtual implements Serializable {

	   
	@Id
	private long Id;
	private String Nombre;
	private String Direccion;
	private static final long serialVersionUID = 1L;

	public AlmacenVirtual() {
		super();
	}   
	public long getId() {
		return this.Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getDireccion() {
		return this.Direccion;
	}

	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}
   
}
