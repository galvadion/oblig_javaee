package entidades;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Notificaciones
 *
 */
@Entity

public class Notificaciones implements Serializable {

	@Id
	private long Id;
	private String Mensaje;
	private Date Fecha;
	private boolean Leida;
	private Usuario Usuario;
	private static final long serialVersionUID = 1L;

	public Notificaciones() {
		super();
	}   
	public long getId() {
		return this.Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}   
	public String getMensaje() {
		return this.Mensaje;
	}

	public void setMensaje(String Mensaje) {
		this.Mensaje = Mensaje;
	}   
	public Date getFecha() {
		return this.Fecha;
	}

	public void setFecha(Date Fecha) {
		this.Fecha = Fecha;
	}   
	public boolean getLeida() {
		return this.Leida;
	}

	public void setLeida(boolean Leida) {
		this.Leida = Leida;
	}   
	public Usuario getUsuario() {
		return this.Usuario;
	}

	public void setUsuario(Usuario Usuario) {
		this.Usuario = Usuario;
	}
   
}
