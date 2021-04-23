package cm.inet.Services;


import cm.inet.Dao.EmployeDao;
import cm.inet.Entities.Employe;
import cm.inet.Entities.UpdateEmploye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
    @Autowired
    private EmployeDao employeDao;

    public List<Employe> getEmployes() {
        return employeDao.getEmployes();
    }

    public Employe createEmploye(Employe employe) {
        return employeDao.createEmploye(employe);
    }

    public Employe getEmployeById(Long id) {
        return employeDao.getEmployeById(id);
    }

    public Employe deleteEmploye(Long id) {
        return employeDao.deleteEmploye(id);
    }

    public Employe updateEmploye(Long id, UpdateEmploye updateEmploye) {
        return employeDao.updateEmploye(id, updateEmploye);
    }
}
