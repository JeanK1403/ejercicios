/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.bejpahibernatecriteria.dao;

import ac.cr.una.bejpahibernatecriteria.HibernateUtil;
import ac.cr.una.bejpahibernatecriteria.model.Department;
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
public class DepartmentDAOHibernateImpl implements DepartmentDAO{

    private final Session session = HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public Department findById(int id) {
        Department deparment = null;
        deparment = (Department) session.get(Department.class, id);

        return deparment;
    }

    @Override
    public Department save(Department department) {
        session.beginTransaction();
        session.save(department);
        session.getTransaction().commit();

        return department;
    }

    @Override
    public Department update(Department deparment) {
        session.beginTransaction();
        session.update(deparment);
        session.getTransaction().commit();

        return deparment;
    }

    @Override
    public List<Department> findAll() {
        List<Department> deparmentList = new ArrayList<>();

        CriteriaBuilder builder = session.getCriteriaBuilder();

        CriteriaQuery<Department> criteria = builder.createQuery(Department.class);
        Root<Department> departmentRoot = criteria.from(Department.class);
        criteria.select(departmentRoot);

        deparmentList = session.createQuery(criteria).getResultList();

        return deparmentList;
    }

    @Override
    public boolean delete(int id) {
        boolean isDeleted = false;
        Department deparment = null;

        session.beginTransaction();
        deparment = (Department) session.get(Department.class, id);
        session.delete(deparment);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }
    
}
