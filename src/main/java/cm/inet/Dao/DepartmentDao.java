package cm.inet.Dao;

import cm.inet.Entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DepartmentDao {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    public Department createDepartments(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id).get();
        return department;
    }

    public Department deleteDepartment(Long id) {
        Department department = departmentRepository.findById(id).get();
        departmentRepository.delete(department);
        return department;
    }
}
