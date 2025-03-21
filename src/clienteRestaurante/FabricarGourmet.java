package clienteRestaurante;
import gourmet.*;
import componentes.*;
import principal.FabricarMenus;

public class FabricarGourmet implements FabricarMenus {
    
    @Override
    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public Principal crearPrincipal() {
        return new PrincipalGourmet();
    }
    
    @Override
    public Bebida crearBebida() {
        return new BebidaGourmet();
    }

    @Override
    public Postre crearPostre() {
        return new PostreGourmet();
    }

}
