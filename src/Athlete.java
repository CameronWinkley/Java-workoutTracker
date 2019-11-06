import java.util.ArrayList;
import java.util.List;

public class Athlete {

    private String name;
    private int age;
    private float weight;
    private float height;
    private String sport;
    public List<Athlete> athleteList = new ArrayList<>();


    public Athlete(String name, int age, float weight, float height, String sport){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sport = sport;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return height;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public String getSport(){
        return sport;
    }

    @Override
    public String toString() {
        return  name +" "+ " age: " + age + " weighing in at: " + weight + " lbs "+ "Standing at : " + height + " Inches "+ " ,The sport of choice is: " + sport;
    }
}
