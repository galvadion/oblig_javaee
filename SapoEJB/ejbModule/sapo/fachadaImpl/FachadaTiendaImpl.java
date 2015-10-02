package sapo.fachadaImpl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import sapo.dao.TiendaDAO;
import sapo.fachada.FachadaTienda;
import entidades.Tienda;

@Stateless
public class FachadaTiendaImpl implements FachadaTienda{

	@EJB
	private TiendaDAO dao; 

	@Override
	public void save(Tienda tienda) {
		dao.save(tienda);
	}

	@Override
	public Tienda update(Tienda tienda) {
		return dao.update(tienda);
	}

	@Override
	public void delete(Tienda tienda) {
		dao.delete(tienda.getId(), Tienda.class);
	}

	@Override
	public Tienda find(int entityID) {
		return dao.find(entityID);
	}

	@Override
	public List<Tienda> findAll() {
		return dao.findAll();
	}
}
