import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> userList = new ArrayList<User>();

    public void add(User u)
    {
        this.userList.add(u);
        if(u == null)
        {
            return;
        }
    }

    public ArrayList<User> getu()
    {
        return userList;
    }
}
