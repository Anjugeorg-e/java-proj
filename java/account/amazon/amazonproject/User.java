package amazonproject;

public class User {
    private String Name;
    private int age;
    private string gender;

    
    public User(String name, int age, string gender) {
        Name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public string getGender() {
        return gender;
    }

    public void setGender(string gender) {
        this.gender = gender;
    }

    public boolean createUserAccount(Account acc, String password){
        acc.setUserName(Name);
        acc.setPassword(password);

    }
    
    @Override
    public String toString() {
        return "User [Name=" + Name + ", age=" + age + ", gender=" + gender + "]";
    }}
