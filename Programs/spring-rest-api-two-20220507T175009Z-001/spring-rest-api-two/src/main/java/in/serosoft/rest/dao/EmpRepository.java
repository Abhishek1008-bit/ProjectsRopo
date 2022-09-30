package in.serosoft.rest.dao;

import java.util.List;

import in.serosoft.rest.entity.Emp;

public interface EmpRepository {
	public Emp saveEmp(Emp emp);
	public Emp updateEmp(Emp emp);
	public Emp deleteEmp(int eno);
	public Emp getEmpByEno(int eno);
	public List<Emp> getAllEmp();
	public List<Emp> getAllEmpByDesg(String desg);
	
}
