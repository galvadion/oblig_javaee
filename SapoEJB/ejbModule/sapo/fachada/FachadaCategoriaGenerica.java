package sapo.fachada;

import java.util.List;
import entidades.CategoriaGenerica;

public interface FachadaCategoriaGenerica {
	
	public abstract void save(CategoriaGenerica categoriaG);
	 
    public abstract CategoriaGenerica update(CategoriaGenerica categoriaG);
 
    public abstract void delete(CategoriaGenerica categoriaG);
 
    public abstract CategoriaGenerica find(int entityID);
 
    public abstract List<CategoriaGenerica> findAll();
}
