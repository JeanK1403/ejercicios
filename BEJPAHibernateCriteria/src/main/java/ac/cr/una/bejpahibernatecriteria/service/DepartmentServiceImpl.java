/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.bejpahibernatecriteria.service;

import ac.cr.una.bejpahibernatecriteria.dao.DepartmentDAO;
import ac.cr.una.bejpahibernatecriteria.model.Department;
import java.util.List;

/**
 *
 * @author jecas
 */
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentDAO departmentDAO;
    
    @Override
    public Department findById(int id) {
        return departmentDAO.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentDAO.findAll();
    }

    @Override
    public Department save(Department department) {
        return departmentDAO.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentDAO.update(department);
    }

    @Override
    public boolean delete(int id) {
        return departmentDAO.delete(id);
    }
    
}
