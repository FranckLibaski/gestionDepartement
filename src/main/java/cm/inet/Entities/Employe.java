package cm.inet.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeId;
    private String employeName;
    private String departement;
    private Date dateOfJoining;
    private String photeFileName;

    public Employe() {
    }

    public Employe(String employeName, String departement, Date dateOfJoining, String photeFileName) {
        this.employeName = employeName;
        this.departement = departement;
        this.dateOfJoining = dateOfJoining;
        this.photeFileName = photeFileName;
    }

    public Long getEmployeId() {
        return employeId;
    }

    public void setEmployeId(Long employeId) {
        this.employeId = employeId;
    }

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getPhoteFileName() {
        return photeFileName;
    }

    public void setPhoteFileName(String photeFileName) {
        this.photeFileName = photeFileName;
    }
}
