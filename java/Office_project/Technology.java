package Office_project;

public class Technology {
    private String technologyName;
    private String type;



    public Technology(String technologyName, String type) {
        this.technologyName = technologyName;
        this.type = type;
    }

    public void addTechnologyToProject(Project project) {
        project.technologiesUsed.add(this);
    }

    // public void addTechnologyExpertise(Employee employee) {
    //     switch (employee.getTechnologyKnowledge()) {
    //         case "above-high":
    //             employee.setTechExpertise(5);
    //             break;
    //         case "high":
    //             employee.setTechExpertise(4);
    //             break;
    //         case "medium":
    //             employee.setTechExpertise(3);
    //             break;
    //         case "below-medium":
    //             employee.setTechExpertise(2);
    //             break;
    //         case "low":
    //             employee.setTechExpertise(1);
    //             break;
    //         default:
    //             System.out.println("no matches");
    //     }
    // }

    @Override
    public String toString() {
        return "Technology [technologyName=" + technologyName + ", type=" + type + "]";
    }

}
