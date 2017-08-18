/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.bejpahibernatecriteria.dao;

import ac.cr.una.bejpahibernatecriteria.model.Employee;
import java.util.List;

/**
 *
 * @author jecas
 */
public interface EmployeeDAO {
    public Employee findById (int id);
    public Employee save(Employee employee);
    public Employee update(Employee employee);
    public List<Employee> findAll ();
    public boolean delete(int id); 
}
