package entidades;

import entidades.Usuario;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioAdmin
 *
 */
@Entity

public class UsuarioAdmin extends Usuario implements Serializable {

	
	private boolean Premiun;
	private List<AlmacenVirtual> almacenesVirtuales;
	
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
	public List<AlmacenVirtual> getAlmacenesVirtuales() {
		return almacenesVirtuales;
	}
	public void setAlmacenesVirtuales(List<AlmacenVirtual> almacenesVirtuales) {
		this.almacenesVirtuales = almacenesVirtuales;
	}
   
}
