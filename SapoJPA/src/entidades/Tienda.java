package entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tienda
 *
 */
@Entity

public class Tienda implements Serializable {

	   
	@Id
	private long Id;
	private String Nombre;
	private String Logo;
	private String Template;
	private String infoTenant;
	private static final long serialVersionUID = 1L;

	public Tienda() {
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
	public String getLogo() {
		return this.Logo;
	}

	public void setLogo(String Logo) {
		this.Logo = Logo;
	}   
	public String getTemplate() {
		return this.Template;
	}

	public void setTemplate(String Template) {
		this.Template = Template;
	}   
	public String getInfoTenant() {
		return this.infoTenant;
	}

	public void setInfoTenant(String infoTenant) {
		this.infoTenant = infoTenant;
	}
   
}
