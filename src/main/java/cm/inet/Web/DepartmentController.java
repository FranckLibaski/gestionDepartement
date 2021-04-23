package cm.inet.Web;

import cm.inet.Entities.Department;
import cm.inet.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> get() {
        return departmentService.getDepartments();
    }

    @PostMapping
    public Department post(@RequestBody Department department) {
        return departmentService.createDepartments(department);
    }

    @GetMapping(value = "/{id}")
    public Department getById(@PathVariable("id") Long id) {
        return departmentService.getDepartmentById(id);
    }

    @DeleteMapping(value = "/{id}")
    public Department delete(@PathVariable("id") Long id) {
        return departmentService.deleteDepartment(id);
    }
}
