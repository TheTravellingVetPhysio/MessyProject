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
    list.addUser(u1);
    list.addUser(u2);
    list.addUser(u3);
    list.addUser(u4);

    System.out.println(list.getUserList());

    try
    {
      Persister.s(list.getUserList());
    }
    catch (IOException e)
    {
      logger.severe("Failed to persist user list: " + e.getMessage());
    }
  }
}
