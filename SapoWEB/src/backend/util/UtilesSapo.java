package backend.util;


import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class UtilesSapo {

	
	public static void crearFacesMEssage(Severity severidad, String mensaje, String descricpion){
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, descricpion));
	}
	
	public static boolean isNullOrEmpty(String texto){
		return texto == null || texto.equals("");
	}
	
}