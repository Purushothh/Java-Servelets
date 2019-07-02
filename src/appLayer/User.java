package appLayer;

/**
 * Created by PurushothA on 7/2/2019.
 */
public class User {
    public boolean isValidateUser(String name,String pWord){
        if(name.equals("admin")&& pWord.equals("admin")){

           return true;
        }
        return false;
    }

}
