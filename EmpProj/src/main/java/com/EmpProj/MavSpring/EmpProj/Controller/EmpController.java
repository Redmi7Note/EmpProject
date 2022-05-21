package com.EmpProj.MavSpring.EmpProj.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmpProj.MavSpring.EmpProj.Service.EmpService;
import com.EmpProj.MavSpring.EmpProj.pojo.empclass;

@RestController
public class EmpController {

	@Autowired
	private EmpService empserv;
	
	@GetMapping("/employeesalary")
	public List<empclass> getsalary(){
		
		List<empclass> list=empserv.getAll();
		return list;
	}
	
	@PutMapping("employee/update")
	public empclass update(@RequestBody empclass pojo) {
		return empserv.update(pojo);
	}
	
	@GetMapping("empsalary/{id}")
	public Optional<empclass> newemp(@PathVariable("id") int id){
		Optional<empclass> pojo= empserv.repo(id);
		return pojo;
	}
	
}
