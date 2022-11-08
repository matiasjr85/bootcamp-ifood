package one.digitalInovation.gof.Singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author edmilson
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {

        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
