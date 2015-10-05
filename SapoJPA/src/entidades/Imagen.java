package entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Imagen
 *
 */
@Entity

public class Imagen implements Serializable {

	   
	@Id
	private long Id;
	private String Nombre;
	@ManyToOne
	private ProductoGenerico productoGenerico;
	@Transient
	private Producto Producto;
	private static final long serialVersionUID = 1L;

	public Imagen() {
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
	public Producto getProducto() {
		return this.Producto;
	}

	public void setProducto(Producto Producto) {
		this.Producto = Producto;
	}
	public ProductoGenerico getProductoGenerico() {
		return productoGenerico;
	}
	public void setProductoGenerico(ProductoGenerico productoGenerico) {
		this.productoGenerico = productoGenerico;
	}
   
}
