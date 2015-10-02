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
	public void save(Tienda users) {
		dao.save(users);
	}

	@Override
	public Tienda update(Tienda users) {
		return dao.update(users);
	}

	@Override
	public void delete(Tienda users) {
		dao.delete(users.getId(), Tienda.class);
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
