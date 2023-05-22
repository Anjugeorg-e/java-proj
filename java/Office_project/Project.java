package Office_project;

import java.util.ArrayList;


public class Project {
    private String projectName;
    private Employee projectHead;
    private String status;

    ArrayList<Employee> projectMembers = new ArrayList<>();
    ArrayList<Technology> technologiesUsed = new ArrayList<>();

   
    public Project(String projectName, Employee projectHead) {
        this.projectName = projectName;
        this.projectHead = projectHead;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Employee getProjectHead() {
        return projectHead;
    }

    public void setProjectHead(Employee projectHead) {
       
            this.projectHead = projectHead;
            this.addEmployeeToProject(projectHead);
        
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addEmployeeToProject(Employee employee) {
        if (employee.getProject() == null)
            this.projectMembers.add(employee);
        employee.setProject(this);
    }

    public void removeEmployeeFromProject(Employee employee) {
        this.projectMembers.remove(employee);
    }

    public void addTechnologiesForProject(Technology technology) {
        this.technologiesUsed.add(technology);
    }

}
