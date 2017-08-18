/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.bejpahibernatecriteria.dao;

import ac.cr.una.bejpahibernatecriteria.HibernateUtil;
import ac.cr.una.bejpahibernatecriteria.model.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

/**
 *
 * @author jecas
 */
public class EmployeeDAOHibernateImpl implements EmployeeDAO{

    private final Session session = HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public Employee findById(int id) {
        Employee employee = null;
        employee = (Employee) session.get(Employee.class, id);

        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();

        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();

        return employee;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteria = builder.createQuery(Employee.class);
        Root<Employee> employeeRoot = criteria.from(Employee.class);
        criteria.select(employeeRoot);

        employeeList = session.createQuery(criteria).getResultList();
        return employeeList;
    }

    @Override
    public boolean delete(int id) {
        boolean isDeleted = false;
        Employee employee = null;

        session.beginTransaction();
        employee = (Employee) session.get(Employee.class, id);
        session.delete(employee);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }
    
}
