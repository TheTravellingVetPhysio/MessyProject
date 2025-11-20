import java.io.*;
import java.util.*;

public class Persister
{
  public static void s(ArrayList<User> u) throws IOException
  {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt")))
    {
      for (User user : u)
      { // Nicely formatted block
        bw.write(user.getUserID() + " " + user.getUserName());
        bw.newLine();
      } // Ending parenthesis
    }
  }
}
