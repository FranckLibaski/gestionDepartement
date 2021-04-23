package cm.inet.Web;

import cm.inet.Entities.Employe;
import cm.inet.Entities.UpdateEmploye;
import cm.inet.Services.EmployeReport;
import cm.inet.Services.EmployeService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/employe")
public class EmployeController {
    @Autowired
    private EmployeService employeService;
    @Autowired
    private EmployeReport employeReport;

    @GetMapping
    public List<Employe> get() {
        return employeService.getEmployes();
    }

    @PostMapping
    public Employe post(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }

    @GetMapping(value = "/{id}")
    public Employe getById(@PathVariable("id") Long id) {
        return employeService.getEmployeById(id);
    }

    @DeleteMapping(value = "/{id}")
    public Employe delete(@PathVariable("id") Long id) {
        return employeService.deleteEmploye(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Employe put(@PathVariable("id") Long id, @RequestBody UpdateEmploye updateEmploye) {
        return employeService.updateEmploye(id, updateEmploye);
    }

    @GetMapping(value = "/report/{format}")
    public String reportGenerate(@PathVariable("format") String format) throws FileNotFoundException, JRException {
        return employeReport.exportReport(format);
    }
}
