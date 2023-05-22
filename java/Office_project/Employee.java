package Office_project;

import java.util.ArrayList;
import java.util.HashMap;


public class Employee {

    private String name;
    private int id;
    private Project Assignedproject;
    // private String technologyKnowledge;
    // private int techExpertise;

    // ArrayList<Technology>technologiesKnown = new ArrayList<>();
    HashMap<Technology, Integer>techExpertise = new HashMap<Technology, Integer>();

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

 

    // public void setTechnologyKnowledge(String technologyKnowledge, Technology technology) {
    //     this.technologyKnowledge = technologyKnowledge;
    // }

    // public int getTechExpertise() {
    //     return techExpertise;
    // }

    // public void setTechExpertise(int techExpertise) {
    //     this.techExpertise = techExpertise;
    // }

    // public String getTechnologyKnowledge() {
    //     return technologyKnowledge;
    // }

    public Project getProject() {
        return Assignedproject;

    }

    public void setProject(Project project) {
        this.Assignedproject = project;

    }

    public HashMap<Technology, Integer> getTechExpertise() {
        return techExpertise;
    }

    public void setTechExpertise(HashMap<Technology, Integer> techExpertise) {
        this.techExpertise = techExpertise;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", techExpertise=" + techExpertise + "]";
    }
  


}
