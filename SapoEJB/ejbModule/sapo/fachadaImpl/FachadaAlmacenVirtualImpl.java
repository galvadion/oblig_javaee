package sapo.fachadaImpl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import sapo.dao.AlmacenVirtualDAO;
import sapo.fachada.FachadaAlmacenVirtual;
import entidades.AlmacenVirtual;

@Stateless
public class FachadaAlmacenVirtualImpl implements FachadaAlmacenVirtual{

	@EJB
	private AlmacenVirtualDAO dao; 

	@Override
	public void save(AlmacenVirtual almacen) {
		dao.save(almacen);
	}

	@Override
	public AlmacenVirtual update(AlmacenVirtual almacen) {
		return dao.update(almacen);
	}

	@Override
	public void delete(AlmacenVirtual almacen) {
		dao.delete(almacen.getId(), AlmacenVirtual.class);
	}

	@Override
	public AlmacenVirtual find(int entityID) {
		return dao.find(entityID);
	}

	@Override
	public List<AlmacenVirtual> findAll() {
		return dao.findAll();
	}
}
