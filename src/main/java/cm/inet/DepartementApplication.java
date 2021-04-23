package cm.inet;

import cm.inet.Dao.DepartmentRepository;
import cm.inet.Dao.EmployeRepository;
import cm.inet.Entities.Department;
import cm.inet.Entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Date;

@SpringBootApplication
public class DepartementApplication extends SpringBootServletInitializer implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeRepository employeRepository;

    public static void main(String[] args) {
        SpringApplication.run(DepartementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        employeRepository.save(new Employe("Nfankou", "infomatique", new Date("12/12/2000"), "file1"));
        employeRepository.save(new Employe("Ngoune", "maintenance", new Date("13/12/2000"), "file2"));
        employeRepository.save(new Employe("Tchetche", "ressource humaine", new Date("14/12/2000"), "file3"));
        employeRepository.save(new Employe("Mbatch", "maintenance", new Date("15/12/2000"), "file4"));


        departmentRepository.save(new Department("informatique"));
        departmentRepository.save(new Department("ressoure humaine"));
        departmentRepository.save(new Department("Comptabilité"));
        departmentRepository.save(new Department("Audit"));
        departmentRepository.save(new Department("maintenance"));


    }
}
