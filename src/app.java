import java.util.Scanner;

public class app {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String choice = "";
        String name = "";
        int age = 0;
        float height = 0;
        float weight = 0;
        String sport = "";

        ExerciseData data = new ExerciseData();

        System.out.println("Welcome to logging your fitness");
        try {
            do {
                //Begin adding Athlete data
                if(data.athleteList.size() >=1){
                    System.out.println("what is the name of the Athlete?");
                    name =input.nextLine();
                }
                else{
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

                System.out.println("would you like to add another Athlete?");
                choice = input.nextLine();

                if(choice.equalsIgnoreCase("no"))
                {
                    break;
                }

            }while(choice.equalsIgnoreCase("yes"));


            for (int i = 0; i < data.athleteList.size(); i++) {
                System.out.println(data.athleteList.get(i));
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getClass().getSimpleName());
            System.out.println("please enter in letters for name and numbers for age, height, weight");
        }
    }

}
