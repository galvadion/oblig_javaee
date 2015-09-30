package entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity

public class Producto implements Serializable {

	   
	@Id
	private ObjectId Id;
	private String Nombre;
	private String Descripcion;
	private List<Imagenes> Imagenes;
	private List<Etiquetas> Etiquetas;
	private Categoria categoria;
	private int Stock;
	private static final long serialVersionUID = 1L;

	public Producto() {
		super();
	}   
	public ObjectId getId() {
		return this.Id;
	}

	public void setId(ObjectId Id) {
		this.Id = Id;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}   
	public List<Imagenes> getImagenes() {
		return this.Imagenes;
	}

	public void setImagenes(List<Imagenes> Imagenes) {
		this.Imagenes = Imagenes;
	}   
	public List<Etiquetas> getEtiquetas() {
		return this.Etiquetas;
	}

	public void setEtiquetas(List<Etiquetas> Etiquetas) {
		this.Etiquetas = Etiquetas;
	}   
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}   
	public int getStock() {
		return this.Stock;
	}

	public void setStock(int Stock) {
		this.Stock = Stock;
	}
   
}
