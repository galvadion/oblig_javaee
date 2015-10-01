package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProductoAlmacenStock
 *
 */
@Entity

public class ProductoAlmacenStock implements Serializable {

	   
	@Id
	private long Id;
	private int Stock;
	private AlmacenVirtual Almacen;
	private ProductoGenerico Producto;
	private static final long serialVersionUID = 1L;

	public ProductoAlmacenStock() {
		super();
	}   
	public long getId() {
		return this.Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}   
	public int getStock() {
		return this.Stock;
	}

	public void setStock(int Stock) {
		this.Stock = Stock;
	}   
	public AlmacenVirtual getAlmacen() {
		return this.Almacen;
	}

	public void setAlmacen(AlmacenVirtual Almacen) {
		this.Almacen = Almacen;
	}   
	public ProductoGenerico getProducto() {
		return this.Producto;
	}

	public void setProducto(ProductoGenerico Producto) {
		this.Producto = Producto;
	}
   
}
