public class CoffeeMakerDriver {

    public static void main(String[] args) {
        CoffeeMaker coffeeMachine = new CoffeeMaker();

        coffeeMachine.switchMode();
        coffeeMachine.coffeeAmount(50);
        System.out.println("");

        coffeeMachine.powerButton();
        coffeeMachine.switchMode();
        coffeeMachine.coffeeAmount(50);
        coffeeMachine.powerButton();

        System.out.println("");
        coffeeMachine.switchMode();
        coffeeMachine.coffeeAmount(50);
    }
}
