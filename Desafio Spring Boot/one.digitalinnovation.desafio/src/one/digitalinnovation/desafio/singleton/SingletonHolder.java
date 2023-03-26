package one.digitalinnovation.desafio.singleton;

public class SingletonHolder {
    private static class Holder{
         public static SingletonHolder instancia = new SingletonHolder();
    }
         private SingletonHolder () {
        super();
    }
   public static SingletonHolder getInstancia() {
      return Holder.instancia;
    }
   }

