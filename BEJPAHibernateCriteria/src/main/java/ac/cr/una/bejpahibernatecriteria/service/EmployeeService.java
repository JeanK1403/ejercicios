/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.bejpahibernatecriteria.service;

import ac.cr.una.bejpahibernatecriteria.model.Employee;
import java.util.List;

/**
 *
 * @author jecas
 */
public interface EmployeeService {
    public Employee findById(int id);
    public List<Employee> findAll();
    public Employee save(Employee student);
    public Employee update(Employee student);
    public boolean delete(int id);
}
