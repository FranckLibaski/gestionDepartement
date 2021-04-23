package cm.inet.Services;

import cm.inet.Dao.EmployeRepository;
import cm.inet.Entities.Employe;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeReport {
    @Autowired
    private EmployeRepository employeRepository;
    String path = "C:\\Users\\Franck Libaski\\Desktop";

    public String exportReport(String reportFormat) throws FileNotFoundException,JRException {
        List<Employe> employes = employeRepository.findAll();

        File file = ResourceUtils.getFile("classpath:employe.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employes);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("CreateBy", "Franck Libaski");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

        if (reportFormat.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(jasperPrint,path + "\\employe.html");
        }if (reportFormat.equalsIgnoreCase("pdf")){
            JasperExportManager.exportReportToPdfFile(jasperPrint,path + "\\employe.pdf" );
        }
        return "report generate in path:" + path;
    }
}
