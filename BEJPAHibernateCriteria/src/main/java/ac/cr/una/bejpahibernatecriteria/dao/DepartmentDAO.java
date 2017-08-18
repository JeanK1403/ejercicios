/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.bejpahibernatecriteria.dao;

import ac.cr.una.bejpahibernatecriteria.model.Department;
import java.util.List;

/**
 *
 * @author jecas
 */
public interface DepartmentDAO {
    public Department findById (int id);
    public Department save(Department department);
    public Department update(Department deparment);
    public List<Department> findAll ();
    public boolean delete(int id); 
}
