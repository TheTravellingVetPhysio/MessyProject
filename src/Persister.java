import java.io.*;
import java.util.*;

public class Persister
{
  public static void s(ArrayList<User> u) throws IOException
  {
    File file = new File("users.txt"); // Creates file
    FileWriter fw = new FileWriter(file); // Create filewriter
    BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
    // Create a loop
    for (User user : u)
    { // Nicely formatted block
      bw.write(user.user_name); // Write first thing
      bw.write(user.get()); // Write second thing
    } // Ending parenthesis
  }
}
