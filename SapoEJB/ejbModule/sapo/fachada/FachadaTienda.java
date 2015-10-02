package sapo.fachada;

import java.util.List;

import javax.ejb.Local;

import entidades.Tienda;

@Local
public interface FachadaTienda {

	public abstract void save(Tienda tienda);
	 
    public abstract Tienda update(Tienda tienda);
 
    public abstract void delete(Tienda tienda);
 
    public abstract Tienda find(int entityID);
 
    public abstract List<Tienda> findAll();
	
}
