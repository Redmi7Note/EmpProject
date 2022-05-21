package com.EmpProj.MavSpring.EmpProj.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmpProj.MavSpring.EmpProj.pojo.empclass;

public interface EmpRepository extends JpaRepository<empclass, Integer>{

}
