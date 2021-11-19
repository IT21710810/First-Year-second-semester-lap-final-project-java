package Controllers;

import Models.User;
import java.util.ArrayList;
public class LoginController {
    
    ArrayList<User>userDB;
    private Object userText;
    public LoginController()
    {
        userDB=new ArrayList<>();
        loadLoginInfo();
    }
    
    void loadLoginInfo()
   {
       userDB.add(new User("lux","123","rider"));
       userDB.add(new User("dasun","456","banker"));
       userDB.add(new User("joy","789","bikerider"));
       
   }
    public User checkUser(String user)
    {
        boolean isfound = false;
        User foundUser = null;
        for(User u:userDB)
        {
           if(u.getUserName().equals(user))
           {
              foundUser= u;
              isfound=true;
              break;
           }
        }  
        if (isfound == false) {
            return null;
        } else {
            return foundUser;
        }
            
    }   
}
