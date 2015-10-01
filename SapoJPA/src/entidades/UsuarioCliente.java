package entidades;

import entidades.Usuario;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioCliente
 *
 */
@Entity

public class UsuarioCliente extends Usuario implements Serializable {

	
	private AlmacenVirtual Almacen;
	private static final long serialVersionUID = 1L;

	public UsuarioCliente() {
		super();
	}   
	public AlmacenVirtual getAlmacen() {
		return this.Almacen;
	}

	public void setAlmacen(AlmacenVirtual Almacen) {
		this.Almacen = Almacen;
	}
   
}
