//A program for footbball management
// 19th september, 2025
// A lab session in Ashesi University


//Task one(Taking inputs, declaring and using variables)
import java.util.Scanner;
public class playerSelection {
    public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name= x.nextLine().trim();
            System.out.print("Enter your age: ");
            int age =x.nextInt();
            System.out.print("Enter your height in meters: ");
            float height=x.nextFloat();
            System.out.print("Enter your weight in pounds: ");
            float weight=x.nextFloat();


            System.out.println("Player Name -  "+name);
            System.out.println("Age - "+age);
            System.out.println("Height "+height +"m");
            System.out.println("Weight - "+weight +"lbs");
            System.out.println("JerseyNumber - ");
            int jerseyNumber= x.nextInt();

//         Task Two;
            final  int  METERS_TO_CM = 100;
            final double  POUND_TO_KG = 0.45359237;
            double heightCM= (int)(METERS_TO_CM*height);
            double  weightKG= (int)(POUND_TO_KG*weight);
            System.out.println("Height - "+heightCM+"cm");
            System.out.println("Weight - "+ weightKG+"kg");
//         Task 3: Increment and decrement
            age++;
            System.out.println("Age"+age);
            jerseyNumber--;
            System.out.println("JerseyNumber - "+jerseyNumber);
            System.out.println("JerseyNumber - "+jerseyNumber);
            System.out.println("New age-"+age);
//        task four : ELIGIBILITY
            boolean isEligible= age>=18&&age<=35&&weightKG<90;
            boolean hasProblem=age<18||weightKG>90;
            boolean notEligible=!isEligible;

//        Task five
            String category;
            if (age<20){
                category = "Rising Star";
            }
            else if (age<=30){
                category = "Prime Player";
            }
            else{
                category = "Veteran";
            }

//   Task 6(switch case)
            String position;
            switch(jerseyNumber){
                case 1:position="Goalkeeper";break;
                case 2: case 5: position= "Defender";
                    break;
                case 6: case 8: position ="Midfielder";
                    break;
                case 7: case 11: position ="Winger";
                    break;
                case 9: position= "Striker"; break;
                case 10: position ="Playmaker"; break;
                default: position = " Player position not known";

            }
//        task seven (Unwanted and Useful fall-through)


//part b
            switch(jerseyNumber){
                case 2: case 5:
                    System.out.println("Defender");break;
                case 6: case 8:
                    System.out.println("Midfielder");break;
                case 7: case 11:
                    System.out.println("Winger");break;
                case 1:
                    System.out.println("Goalkeeper"); break;
                case 9:
                    System.out.println("Striker");break;
                case 10:
                    System.out.println("Playmaker"); break;
                default:
                    System.out.println("Player position not known");

            }
//        Task 8
            String lineupDecision;
            if (category.equals("Prime Player")){
                if(weightKG<80)lineupDecision="Starting Lineup";
                else lineupDecision="Bench";
            }else{
                lineupDecision="Bench";
            }
//        Task 9
            String FinaLDecision=isEligible ? "Play":"Rest";

//        Task 10
            boolean isAttacker = jerseyNumber==7|| jerseyNumber==9||jerseyNumber==10||jerseyNumber==11;
            System.out.println("----The player's Report-----");
            System.out.println("Player: "+name );
            System.out.println("Age: "+age + ","+"["+category+"]");
            System.out.println("Height: "+heightCM+"cm");
            System.out.println("Weight: "+weightKG+"kg");
            System.out.println("JerseyNumber: "+jerseyNumber);
            System.out.println("Position: "+position);
            System.out.println("Attacker Jersey:"+(isAttacker?"Yes":"No"));
            System.out.println("Eligibility:"+(isEligible?"Eligible":"Not Eligible"));
            System.out.println("lineupDecision:"+lineupDecision);
            System.out.println("Final Decision: "+FinaLDecision);

//            task 7
            System.out.println("Fall-through demo");
            switch(jerseyNumber) {
                case 2:
                    System.out.println("Defender");

                case 6:
                    System.out.println("Midfielder");

                case 7:
                    System.out.println("Winger");

                default:
                    System.out.println("Default value");
        }

                x.close();
//The part A of problem seven was put at the end because it is just a demo and does not affect the overall report  of the player.
// This was to keep the report clean and still touch on all categories of the problem.



        }
    }


