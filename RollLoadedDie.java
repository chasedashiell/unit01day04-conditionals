public class RollLoadedDie {

    public static void diceRoll(){
        double rand = Math.random();
        if (rand <= 0.375){
            System.out.println("You rolled a 6");
        } else if (rand <= 0.5){
            System.out.println("You rolled a 5");
        } else if (rand <= 0.625){
            System.out.println("You rolled a 4");
        } else if (rand <= 0.75){
            System.out.println("You rolled a 3");
        } else if (rand <= 0.875){
            System.out.println("You rolled a 2");
        } else {
            System.out.println("You rolled a 1");
        }
    }
    public static void main(String[] args) {
        RollLoadedDie.diceRoll();
    }
}
