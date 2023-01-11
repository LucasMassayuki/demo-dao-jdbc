package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	//operação responsável por inserir os banco de dados
	void insert(Department obj);
	void update(Department obj);
	void deleteByTd(Integer id);
	Department findByTd(Integer id);//vai pegar esse id e consultar
	List<Department> findAll();
}
