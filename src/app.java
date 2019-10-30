import java.util.Scanner;

public class app {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String choice = "";
        String name = "";
        int age = 0;
        float height = 0;
        float weight = 0;

        ExerciseData data = new ExerciseData();

        System.out.println("Welcome to logging your fitness");
        try {
            do {
                //Begin adding Athlete data
                System.out.print("What is the name of your first Athlete? :");
                name = input.nextLine();
                System.out.print("What is their age? :");
                age = Integer.parseInt(input.nextLine());
                System.out.print("What is their height? (in inches) :");
                height = Float.parseFloat(input.nextLine());
                System.out.print("what is their weight? :");
                weight = Float.parseFloat(input.nextLine());

                Athlete athlete = new Athlete(name, age, height, weight);

                System.out.println("would you like to add another Athlete?");
                choice = input.nextLine();

                if(choice.equalsIgnoreCase("no"))
                {
                    System.out.println("goodbye");
                    break;
                }

            }while(choice.equalsIgnoreCase("yes"));
            Athlete athlete = new Athlete(name, age, height, weight);
            data.athleteList.add(athlete);

            for (int i = 0; i < data.athleteList.size(); i++) {
                System.out.println(athlete.toString());
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getClass().getSimpleName());
            System.out.println("please enter in letters for name and numbers for age, height, weight");
        }
    }

}
