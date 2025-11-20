import java.io.IOException;
import java.util.logging.Logger;

public class Main
{
  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args)
  {
    User u1 = new User(10, "Bob");
    User u2 = new User(20, "Alice");
    User u3 = new User(30, "Carl");
    User u4 = new User(11, "Bob");

    UserList list = new UserList();
    list.add(u1);
    list.add(u2);
    list.add(u3);
    list.add(u4);

    System.out.println(list.getu());

    try
    {
      Persister.s(list.getu());
    }
    catch (IOException e)
    {
      logger.severe("Failed to persist user list: " + e.getMessage());
    }
  }
}
