package authorbook;

import org.junit.runner.notification.RunListener.ThreadSafe;

public class Author {
    private String name;
    private String email;
    private char gender;



    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char gender(){
        return this.gender;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }

}
