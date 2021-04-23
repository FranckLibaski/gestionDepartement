package cm.inet.Services;

import cm.inet.Dao.DepartmentDao;

import cm.inet.Entities.Department;
import cm.inet.Entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    public List<Department> getDepartments() {
        return departmentDao.getDepartments();
    }

    public Department createDepartments(Department department) {
        return departmentDao.createDepartments(department);
    }

    public Department getDepartmentById(Long id) {
        return departmentDao.getDepartmentById(id);
    }

    public Department deleteDepartment(Long id) {
        return departmentDao.deleteDepartment(id);
    }

}

