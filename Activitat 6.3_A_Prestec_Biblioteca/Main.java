class Llibre {
    private String titol;
    private boolean disponible = true;

    public void prestar() { disponible = false; }
}

class Usuari {
    private String nom;
    public void demanarPrestec(Llibre llibre) {
        llibre.prestar();
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
        sb.gestionarPrestec(u, l);
    }
}
