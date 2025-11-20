public class User
{
  public int user_id;
  public String user_name;

  public User(int i, String n)
  {
    user_id = i;
    if (n == null || n.isEmpty() || n.length() > 100) // Testing length
    {
      return; //If string is invalid, we don't try to store it
    }
    user_name = n;
  }

  public int getUserID()
  {
    return user_id;
  }

  public String getUserName()
  {
    return user_name;
  }

  @Override public boolean equals(Object o)
  {
    if (o instanceof User u)
    {
      return u.user_name.equals(user_name);
    }
    return false;
  }
}
