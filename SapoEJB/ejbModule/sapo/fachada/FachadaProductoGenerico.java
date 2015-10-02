package sapo.fachada;

import java.util.List;
import javax.ejb.Local;
import entidades.ProductoGenerico;

@Local
public interface FachadaProductoGenerico {

	public abstract void save(ProductoGenerico productoG);
	 
    public abstract ProductoGenerico update(ProductoGenerico productoG);
 
    public abstract void delete(ProductoGenerico productoG);
 
    public abstract ProductoGenerico find(int entityID);
 
    public abstract List<ProductoGenerico> findAll();
	
}
