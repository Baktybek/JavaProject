package technicalTasks;

public class Student {

    private String name;
    private int age;
    private String color;
    private char gender;


    public Student(String name, String color, int age, char gender){

        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
    }


    public String getName(String name){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }


    public void eating(){
        System.out.println("Student is eating.");
    }

    public void dringking(){
        System.out.println("Student is drinking.");
    }
}
