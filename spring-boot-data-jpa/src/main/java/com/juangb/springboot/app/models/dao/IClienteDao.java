package com.juangb.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.juangb.springboot.app.models.entities.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
	
	
	
	
	//estos metodos ya no se usan
//	public List<Cliente> findAll();
//	
//	public void save(Cliente cliente);
//	
//	public Cliente findOne(Long id);
//	
//	public void delete(Long id);
}
