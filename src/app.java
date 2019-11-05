import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class app {
        Scanner input = new Scanner(System.in);
        ExerciseData data = new ExerciseData();

        public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            String choice = "";
            int option = 0;


            System.out.println("Welcome to logging your fitness");
           // do {

                System.out.println("What would you like to do?");
                System.out.println("1.Add an Athlete");
                System.out.println("2.Add an Exercise");
                System.out.println("3.view your exercises");
                System.out.println("4.View your athletes");
                System.out.print("5.Exit");
                option = input.nextInt();
            /*switch (option) {
                case 1:
                    addAthlete();
                    break;
                case 2:
                    addExercise();
                    break;
                case 3:
                    showExerciseData();
                    break;
                case 4:
                    showAthleteData();
                    break;
                case 5:
                    System.out.print("goodbye");

                    break;


            }

            System.out.println("Do you need to repeat?");
            choice = input.nextLine();

        }while(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));
            */
                //System.out.println("Would you like to add an athlete?");
                //choice = input.nextLine();
           do {
               switch (option) {
                   case 1:
                       addAthlete();
                       break;
                   case 2:
                       addExercise();
                       break;
                   case 3:
                       showAthleteData();
                       break;
                   case 4:
                       showExerciseData();
                       break;
                   case 5:
                       System.out.println("goodbye");
                       System.exit(1);
               }
           }while(true);
                  /*  try {
                        do {
                            //Begin adding Athlete data
                            addAthlete();

                        System.out.println("would you like to add another Athlete?");
                        choice = input.nextLine();

                        if (choice.equalsIgnoreCase("no")) {
                            System.out.println("Would you like to add an exercise?");
                            choice = input.nextLine();

                            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
                                addExercise();
                            }
                        }

                    } while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) ;


                    for (int i = 0; i < data.athleteList.size(); i++) {
                        System.out.println(data.athleteList.get(i));
                    }

                } catch(NumberFormatException e){
                    e.printStackTrace();
                    System.out.println(e.getClass().getSimpleName());
                    System.out.println("please enter in letters for name and numbers for age, height, weight");
                }
            }*/
                }




    public static void addExercise() {
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

        ExerciseData data1 = new ExerciseData(exerciseName, reps,pounds, time, date);

        data1.eData.add(data1);
    }

    public static void addAthlete() {
        Scanner input = new Scanner(System.in);
        ExerciseData data = new ExerciseData();
        String name;
        int age;
        float height;
        float weight;
        String sport;
        String choice = "";

do {
    if (data.athleteList.size() > 1) {
        System.out.println("what is the name of the Athlete?");
        name = input.nextLine();
    } else {
        System.out.print("What is the name of your first Athlete? :");
        name = input.nextLine();
    }

    System.out.print("What is the age? ");
    age = Integer.parseInt(input.nextLine());
    System.out.print("What is the height? (in inches) ");
    height = Float.parseFloat(input.nextLine());
    System.out.print("what is the weight? ");
    weight = Float.parseFloat(input.nextLine());
    System.out.print("What is the sport of choice? ");
    sport = input.nextLine();

    Athlete athlete = new Athlete(name, age, height, weight, sport);
    data.athleteList.add(athlete);

}while(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));
    }

    public static void showExerciseData(){
            ExerciseData data = new ExerciseData();
            for(int i = 0; i<data.eData.size();i++)
            {
                System.out.println(data.eData.get(i));
            }
    }

    public static void showAthleteData() {
            ExerciseData data = new ExerciseData();
            for(int i = 0; i<data.athleteList.size(); i++){
                System.out.println(data.athleteList.get(i));
            }


        }

}
