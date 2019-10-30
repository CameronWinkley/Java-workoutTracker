public class Athlete {

    private String name;
    private int age;
    private float weight;
    private float height;


    public Athlete(){

    }


    public Athlete(String name, int age, float weight, float height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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

    @Override
    public String toString() {
        return "name: " + name + " age: " + age + " weight: " + weight + " height: " + height;
    }
}
