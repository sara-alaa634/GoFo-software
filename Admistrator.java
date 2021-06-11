package software;
/**
 * This class represents one of functionality of a type of users
 * called  administrator for an application called GoFo
 *@ author Mohamed Ali , Menna Hamedy , Sara ALaa
 */
public class Admistrator {

    /**
     *this function to check playground information if it in the limit that decided by the system or not
     *
     *@return return true if the playground exist in limits or false if playground less than limits
     */

    public boolean cheackPlayground(PlayGround PG){
        return PG.getSize() >= 800 && !PG.getName().contentEquals("") && PG.getPrice() > 0 && !PG.getLocation().contentEquals("");
    }
}
