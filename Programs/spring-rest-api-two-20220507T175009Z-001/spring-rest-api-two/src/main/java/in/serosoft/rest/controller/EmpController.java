package in.serosoft.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.serosoft.rest.entity.Emp;
import in.serosoft.rest.service.EmpService;

@RestController
@RequestMapping("/employees")
public class EmpController {
	@Autowired
	private EmpService empService;

	// an api for getting an emp by eno
	@GetMapping(value = "/job/{desg}", produces = "application/json")
	public List<Emp> showEmpByDesg(@PathVariable("desg") String desg) {
		return empService.getAllEmpByDesg(desg);
	}

	// an api for getting an emp by eno
	@GetMapping(value = "/{code}", produces = "application/json")
	public Emp showEmpByEno(@PathVariable("code") int eno) {
		Emp emp = empService.getEmpByEno(eno);
		return emp;
	}

	// an api for deleting a resource (emp) (delete)
	@DeleteMapping(value = "/{code}", produces = "application/json")
	public Emp deleteEmpData(@PathVariable("code") int eno) {
		return empService.deleteEmp(eno);
	}

	// an api for updating a resource (emp) (changes/update)
	@PutMapping(produces = "application/json", consumes = "application/json")
	public Emp updateEmpData(@RequestBody Emp emp) {
		return empService.updateEmp(emp);
	}

	// an api for creating a new resource (emp) (save/insert)
	@PostMapping(produces = "application/json", consumes = "application/json")
	public Emp saveEmpData(@RequestBody Emp emp) {
		return empService.saveEmp(emp);
	}

	// an api for getting all employees
	@GetMapping(produces = "application/json")
	public List<Emp> showAllEmployees() {
		return empService.getAllEmp();
	}

}
