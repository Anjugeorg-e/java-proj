package personbankmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Person {
    private int age;
    private String name;
    private String gender;
    private String email;
    private String jobTitle;
    private String address;
    ArrayList<Person> friends = new ArrayList<>();

    Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>this.age)
          this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if((gender == "Female") || (gender == "Male") || (gender == "Transgender"))
             this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
        "[a-zA-Z0-9_+&*-]+)*@" +
        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
        "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            if(pat.matcher(email).matches()){
                this.email = email;
            }

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addr) {
        address=addr;
    }

    public void greet() {
        
        System.out.println("Hi " + name + "! ");
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        }
        return false;

    }

    public void addFriend(Person friend) {
        friends.add(friend);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

    public void removeFriend(Person friend) {
        friends.remove(friend);
    }

    public boolean hasFriend(String name) {

        boolean hasFriends = false;
        for (Person friend : friends) {
            if (friend.getName() == name) {
                hasFriends = true;
            }
        }
        return hasFriends;
    }

    public void introduce() {
        System.out.println("Name is: " + name + ", " + "Age is: " + age + ", "
                + "Gender is: " + gender);
    }

    public void printFriends() {
        for (Person friend : friends) {
            System.out.println(friend.getName());
        }
    }

}
