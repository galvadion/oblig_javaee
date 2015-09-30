package entidades;

import entidades.Usuario;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioAdmin
 *
 */
@Entity

public class UsuarioAdmin extends Usuario implements Serializable {

	
	private boolean Premiun;
	private static final long serialVersionUID = 1L;

	public UsuarioAdmin() {
		super();
	}   
	public boolean getPremiun() {
		return this.Premiun;
	}

	public void setPremiun(boolean Premiun) {
		this.Premiun = Premiun;
	}
   
}
