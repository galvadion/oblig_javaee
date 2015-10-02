package sapo.fachada;

import java.util.List;

import javax.ejb.Local;
import entidades.ProductoAlmacenStock;

@Local
public interface FachadaProductoAlmacenStock {

	public abstract void save(ProductoAlmacenStock productoAlmacenStock);
	 
    public abstract ProductoAlmacenStock update(ProductoAlmacenStock productoAlmacenStock);
 
    public abstract void delete(ProductoAlmacenStock productoAlmacenStock);
 
    public abstract ProductoAlmacenStock find(int entityID);
 
    public abstract List<ProductoAlmacenStock> findAll();
	
}
