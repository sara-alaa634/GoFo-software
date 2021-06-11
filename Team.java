package software;

import java.util.ArrayList;
import java.util.List;
/**
 * This class represents a small list of player that be completed team when there numer is 6
 *@ author Mohamed Ali , Menna Hamedy , Sara ALaa
 */
public class Team {


    private  String Name;
    private  List<Player> playerList=new ArrayList<Player>();
    private  int NumberOfMembers;
    /**
     * @param Name
     * dafult constructor intialize team name
     */
    public Team(String Name) {
        NumberOfMembers=0;
        this.Name=Name;
    }

    /**
     * this function delete player from team (list of 6 players)
     * @param Name
     */
    public void DeletePlayer(String Name){
        for (int i=0;i<playerList.size();i++){
            if(playerList.get(i).name.equals(Name))
                playerList.remove(i);

        }
    }

    /**
     * this function add player in the team (list of 6 players) and increse the number of members by 1.
     * @param player
     */

    public void AddPlayer(Player player){
        playerList.add(player);
        NumberOfMembers++;
    }

    /**
     * this function check if team is full of player or not
     * @return true if team members is less than 6 and false when team contain 6 players
     */
    public boolean Statues()
    {
        return NumberOfMembers != 6;
    }

    /**
     * getName method returns Name of user
     * @return returns Name of user
     */
    public String getName() {
        return Name;
    }
    /**
     * getNumberOfMembers method returns NumberOfMembers of user
     * @return returns NumberOfMembers in the team
     */
    public int getNumberOfMembers() {
        return NumberOfMembers;
    }
}
