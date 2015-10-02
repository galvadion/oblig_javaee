package sapo.fachada;

import java.util.List;

import javax.ejb.Local;

import entidades.AlmacenVirtual;

@Local
public interface FachadaAlmacenVirtual {

	public abstract void save(AlmacenVirtual almacen);
	 
    public abstract AlmacenVirtual update(AlmacenVirtual almacen);
 
    public abstract void delete(AlmacenVirtual almacen);
 
    public abstract AlmacenVirtual find(int entityID);
 
    public abstract List<AlmacenVirtual> findAll();
	
}
