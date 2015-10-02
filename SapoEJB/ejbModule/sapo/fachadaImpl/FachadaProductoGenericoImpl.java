package sapo.fachadaImpl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import sapo.dao.ProductoGenericoDAO;
import sapo.fachada.FachadaProductoGenerico;
import entidades.ProductoGenerico;

@Stateless
public class FachadaProductoGenericoImpl implements FachadaProductoGenerico {

	@EJB
	private ProductoGenericoDAO dao; 

	@Override
	public void save(ProductoGenerico productoG) {
		dao.save(productoG);
	}

	@Override
	public ProductoGenerico update(ProductoGenerico productoG) {
		return dao.update(productoG);
	}

	@Override
	public void delete(ProductoGenerico productoG) {
		dao.delete(productoG.getId(), ProductoGenerico.class);
	}

	@Override
	public ProductoGenerico find(int entityID) {
		return dao.find(entityID);
	}

	@Override
	public List<ProductoGenerico> findAll() {
		return dao.findAll();
	}
}
