import java.util.ArrayList;
import java.util.Scanner;

class Persona {
    protected String nom;
}

class Alumne extends Persona {
    Alumne(String nom, int edat) { this.nom = nom;
    }
}

class Assignatura {
    protected String nom;

    Assignatura(String nom, int credits) { this.nom = nom; }
}

class Matricula {
    protected Alumne alumne;
    protected Assignatura assignatura;

    Matricula(Alumne alumne, Assignatura assignatura) {
        this.alumne = alumne;
        this.assignatura = assignatura;
    }
}

class Academia {
    private ArrayList<Matricula> matricules;

    Academia() {
        this.matricules = new ArrayList<>();
    }

    public void matricular(Alumne alumne, Assignatura assignatura) {
        Matricula matricula = new Matricula(alumne, assignatura);
        this.matricules.add(matricula);
    }

    public void mostrarMatricules() {
        for (Matricula matricula : this.matricules) {
            System.out.println("Alumne: " + matricula.alumne.nom + " - Assignatura: " + matricula.assignatura.nom);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creem una llista per emmagatzemar les matrícules
        Academia academia = new Academia();
        // Creem un mennu per interactuar amb l'usuari
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Matricular alumne");
            System.out.println("2. Mostrar matrícules");
            System.out.println("3. Sortir");
            int opcio = scanner.nextInt();
            scanner.nextLine(); // Consumir la nova línia

            if (opcio == 1) {
                System.out.print("Nom de l'alumne: ");
                String nomAlumne = scanner.nextLine();
                System.out.print("Edat de l'alumne: ");
                int edatAlumne = scanner.nextInt();
                scanner.nextLine(); // Consumir la nova línia

                System.out.print("Nom de l'assignatura: ");
                String nomAssignatura = scanner.nextLine();
                System.out.print("Crèdits de l'assignatura: ");
                int creditsAssignatura = scanner.nextInt();
                scanner.nextLine(); // Consumir la nova línia

                Alumne alumne = new Alumne(nomAlumne, edatAlumne);
                Assignatura assignatura = new Assignatura(nomAssignatura, creditsAssignatura);
                academia.matricular(alumne, assignatura);
            } else if (opcio == 2) {
                academia.mostrarMatricules();
            } else if (opcio == 3) {
                break;
            } else {
                System.out.println("Opció no vàlida.");
            }
        }

        scanner.close();
    }

}
