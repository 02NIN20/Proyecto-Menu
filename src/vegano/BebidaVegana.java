package vegano;
import componentes.Bebida;

public class BebidaVegana implements Bebida {
    @Override
    public void servirBebida() {
        System.out.println("\n// El mesero sirve un refrescante mocktail de hibisco y jengibre en un vaso alto con hielo, decorado con rodajas de naranja deshidratada y hojas de menta fresca.");
    }
}
