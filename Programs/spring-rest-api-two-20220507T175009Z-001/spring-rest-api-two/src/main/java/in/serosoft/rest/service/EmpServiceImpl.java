package in.serosoft.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.serosoft.rest.dao.EmpRepository;
import in.serosoft.rest.entity.Emp;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Emp saveEmp(Emp emp) {
		return empRepository.saveEmp(emp);
	}

	@Override
	public Emp updateEmp(Emp emp) {
		return empRepository.updateEmp(emp);
	}

	@Override
	public Emp deleteEmp(int eno) {
		return empRepository.deleteEmp(eno);
	}

	@Override
	public Emp getEmpByEno(int eno) {
		return empRepository.getEmpByEno(eno);
	}

	@Override
	public List<Emp> getAllEmp() {
		return empRepository.getAllEmp();
	}

	@Override
	public List<Emp> getAllEmpByDesg(String desg) {
		return empRepository.getAllEmpByDesg(desg);
	}

}
