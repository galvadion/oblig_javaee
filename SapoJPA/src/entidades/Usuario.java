package entidades;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public abstract class Usuario implements Serializable {

	   
	@Id
	private long Id;
	private String Nombre;
	private String Nick;
	private String Password;
	private String Email;
	private List<Notificaciones> Notificaciones;
	private static final long serialVersionUID = 1L;

	public Usuario() {
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
	public String getNick() {
		return this.Nick;
	}

	public void setNick(String Nick) {
		this.Nick = Nick;
	}   
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}   
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}   
	public List<Notificaciones> getNotificaciones() {
		return this.Notificaciones;
	}

	public void setNotificaciones(List<Notificaciones> Notificaciones) {
		this.Notificaciones = Notificaciones;
	}
   
}
