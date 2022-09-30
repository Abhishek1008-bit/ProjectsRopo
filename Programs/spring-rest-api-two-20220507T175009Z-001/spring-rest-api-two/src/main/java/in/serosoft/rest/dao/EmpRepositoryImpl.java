package in.serosoft.rest.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.serosoft.rest.entity.Emp;

@Repository
public class EmpRepositoryImpl implements EmpRepository {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Emp saveEmp(Emp emp) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
		return emp;
	}

	@Override
	public Emp updateEmp(Emp emp) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(emp);
		tr.commit();
		session.close();
		return emp;
	}

	@Override
	public Emp deleteEmp(int eno) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Emp emp=getEmpByEno(eno);
		session.delete(emp);
		tr.commit();
		session.close();
		return emp;
	}

	@Override
	public Emp getEmpByEno(int eno) {
		Session session=sessionFactory.openSession();
		Emp emp=session.get(Emp.class, eno);
		session.close();
		return emp;
	}

	@Override
	public List<Emp> getAllEmp() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		List<Emp> employees=criteria.list();
		session.close();
		return employees;
	}

	@Override
	public List<Emp> getAllEmpByDesg(String desg) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		criteria.add(Restrictions.eq("desg", desg));
		List<Emp> employees=criteria.list();
		session.close();
		return employees;
	}

}
