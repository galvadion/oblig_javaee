package sapo.fachadaImpl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import sapo.dao.ProductoAlmacenStockDAO;
import sapo.fachada.FachadaProductoAlmacenStock;
import entidades.ProductoAlmacenStock;

@Stateless
public class FachadaProductoAlmacenStockImpl implements FachadaProductoAlmacenStock{
	
	@EJB
	private ProductoAlmacenStockDAO dao; 

	@Override
	public void save(ProductoAlmacenStock productoAlmacenStock) {
		dao.save(productoAlmacenStock);
	}

	@Override
	public ProductoAlmacenStock update(ProductoAlmacenStock productoAlmacenStock) {
		return dao.update(productoAlmacenStock);
	}

	@Override
	public void delete(ProductoAlmacenStock productoAlmacenStock) {
		dao.delete(productoAlmacenStock.getId(), ProductoAlmacenStock.class);
	}

	@Override
	public ProductoAlmacenStock find(int entityID) {
		return dao.find(entityID);
	}

	@Override
	public List<ProductoAlmacenStock> findAll() {
		return dao.findAll();
	}
}
