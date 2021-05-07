package gamerController.conretes;

import gamerController.abstracts.BaseService;

public  class BaseManager <T> implements BaseService<T> {

	@Override
	public void add(T entity) {
		System.out.println("Added");
		
	}

	@Override
	public void update(T entity) {
		System . out . println ( " Updated " );
	}

	@Override
	public void delete(T entity) {
		System.out.println("Deleted");
		
	}
	

}
