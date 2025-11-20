import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> userList = new ArrayList<>();

    public void add(User user)
    {
        if(user == null)
        {
            return;
        }
        this.userList.add(user);
    }

    public ArrayList<User> getu()
    {
        return userList;
    }
}
