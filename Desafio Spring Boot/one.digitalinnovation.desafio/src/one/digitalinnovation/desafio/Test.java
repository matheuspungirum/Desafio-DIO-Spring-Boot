package one.digitalinnovation.desafio;

import one.digitalinnovation.desafio.facade.Facade;
import one.digitalinnovation.desafio.singleton.Singleton;
import one.digitalinnovation.desafio.singleton.SingletonHolder;
import one.digitalinnovation.desafio.singleton.SingletonRapido;
import one.digitalinnovation.desafio.strategy.*;

/**
 *
 * @author Matheus Pungirum
 */
public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao Design Pattern Singleton:
        Singleton lazy = Singleton.getInstancia();
        System.out.println(lazy);
        lazy = Singleton.getInstancia();
        System.out.println(lazy);

        SingletonRapido rapido = SingletonRapido.getInstancia();
        System.out.println(rapido);
        rapido = SingletonRapido.getInstancia();
        System.out.println(rapido);

        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);


        // Testes utilizando Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
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

        // Teste Facade
        Facade facade = new Facade();
        facade.migrarCliente("Matheus","30880040");
    }
}