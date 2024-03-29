package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	//データ呼び出し用のメソッド
	public List<Employee> findByName(String name);
	//名前が一致した人すべてを取得
	public Optional<Employee> findFirstByNameOrderByIdAsc(String name);
	//名前が一致した最初の人を取得
	public List<Employee> findByNameAndDepartment(String name, String department);
	
	public List<Employee> findByNameOrDepartment(String name, String Department);
	
	
}
