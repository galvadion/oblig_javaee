	package sapo.dao;
	 
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	 
	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;
	import javax.persistence.Query;
	import javax.persistence.criteria.CriteriaQuery;
	 
	public abstract class GenericDAO<T> {
	    private final static String UNIT_NAME = "Sapo-JPA";
	 
	    @PersistenceContext(unitName = UNIT_NAME)
	    private EntityManager em;
	 
	    private Class<T> entityClass;
	 
	    public GenericDAO(Class<T> entityClass) {
	        this.entityClass = entityClass;
	    }
	 
	    public void save(T entity) {
	        em.persist(entity);
	    }
	 
	    public void delete(Object id, Class<T> classe) {
	        T entityToBeRemoved = em.getReference(classe, id);
	 
	        em.remove(entityToBeRemoved);
	    }
	 
	    public T update(T entity) {
	        return em.merge(entity);
	    }
	 
	    public T find(int entityID) {
	        return em.find(entityClass, entityID);
	    }
	 
	    @SuppressWarnings({ "unchecked", "rawtypes" })
	    public List<T> findAll() {
	        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
	        cq.select(cq.from(entityClass));
	        return em.createQuery(cq).getResultList();
	    }
	    
	    @SuppressWarnings("unchecked")
	    protected T findOneResult(String namedQuery, Map<String, Object> parameters) {
	        T result = null;
	 
	        try {
	            Query query = em.createNamedQuery(namedQuery);
	            
	            //M�todo que va a cargar los par�metros si no son nulos
	            if (parameters != null && !parameters.isEmpty()) {
	                populateQueryParameters(query, parameters);
	            }
	 
	            result = (T) query.getSingleResult();
	 
	        } catch (Exception e) {
	            System.out.println("Error ejecutando query: " + e.getMessage());
	            e.printStackTrace();
	        }
	 
	        return result;
	    }
	 
	    private void populateQueryParameters(Query query, Map<String, Object> parameters) {
	 
	        for (Entry<String, Object> entry : parameters.entrySet()) {
	            query.setParameter(entry.getKey(), entry.getValue());
	        }
	    }
	}