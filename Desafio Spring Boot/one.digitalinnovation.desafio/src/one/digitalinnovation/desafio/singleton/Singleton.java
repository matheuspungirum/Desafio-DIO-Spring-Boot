/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalinnovation.desafio.singleton;

/**
 * Singleton - A priore não será disponibilizado a instância para o Usuário
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author Matheus Pungirum
 */
public class Singleton {
    private static Singleton instancia;

    private Singleton() {
        super();
    }
    public static Singleton getInstancia(){
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
/** Outra forma de implementar o singleton, dessa forma não haverá a verificação
 * ele já atribuirá a instância.
 */
/** public class Singleton {
 *     private static Singleton instancia = new Singleton();
 *
 *     private Singleton() {
 *         super();
 *   }
 *  public static Singleton getInstancia() {
 *      return instancia;
 *   }
 * }
 */

/** Mais uma forma de implementar o singleton, apesar de similar as outras duas anteriores
 * *dessa forma o consumo de memória é menor otimizado e recomendado devido a isso,
 * *essa instância é encapsulada em uma classe estática interna(iremos chama-la de holder)
 */
/** public class SingletonHolder {
 *
 *   private static class Holder{
 *
 *    public static SingletonHolder instancia = new SingletonHolder();
 * }
 *     private SingletonHolder() {
 *         super();
 *   }
 *  public static SingletonHolder getInstancia() {
 *      return Holder.instancia;
 *   }
 *  }
 */ 