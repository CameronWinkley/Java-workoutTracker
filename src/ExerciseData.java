import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class ExerciseData {

    private int reps;
    private String nameOfExercise;
    private Time duration;
    private Date date;
    private double pounds;
    private double kiloGrams;
    public List<Athlete> athleteList = new ArrayList<Athlete>();

    public ExerciseData()
    {


    }


    public ExerciseData(int reps, String name, Time time, Date date, double lbs, double kg){
        this.reps = reps;
        nameOfExercise = name;
        this.duration = time;
        this.date = date;
        pounds = lbs;
        kiloGrams = kg;
    }

    public void setReps(int reps){
        this.reps = reps;
    }

    public int getReps() {
        return reps;
    }

    public void setNameOfExercise(String name) {
        nameOfExercise = name;
    }

    public String getNameOfExercise() {
        return nameOfExercise;
    }

    public void setDuration(Time time) {
        duration = time;
    }

    public Time getDuration(){
        return duration;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setPounds(double lbs){
        pounds = lbs;
    }

    public double getPounds(){
        return pounds;
    }

    public void setKiloGrams(double kg){
        kiloGrams = kg;
    }

    public double getKiloGrams(){
        return kiloGrams;
    }

}
