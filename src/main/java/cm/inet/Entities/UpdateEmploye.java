package cm.inet.Entities;

import java.util.Date;

public class UpdateEmploye {
    private String departement;
    private Date dateOfJoining;
    private String photeFileName;

    public UpdateEmploye() {
    }

    public UpdateEmploye(String departement, Date dateOfJoining, String photeFileName) {
        this.departement = departement;
        this.dateOfJoining = dateOfJoining;
        this.photeFileName = photeFileName;
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
