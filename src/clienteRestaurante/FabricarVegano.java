package clienteRestaurante;
import vegano.*;
import componentes.*;
import principal.FabricarMenus;

public class FabricarVegano implements FabricarMenus{
    
    @Override
    public Entrada crearEntrada() {
        return new EntradaVegana();
    }

    @Override
    public Principal crearPrincipal() {
        return new PrincipalVegano();
    }
    
    @Override
    public Bebida crearBebida() {
        return new BebidaVegana();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegano();
    }
}
