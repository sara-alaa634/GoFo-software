package software;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents type of users that can reserve playground from the system
 *@ author Mohamed Ali , Menna Hamedy , Sara ALaa
 */
public class Player extends User {

    private List<Team> teams=new ArrayList<Team>();

    /**
     * Default constructor
     */
    public Player() {

    }

    /**
     * Constructor that send the parameters he took to the extended class User
     */
    public Player(String name, String userName, String password, String phoneNumber, String email) {
        super(name, userName, password, phoneNumber, email);
    }

    /**
     * this function add team to a list of teams
     */

    public void AddTeam(Team team){
        teams.add(team);
    }

    /**
     * GetTeam this function search for a given team in the team list
     *@param Name this parameter to search for the team by hid name
     *@return return team if it found or return null if team not found in the list
     */
    public Team GetTeam(String Name){
        for (int i=0;i<teams.size();i++){
            if(teams.get(i).getName().equals(Name))
                return teams.get(i);
        }
        return null;
    }


}
