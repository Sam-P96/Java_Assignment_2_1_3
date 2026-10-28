public class CoffeeMaker {
//    private String cmName;
    private boolean power = false;
    private String coffeeMode = "Normal";

//    public CoffeeMaker(String name) {
//        this.cmName = name;
//    }
    public void powerButton() {
        if (power) {
            this.power = false;
            System.out.println("Coffee maker is off");
        } else {
            this.power = true;
            System.out.println("Coffee maker is on");
        }
    }

    public void switchMode() {
        if (power) {
            if (coffeeMode == "Normal") {
                coffeeMode = "Espresso";
                System.out.println("Coffee type is expresso");
            } else {
                coffeeMode = "Normal";
                System.out.println("Coffee type is normal");
            }
        } else {
            System.out.println("Power is off, please turn it on to switch modes.");
        }

    }

    public void coffeeAmount(int amount) {
        if (power) {
            System.out.println("Coffee amount is " + amount + " ml");
        } else {
            System.out.println("Power is off, please turn it on to enter amount.");
        }

    }

}
