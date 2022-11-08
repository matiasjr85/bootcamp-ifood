package one.digitalInovation.gof;

import one.digitalInovation.gof.Facade.Facade;
import one.digitalInovation.gof.Singleton.SingletonEager;
import one.digitalInovation.gof.Singleton.SingletonLazy;
import one.digitalInovation.gof.Singleton.SingletonLazyHolder;
import one.digitalInovation.gof.Strategy.*;

public class Test {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facede

        Facade facade = new Facade();
        facade.migrarCliente("Edmilson", "12456789");

    }
}
