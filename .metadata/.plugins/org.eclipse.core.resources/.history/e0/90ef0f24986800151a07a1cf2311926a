package entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: RegistroMovimientos
 *
 */
@Entity

public class RegistroMovimientos implements Serializable {

	   
	@Id
	private long Id;
	private Producto Producto;
	private UsuarioCliente Usuario;
	private double Precio;
	private int movimiento;
	private Date Fecha;
	private AlmacenVirtual Almacen;
	private static final long serialVersionUID = 1L;

	public RegistroMovimientos() {
		super();
	}   
	public long getId() {
		return this.Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}   
	public Producto getProducto() {
		return this.Producto;
	}

	public void setProducto(Producto Producto) {
		this.Producto = Producto;
	}   
	public UsuarioCliente getUsuario() {
		return this.Usuario;
	}

	public void setUsuario(UsuarioCliente Usuario) {
		this.Usuario = Usuario;
	}   

	public Date getFecha() {
		return this.Fecha;
	}

	public void setFecha(Date Fecha) {
		this.Fecha = Fecha;
	}   
	public AlmacenVirtual getAlmacen() {
		return this.Almacen;
	}

	public void setAlmacen(AlmacenVirtual Almacen) {
		this.Almacen = Almacen;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}
   
}
