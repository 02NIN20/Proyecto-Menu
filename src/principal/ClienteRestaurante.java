package principal;
import componentes.*;

public class ClienteRestaurante {
    private FabricarMenus fabricar;

    //public List<FabricarMenus>  = new ArrayList<FabricarMenus> ();

    public void pedirMenu(FabricarMenus fabricar) {
        this.fabricar = fabricar;
    }

    public void pedir() {
        Entrada entrada = fabricar.crearEntrada();
        Principal principal = fabricar.crearPrincipal();
        Bebida bebida = fabricar.crearBebida();
        Postre postre = fabricar.crearPostre();

        entrada.servirEntrada();
        principal.servirPrincipal();
        bebida.servirBebida();
        postre.servirPostre();
    }

}
