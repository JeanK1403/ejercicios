/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.bejpahibernatecriteria.service;

import ac.cr.una.bejpahibernatecriteria.dao.EmployeeDAO;
import ac.cr.una.bejpahibernatecriteria.model.Employee;
import java.util.List;

/**
 *
 * @author jecas
 */
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;
    
    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeDAO.update(employee);
    }

    @Override
    public boolean delete(int id) {
        return employeeDAO.delete(id);
    }
    
}
