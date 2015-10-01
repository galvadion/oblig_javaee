package entidades;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comentario
 *
 */
@Entity

public class Comentario implements Serializable {

	   
	@Id
	private long Id;
	private String Comentario;
	private AlmacenVirtual Almacen;
	private Date Fecha;
	private UsuarioCliente Usuario;
	private static final long serialVersionUID = 1L;

	public Comentario() {
		super();
	}   
	public long getId() {
		return this.Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}   
	public String getComentario() {
		return this.Comentario;
	}

	public void setComentario(String Comentario) {
		this.Comentario = Comentario;
	}   
	public AlmacenVirtual getAlmacen() {
		return this.Almacen;
	}

	public void setAlmacen(AlmacenVirtual Almacen) {
		this.Almacen = Almacen;
	}   
	public Date getFecha() {
		return this.Fecha;
	}

	public void setFecha(Date Fecha) {
		this.Fecha = Fecha;
	}   
	public UsuarioCliente getUsuario() {
		return this.Usuario;
	}

	public void setUsuario(UsuarioCliente Usuario) {
		this.Usuario = Usuario;
	}
   
}
