package sapo.fachadaImpl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import sapo.dao.CategoriaGenericaDAO;
import sapo.fachada.FachadaCategoriaGenerica;
import entidades.CategoriaGenerica;

@Stateless
public class FachadaCategoriaGenericaImpl implements FachadaCategoriaGenerica {

	@EJB
	private CategoriaGenericaDAO dao; 

	@Override
	public void save(CategoriaGenerica categoriaG) {
		dao.save(categoriaG);
	}

	@Override
	public CategoriaGenerica update(CategoriaGenerica categoriaG) {
		return dao.update(categoriaG);
	}

	@Override
	public void delete(CategoriaGenerica categoriaG) {
		dao.delete(categoriaG.getId(), CategoriaGenerica.class);
	}

	@Override
	public CategoriaGenerica find(int entityID) {
		return dao.find(entityID);
	}

	@Override
	public List<CategoriaGenerica> findAll() {
		return dao.findAll();
	}

}
