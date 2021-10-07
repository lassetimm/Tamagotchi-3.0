public class Rooster extends Tamagotchi {
    public boolean crowing;

    public Rooster(String name, int age, String mood, int energy, boolean crowing, int money, int hunger) {
        super(name, age, mood, energy, money, hunger);
        this.crowing = crowing;
    }

    @Override
    public void printSound(){
        System.out.println("Kykkeliky!!");
    }

    public void roosterActivityFighting(){
        int roosterFightingOptions = 2;
        int randomNumber = getRandomNumber(roosterFightingOptions);
        String lineBreak = "____________________________________";
        String fightingMsgMain = "You and your rooster " + this.name + " enters the fighting house\nYou release " + this.name + " into the ring";
        String fightingMsgOne = this.name + " rushes headfirst into the opposite rooster. The enemy rooster was not ready and is knocked back\n" + this.name + " peaks the enemy in the head and the clock rings\n" + this.name + " has won the fight";
        String fightingMsgTwo = this.name + " looks around and starts searching the ground for food\n"+ this.name + " gets hit by the enemy rooster and falls to the ground\nThe clock rings, " + this.name + " lost the match";
        String moneyMsg = "You won 5 money";
        String energyMsg = this.name + "s energy decreased by 4";
        String hungerMsg = this.name + "s hunger decreased by 3";

        switch (randomNumber){
            case 1:
                System.out.println(fightingMsgMain);
                System.out.println(fightingMsgOne);
                printSound();
                System.out.println(moneyMsg);
                System.out.println(energyMsg);
                System.out.println(hungerMsg);
                hunger = hunger - 3;
                energy = energy - 4;
                money = money + 5;
                System.out.println(lineBreak);
                break;
            case 2:
                System.out.println(fightingMsgMain);
                System.out.println(fightingMsgTwo);
                System.out.println(energyMsg);
                System.out.println(hungerMsg);
                hunger = hunger - 3;
                energy = energy - 4;
                System.out.println(lineBreak);
                break;
        }

    }

    @Override
    public String toString() {
        return "Rooster{" +
                " Name = '" + name + '\'' +
                " , Age = " + age +
                " , Mood = '" + mood + '\'' +
                " , Energy = " + energy +
                " , Money = " + money +
                " , Hunger = " + hunger +
                " } ";
    }
}