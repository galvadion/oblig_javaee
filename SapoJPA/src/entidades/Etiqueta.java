package entidades;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etiqueta
 *
 */
@Entity

public class Etiqueta implements Serializable {

	   
	@Id
	private long Id;
	private String Nombre;
	private List<Producto> Productos;
	private static final long serialVersionUID = 1L;

	public Etiqueta() {
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
	public List<Producto> getProductos() {
		return Productos;
	}
	public void setProductos(List<Producto> productos) {
		Productos = productos;
	}
   
}
