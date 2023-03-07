package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String setFirst){
        firstName = setFirst;
    }
    public void setLastName(String setLast){
        lastName = setLast;
    }
    public void setAge(int setAge){
        if (setAge < 0 || setAge > 100) age = 0;
        age = setAge;
    }
    public boolean isTeen(){
        return age > 12 && age < 20;
    }
    public String getFullName(){
        if (firstName.isEmpty()  && lastName.isEmpty()){
            return "";
        } else if (firstName.isEmpty()){
            return lastName;
        }else if (lastName.isEmpty()){
            return firstName;
        }else{
            return firstName + " " + lastName;
        }
    }
}
