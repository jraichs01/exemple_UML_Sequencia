// Classe base
abstract class Dispositiu {
    protected String nom;
    protected boolean encès = false;

    public Dispositiu(String nom) { this.nom = nom; }
    public abstract void executarAccio(); // Mètode abstracte
}

// Subclasse específica
class Llum extends Dispositiu {
    public Llum(String nom) { super(nom); }
    
    @Override
    public void executarAccio() {
        this.encès = !this.encès;
        System.out.println(nom + " està ara " + (encès ? "ENCÈS" : "APAGAT"));
    }
}

// El controlador
class HubDomotic {
    public void activarDispositiu(Dispositiu d) {
        System.out.println("Enviant senyal a: " + d.nom);
        d.executarAccio();
    }
}

// Classe Main
public class MainDomotica {
    public static void main(String[] args) {
        HubDomotic elMeuHub = new HubDomotic();
        Dispositiu llumSaló = new Llum("Llum del Saló");

        elMeuHub.activarDispositiu(llumSaló);
    }
}