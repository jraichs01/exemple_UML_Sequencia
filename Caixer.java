// El component físic que mou els bitllets
class Dispensador {
    public void lliurarEfectiu(int quantitat) {
        System.out.println("DISPENSADOR: Entregant " + quantitat + "€...");
    }
}

// El cervell que connecta amb la base de dades
class SistemaBancari {
    public boolean validarPIN(int pin) {
        return pin == 1234; // Simplificació per l'exemple
    }
    
    public boolean verificarSaldo(int quantitat) {
        return true; // Suposem que sempre hi ha diners
    }
}

// ******* Continua a la pàgina següent amb la classe principal *******

// ******* ve de la pagina anterior *******
// La classe principal que gestiona la interacció
class CaixerAutomatic {
    private SistemaBancari banc = new SistemaBancari();
    private Dispensador dispensador = new Dispensador();

    public void operar(int pin, int quantitat) {
        if (banc.validarPIN(pin)) {
            System.out.println("CAIXER: PIN correcte.");
            if (banc.verificarSaldo(quantitat)) {
                dispensador.lliurarEfectiu(quantitat);
                System.out.println("CAIXER: Reculli els seus diners.");
            }
        } else {
            System.out.println("CAIXER: PIN incorrecte.");
        }
    }
}

public class Caixer {
    public static void main(String[] args) {
        CaixerAutomatic atm = new CaixerAutomatic();
        atm.operar(1234, 50); // Simulem l'usuari posant el PIN i demanant 50€
    }
}
