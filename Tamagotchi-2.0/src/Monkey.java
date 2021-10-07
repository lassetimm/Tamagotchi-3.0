public class Monkey extends Tamagotchi {
    public boolean scream;

    public Monkey(String name, int age, String mood, int energy, boolean scream, int money, int hunger) {
        super(name, age, mood, energy, money, hunger);
        this.scream = scream;
    }

    @Override
    public void printSound(){
        System.out.println("UUUUU AAAAA (Monkey Sound)");
    }

    public void monkeyActivityStealing(){
        int monkeyStealingOptions = 3;
        int randomNumber = getRandomNumber(monkeyStealingOptions);
        String lineBreak = "____________________________________";
        String stealingMsgMain = "You and your monkey " + this.name + " goes out to the nearest tourist attraction.\nYou tell " + this.name + " to do what he does best";
        String stealingMsgOne = this.name + " steals a handbag from an old lady\nThe old lady is to confused to pursue.\nYou gain 5 money";
        String stealingMsgTwo = this.name + " fails to steal anything and comes back emptyhanded";
        String stealingMsgThree = this.name + " gets distracted and comes back with nothing but some cool new sunglasses which " + this.name + " refuses to give you";
        String energyMsg = this.name + "s energy decreased by 4";
        String hungerMsg = this.name + "s hunger decreased by 3";

        switch (randomNumber) {
            case 1:
                System.out.println(stealingMsgMain);
                System.out.println(stealingMsgOne);
                System.out.println(energyMsg);
                System.out.println(hungerMsg);
                printSound();
                energy = energy - 4;
                hunger = hunger - 3;
                money = money + 5;
                System.out.println(lineBreak);
                break;
            case 2:
                System.out.println(stealingMsgMain);
                System.out.println(stealingMsgTwo);
                System.out.println(energyMsg);
                System.out.println(hungerMsg);
                energy = energy - 4;
                hunger = hunger - 3;
                System.out.println(lineBreak);
                break;
            case 3:
                System.out.println(stealingMsgMain);
                System.out.println(stealingMsgThree);
                System.out.println(energyMsg);
                System.out.println(hungerMsg);
                energy = energy - 4;
                hunger = hunger - 3;
                System.out.println(lineBreak);
                break;
        }
    }

    @Override
    public String toString() {
        return "Monkey{" +
                " Name = '" + name + '\'' +
                " , Age = " + age +
                " , Mood = '" + mood + '\'' +
                " , Energy = " + energy +
                " , Money = " + money +
                " , Hunger = " + hunger +
                " } ";
    }
}