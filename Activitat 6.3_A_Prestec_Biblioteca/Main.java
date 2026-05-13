class Llibre {
    private String titol;
    private boolean disponible = true;

    public void prestar() { 
        disponible = false; 
        System.out.println("El llibre en prestec.");
    }
    
}

class Usuari {
    private String nom;
    public void demanarPrestec(Llibre llibre) {
        llibre.prestar();
        System.out.println("llibre ha estat prestat a l'usuari.");
    }
}

class SistemaBiblioteca {
    public void gestionarPrestec(Usuari u, Llibre l) {
        u.demanarPrestec(l);
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca sb = new SistemaBiblioteca();
        Usuari u = new Usuari();
        Llibre l = new Llibre();
        
        // El sistema de biblioteca gestiona el préstec del llibre a l'usuari
        // Usuari demana llibre a la biblioteca
        // El bibliotecari (o sistema de gestió) presta el llibre a l'usuari

        System.out.println("Començant operació de préstec...");
        sb.gestionarPrestec(u, l);
        System.out.println("Operació finalitzada");
    }
}
