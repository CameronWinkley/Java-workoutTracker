import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class ExerciseData {

    private String name;
    private int reps;
    private String nameOfExercise;
    private long duration;
    private long date;
    private double pounds;
    public List<Athlete> athleteList = new ArrayList<Athlete>();
    public List<ExerciseData> eData = new ArrayList<ExerciseData>();

    public ExerciseData()
    {


    }

    public ExerciseData( String eName,int reps,double lbs, long time, long date){
        this.reps = reps;
        nameOfExercise = eName;
        this.duration = time;
        this.date = date;
        pounds = lbs;

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

    public void setDuration(long time) {
        duration = time;
    }

    public long getDuration(){
        return duration;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getDate() {
        return date;
    }

    public void setPounds(double lbs){
        pounds = lbs;
    }

    public double getPounds(){
        return pounds;
    }


}
