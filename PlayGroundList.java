package software;



import java.util.ArrayList;
import java.util.List;
/**
 * This class represents all playgrounds in our system
 *@ author Mohamed Ali , Menna Hamedy , Sara ALaa
 */
public class PlayGroundList {


    private List<PlayGround> playGroundLis;

    /**
     * Default Constructor intialize list of playrounds in the system
     */
    public PlayGroundList() {
        this.playGroundLis = new ArrayList<PlayGround>();
    }

    /**
     * this function to add any new playground in the plyaground list of the system.
     */
    public void AddPlayGround(PlayGround PG) {
        playGroundLis.add(PG);
    }

    /**
     * this function used to filter playgrounds in system by slot,location,price
     *@param loc
     *@param price
     *@param slot
     */
    public void Filter(String loc, int price, int slot) {
        for (int i = 0; i < playGroundLis.size(); i++) {
            if (playGroundLis.get(i).getLocation().equals(loc) && playGroundLis.get(i).getPrice() == price && playGroundLis.get(i).IsFree(slot)) {
                playGroundLis.get(i).toString();
                System.out.println();
            }

        }


    }
    /**
     *this function to display all playground in the system
     */
    public void DisplayAllPlayGrounds() {
        for (int i = 0; i < playGroundLis.size(); i++) {
            playGroundLis.get(i).toString();
            System.out.println();
        }
    }

    /**
     * @return return size of playground
     */
    public int size(){
        return playGroundLis.size();
    }



}
