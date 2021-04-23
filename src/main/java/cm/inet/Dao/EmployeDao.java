package cm.inet.Dao;

import cm.inet.Entities.Employe;
import cm.inet.Entities.UpdateEmploye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeDao {

    @Autowired
    private EmployeRepository employeRepository;

    public List<Employe> getEmployes() {
        return employeRepository.findAll();
    }

    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public Employe getEmployeById(Long id) {
        Employe employe = employeRepository.findById(id).get();
        return employe;
    }

    public Employe deleteEmploye(Long id) {
        Employe employe = employeRepository.findById(id).get();
        employeRepository.delete(employe);
        return employe;
    }

    public Employe updateEmploye(Long id, UpdateEmploye updateEmploye) {
        Employe employe = employeRepository.findById(id).get();
        employe.setDepartement(updateEmploye.getDepartement());
        employe.setPhoteFileName(updateEmploye.getPhoteFileName());
        employeRepository.save(employe);
        return employe;
    }
}
