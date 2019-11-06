import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class app {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String choice = "";
        int option = 0;


        System.out.println("Welcome to logging your fitness");
        do {

            System.out.println("What would you like to do?");
            System.out.println("1.Add an Athlete");
            System.out.println("2.Add an Exercise");
            System.out.println("3.view your exercises");
            System.out.println("4.View your athletes");
            System.out.println("5.Exit");
            option = input.nextInt();

            switch (option) {
                case 1:
                    addAthlete();
                    break;
                case 2:
                    addExercise();
                    break;
                case 3:
                    //showExerciseData();
                    System.out.println("Not quite working");
                    break;
                case 4:
                   // showAthleteData();
                    System.out.println("Not quite working");
                    break;
                case 5:
                    System.out.println("Good bye");
                    break;


            }//end of switch statement for "menu" option

        } while (option != 5);
    }//end of main method

    public static void addExercise() {

        String choice = "";

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Date Exercised: ");
            String date = input.nextLine();
            System.out.println("time exercising: ");
            String time = input.nextLine();
            System.out.println("what exercise did you do?");
            String exerciseName = input.nextLine();
            System.out.println("How many reps?");
            int reps = Integer.parseInt(input.nextLine());
            System.out.println("Enter the weight used: ");
            double pounds = Double.parseDouble(input.nextLine());

            ExerciseData data1 = new ExerciseData(exerciseName, reps, pounds, time, date);

            data1.eData.add(data1);
            System.out.println("Exercise added");

            System.out.println("Add Another Exercise?");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("y"));



    }

    public static void addAthlete() {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        float height;
        float weight;
        String sport;
        String choice = "";

        do {

            System.out.print("What is the name of your Athlete? :");
            name = input.nextLine();


            System.out.print("What is the age? ");
            age = Integer.parseInt(input.nextLine());
            System.out.print("What is the height? (in inches) ");
            height = Float.parseFloat(input.nextLine());
            System.out.print("what is the weight? ");
            weight = Float.parseFloat(input.nextLine());
            System.out.print("What is the sport of choice? ");
            sport = input.nextLine();


            Athlete athlete = new Athlete(name, age, height, weight, sport);
            //ExerciseData data = new ExerciseData();
            athlete.athleteList.add(athlete);
            System.out.println("Athlete added");

            System.out.println("current athletes:");
            for(int i = 0; i <athlete.athleteList.size(); i++){
                System.out.println(athlete.athleteList.get(i));
            }

            System.out.println();
            System.out.println("Do you want to add another Athlete?");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));
    }
/*
        public static void showExerciseData () {
            ExerciseData data = new ExerciseData();
            for (int i = 0; i < data.eData.size(); i++) {
                System.out.println(data.eData.get(i));
            }
        }
*/
       /* public static void showAthleteData () {

            for (int i = 0; i < athlete.athleteList.size(); i++) {
                System.out.println(data.athleteList.get(i));
            }


        }
*/
}


