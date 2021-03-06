package backend.beans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import backend.util.UtilesSapo;
import entidades.Tienda;
import sapo.fachada.FachadaTienda;

@ManagedBean
@RequestScoped
public class TiendaBean {

	@EJB
	FachadaTienda fachadaTienda;
	
	private String nombre;
	private String logo;
	private String template;
	private String infoTenant = "1";

	public String crearTienda(){
		
		/**
		 * Validaciones
		 */
		if(UtilesSapo.isNullOrEmpty(nombre))			
			UtilesSapo.crearFacesMEssage(FacesMessage.SEVERITY_ERROR, "El campo nombre es obligatorio", null);
		else if(UtilesSapo.isNullOrEmpty(logo))
			UtilesSapo.crearFacesMEssage(FacesMessage.SEVERITY_ERROR, "El campo logo es obligatorio", null);
		else if(UtilesSapo.isNullOrEmpty(template))
			UtilesSapo.crearFacesMEssage(FacesMessage.SEVERITY_ERROR, "El campo template es obligatorio", null);
		else if(UtilesSapo.isNullOrEmpty(infoTenant))
			UtilesSapo.crearFacesMEssage(FacesMessage.SEVERITY_ERROR, "El campo infoTenant es obligatorio", null);
		else
		{
			try
			{
				Tienda t = new Tienda();
				t.setNombre(nombre);
				t.setLogo(logo);
				t.setInfoTenant(infoTenant);
				t.setTemplate(template);
				fachadaTienda.save(t);
				
				UtilesSapo.crearFacesMEssage(FacesMessage.SEVERITY_INFO, "Se ha creado una Tienda correctamente", null);
				
				return "/backend/home.xhtml";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "";
			}
		}
		return "";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getInfoTenant() {
		return infoTenant;
	}

	public void setInfoTenant(String infoTenant) {
		this.infoTenant = infoTenant;
	}

}