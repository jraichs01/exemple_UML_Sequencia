// 1. L'objecte que rep l'acció final
class CoffeeMachine {
    public void brew() {
        System.out.println("La màquina està preparant el cafè...");
    }
}

// 2. L'intermediari (Cambrer)
class Waiter {
    private CoffeeMachine machine = new CoffeeMachine();

    public void takeOrder(String coffeeType) {
        System.out.println("Cambrer: He rebut la comanda de " + coffeeType);
        machine.brew(); // Enviament del missatge a la màquina
        System.out.println("Cambrer: Aquí té el seu cafè.");
    }
}

// 3. L'iniciador (Client/Main)
public class Cafe {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.takeOrder("Espresso"); // Inici de la interacció
    }
}