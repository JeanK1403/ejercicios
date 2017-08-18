/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.bejpahibernatecriteria.service;

import ac.cr.una.bejpahibernatecriteria.model.Department;
import java.util.List;

/**
 *
 * @author jecas
 */
public interface DepartmentService {
    public Department findById(int id);
    public List<Department> findAll();
    public Department save(Department student);
    public Department update(Department student);
    public boolean delete(int id);
}
