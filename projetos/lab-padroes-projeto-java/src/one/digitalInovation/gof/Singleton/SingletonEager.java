package one.digitalInovation.gof.Singleton;

/**
 * Singleton "apressado"
 *
 * @author edmilson
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {

        return instancia;
    }
}