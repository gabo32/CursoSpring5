package com.juangb.springboot.app.models.dao;

import java.util.List;

import com.juangb.springboot.app.models.entities.Cliente;

public interface IClienteDao {
	public List<Cliente> findAll();
}
