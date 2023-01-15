package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	//operação responsável por inserir os banco de dados
		void insert(Seller obj);
		void update(Seller obj);
		void deleteByTd(Integer id);
		Seller findByTd(Integer id);//vai pegar esse id e consultar
		List<Seller> findAll();
		List<Seller> findByDepartment(Department department);
}
