import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String welcomeMSG = "Welcome player, please choose \"1\" for a Rooster as pet or choose \"2\" for a Monkey as pet.";
        System.out.println(welcomeMSG);
        boolean whileChecker = true;

        while(whileChecker) {
            int petChoosingInput;
            try {
                petChoosingInput = scanner.nextInt();
                if (petChoosingInput == 1) {
                    String roosterName = giveRoosterName();
                    Rooster rooster = new Rooster(roosterName,2,"Happy",10,false, 0, 10);
                    chooseActivityForRooster(rooster);
                    whileChecker = false;

                } else if (petChoosingInput == 2) {
                    String monkeyName = giveMonkeyName();
                    Monkey monkey = new Monkey(monkeyName,2,"Happy",10,false, 0, 10);
                    chooseActivityForMonkey(monkey);
                    whileChecker = false;

                } else {
                    System.out.println("You didnt take either \"1\" or \"2\" please try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("You didnt type a number");
                scanner.next();
            }
        }
    }

    //Af en eller anden grund så sender den switchcase 6, 2 gange og jeg ved ikke helt hvorfor :/
    public static void chooseActivityForMonkey(Monkey monkey){
        String lineBreaker = "_________________________________________________\n";
        System.out.println("What activity do you want " + monkey.name + " to do?");
        monkey.soutAnimalActivityScreen();
        int activityNumberForAnimal = 1;

        //Denne del holder øje med at ens pet altid har nok energy og hunger ellers så falder den automatisk i søvn eller dør.
        if (monkey.hunger > 1 && monkey.energy >= 3) {
            activityNumberForAnimal = scanner.nextInt();
        } else if (monkey.hunger > 1) {
            System.out.println("______________________________________");
            System.out.println(monkey.name + " is very tied and has fallen asleep");
            monkey.animalActivitySleep();

            chooseActivityForMonkey(monkey);
        } else {
            System.out.println("______________________________________");
            activityNumberForAnimal = 7;
        }

        switch (activityNumberForAnimal){
            case 1:
                System.out.println("You choose to play with " + monkey.name);
                monkey.monkeyActivityPlay();
                System.out.println(lineBreaker);

                chooseActivityForMonkey(monkey);
                break;
            case 2:
                System.out.println("You choose to feed " + monkey.name);
                monkey.animalActivityFeeding();
                System.out.println(lineBreaker);

                chooseActivityForMonkey(monkey);
                break;
            case 3:
                System.out.println("You choose special");
                monkey.monkeyActivityStealing();
                System.out.println(lineBreaker);

                chooseActivityForMonkey(monkey);
                break;
            case 4:
                System.out.println(monkey.toString());
                System.out.println(lineBreaker);

                chooseActivityForMonkey(monkey);
                break;
            case 5:
                System.out.println("You choose sleep");
                monkey.animalActivitySleep();
                System.out.println(lineBreaker);

                chooseActivityForMonkey(monkey);
                break;
            case 6:
                System.out.println("Thanks for playing :)");
                break;
            case 7:
                System.out.println("\n\n\n\n\n");
                System.out.println("You neglected your pet and it died\nWhat an awful way to die :(\nNext time remember to feed your pet");
                break;
        }
    }

    //Af en eller anden grund så sender den switchcase 6, 2gange og jeg ved ikke helt hvorfor :/
    public static void chooseActivityForRooster(Rooster rooster){
        String lineBreaker = "_________________________________________________\n";
        System.out.println("What activity do you want " + rooster.name + " to do?");
        rooster.soutAnimalActivityScreen();
        int activityNumberForAnimal = 1;

        //Denne del holder øje med at ens pet altid har nok energy og hunger ellers så falder den automatisk i søvn eller dør.
        if (rooster.hunger > 1 && rooster.energy >= 3) {
            activityNumberForAnimal = scanner.nextInt();
        } else if (rooster.hunger > 1 && rooster.energy <= 2) {
            System.out.println("______________________________________");
            System.out.println(rooster.name + " is very tied and has fallen asleep");
            rooster.animalActivitySleep();

            chooseActivityForRooster(rooster);
        } else {
            System.out.println("______________________________________");
            activityNumberForAnimal = 7;
        }
                switch (activityNumberForAnimal) {
                    case 1:
                        System.out.println("You choose to play with " + rooster.name);
                        rooster.roosterActivityPlay();
                        System.out.println(lineBreaker);

                        chooseActivityForRooster(rooster);
                        break;
                    case 2:
                        System.out.println("You choose to feed " + rooster.name);
                        rooster.animalActivityFeeding();
                        System.out.println(lineBreaker);

                        chooseActivityForRooster(rooster);
                        break;
                    case 3:
                        System.out.println("You choose special");
                        rooster.roosterActivityFighting();
                        System.out.println(lineBreaker);

                        chooseActivityForRooster(rooster);
                        break;
                    case 4:
                        System.out.println(rooster.toString());
                        System.out.println(lineBreaker);

                        chooseActivityForRooster(rooster);
                        break;
                    case 5:
                        System.out.println("You choose sleep");
                        rooster.animalActivitySleep();
                        System.out.println(lineBreaker);

                        chooseActivityForRooster(rooster);
                        break;
                    case 6:
                        System.out.println("Thanks for playing :)");
                        break;
                    case 7:
                        System.out.println("\n\n\n\n\n");
                        System.out.println("You neglected your pet and it died\nWhat an awful way to die :(\nNext time remember to feed your pet");
                        break;
                }
        }

    public static String giveRoosterName() {
        System.out.println("You choose Rooster\nWhat would you like to call it?");
        String roosterName = scanner.next() + scanner.nextLine();
        System.out.println("What a lovely name");
        return roosterName;
    }

    public static String giveMonkeyName() {
        System.out.println("You choose Monkey\nWhat would you like to call it?");
        String monkeyName = scanner.next() + scanner.nextLine();
        System.out.println("What a lovely name");
        return monkeyName;
    }

}