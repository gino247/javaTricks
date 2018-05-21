
public final class FastSingleton {

  private static class SingletonHolder {
    static final FastSingleton INSTANCE = new FastSingleton ();
  }
  
  public static FastSingleton getInstance () {
    return SingletonHolder.INSTANCE;
  }

  // add other functions/methods here
  
}
