package entidades;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity

public class Producto implements Serializable {

	   
	@Id
	private long Id;
	private String Nombre;
	private String Descripcion;
	@Transient
	private List<Imagen> Imagenes;
	@ManyToMany
	private List<Etiqueta> Etiquetas;
	@ManyToOne
	private Categoria categoria;
	private int Stock;
	private static final long serialVersionUID = 1L;

	public Producto() {
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
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}   
	public List<Imagen> getImagenes() {
		return this.Imagenes;
	}

	public void setImagenes(List<Imagen> Imagenes) {
		this.Imagenes = Imagenes;
	}   
	public List<Etiqueta> getEtiquetas() {
		return this.Etiquetas;
	}

	public void setEtiquetas(List<Etiqueta> Etiquetas) {
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
