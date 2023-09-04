package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;//Repositoryを変数として定義。
    
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {//コンストラクタとして他クラスであるEmployeeRepositoryを持ってきた
    	this.employeeRepository = employeeRepository;
    }
    //処理用のロジックを書く
    public List<Employee> findAllEmployee(){//リストとして帰ってくる
    	return this.employeeRepository.findAll();//インジェクションしたemployeeRepoの中から全部取ってくる
    	
    }
    
    public Employee findEmployee(Integer employeeId) {
    	Optional<Employee> optionalEmployee = this.employeeRepository.findById(employeeId);
    	Employee employee = optionalEmployee.get();
    	return employee;
    }
    
    public List<Employee> findByName(String name){
    	return this.employeeRepository.findByName(name);
    }
    
    public Employee insert(String name, String department) {
    	Employee employee = new Employee();
    	
    	employee.setName(name);
    	employee.setDepartment(department);
    	
    	return this.employeeRepository.save(employee);
    }
    
    public Employee update(Integer employeeId, String name, String department) {
    	Optional<Employee> optionalEmployee = this.employeeRepository.findById(employeeId);
    	Employee employee = optionalEmployee.get();
    	
    	employee.setName(name);
    	employee.setDepartment(department);
    	
    	//データベースに保存
    	return this.employeeRepository.save(employee);
    }
    
    public void delete(Integer id) {
    	this.employeeRepository.deleteById(id);
    }
}
