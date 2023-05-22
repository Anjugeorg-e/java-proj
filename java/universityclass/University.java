package universityclass;

import java.util.ArrayList;

import javax.crypto.spec.DESKeySpec;

import Student.Student;

public class University {

    private Department department;
    ArrayList<Student> listOfSTudents = new ArrayList<>();
    ArrayList<Department> listOfDepartments = new ArrayList<>();
    ArrayList<Faculty> listOfFacultyMembers = new ArrayList<>();

    public ArrayList<Department> getListOfDepartments() {
        return listOfDepartments;
    }

    public void addStudentToList(Student student) {
        listOfSTudents.add(student);

    }

    public void removeStudentFromList(Student student) {
        listOfSTudents.remove(student);

    }

    public void addDepartmentToList(Department department) {
        listOfDepartments.add(department);

    }

    public void removeDepartmentFromList(Department department) {
        listOfDepartments.remove(department);

    }

    public void addFacultyMemebersFromList(Faculty faculty) {
        listOfFacultyMembers.add(faculty);

    }

    public void removeFacultyMemberFRomList(Faculty faculty) {
        listOfFacultyMembers.remove(faculty);

    }

    // public boolean findDepartment(String name) {
    // boolean isDepartment = false;
    // for (Department departments : listOfDepartments) {
    // if (departments.getDepartmentame() == name) {
    // isDepartment = true;
    // }
    // }
    // return isDepartment;

    // }

    public Department findDepartment(String departmnetName) {

        for (Department departments : listOfDepartments) {
            if (departments.getDepartmentName() == departmnetName) {
                department = departments;
            }
        }
        return department;

    }

}
