package backend.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import backend.util.SessionBean;

@ManagedBean
@SessionScoped
public class LoginBackend {

	private String user;
	private String pass;
	private String msg;

	
	
	public String validateSuperAdmin(){
		
		boolean valid = validarLogin(user, pass);
		
		if(valid){
			HttpSession session = SessionBean.getSession();
            session.setAttribute("username", user);
            return "home.xhtml";
		}
		else{
			FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
	

				return "login.xhtml";
		}	
	}
	
    public String logout() {
        HttpSession session = SessionBean.getSession();
        session.invalidate();
        return "login.xhtml";
    }
    
    public boolean checkLogin()
    {
    	HttpSession session = SessionBean.getSession();
    	if(session.getAttribute("username") != null)
    		return true;
    	return false;
    }
	

	/**
	 * Método que va a verificar nombre y usuario del superUsuario, lo podemos mejorar o dejar asi de sencillo
	 * @param user2
	 * @param pass2
	 * @return
	 */
	private boolean validarLogin(String user, String pass) {
		
		if("admin".equals(user) && "admin".equals(pass))
			return true;
		
		return false;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}