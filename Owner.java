package software;

/**
 * This class represents type of users in our system that can offer his playground to rent
 *@ author Mohamed Ali , Menna Hamedy , Sara ALaa
 */

public class Owner extends User {
    private PlayGroundList playGroundList;

    /**
     * Default constructor that intalize new list of playgrounds.
     */

    public Owner() {
        playGroundList=new PlayGroundList();

    }
    /**
     * Constructor that intalize new list of playgrounds and send the prameters that he took to the class User
     * that he extend from it.
     */
    public Owner(String name, String userName, String password, String phoneNumber, String email) {
        super(name, userName, password, phoneNumber, email);
        playGroundList=new PlayGroundList();
    }

    /**
     * this function to add payground which is accepted by administrator in the new plyaground list
     * but only his playground that will add in this list not all playgrounds in the system.
     */
    public void AddPlayGround(PlayGround PG)
    {
        playGroundList.AddPlayGround(PG);
    }

    public void EditSpecifcPlayground(String name){}

    /**
     * display all playground of owner in his list
     */

    public void GetAllPlaygrounds(){playGroundList.DisplayAllPlayGrounds();}


    /**
     * this function to display owner information
     */
    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
