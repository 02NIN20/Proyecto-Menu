package clienteRestaurante;
import vegetariano.*;
import componentes.*;
import principal.FabricarMenus;

public class FabricarVegetariano implements FabricarMenus {

    @Override
    public Entrada crearEntrada() {
        return new EntradaVegetariana();
    }

    @Override
    public Principal crearPrincipal() {
        return new PrincipalVegetariano();
    }
    
    @Override
    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegetariano();
    }

}
