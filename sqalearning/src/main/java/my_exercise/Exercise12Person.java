package my_exercise;

public class Exercise12Person {
    private String gender;
    private String name;
    private int age;
     
    public Exercise12Person(){      
    }
     
    public Exercise12Person(String gender, String name, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
     
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
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
        this.age = age;
    }
     
     
}