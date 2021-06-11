package software;
/**
 * This is the main class that contian personal information that player or owner can extend from it
 *@ author Mohamed Ali , Menna Hamedy , Sara ALaa
 */
public class User {

    String name;
    static int User_ID=0;
    String UserName;
    String password;
    String phoneNumber;
    String Email;

    public User() {

    }
    /**
     *Constructor that define user information in the system
     * @param name
     * @param userName
     * @param password
     * @param phoneNumber
     * @param email
     */
    public User(String name, String userName, String password, String phoneNumber, String email) {
        this.name = name;
        UserName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        Email = email;
    }
    /**
     * getName method returns Name of user
     * @return returns Name of user
     */
    public String getName() {
        return name;
    }
    /** setName method set the Name of user
     *@params name which is the name of user.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getID method returns ID of user
     * @return returns ID of user
     */
    public static int getUser_ID() {
        return User_ID;
    }
    /** setID method set the ID of user
     *@params user_ID which is the ID of user.
     */
    public static void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }
    /**
     * getUserName method returns UserName of user
     * @return returns UserName of user
     */
    public String getUserName() {
        return UserName;
    }
    /** setUserName method set the userName of user
     *@params UserName which is the UserName of user.
     */
    public void setUserName(String userName) {
        UserName = userName;
    }
    /**
     * getPassword method returns Password of user
     * @return returns Password of user
     */
    public String getPassword() {
        return password;
    }
    /** setPassword method set the Password of user
     *@params password which is the Password of user.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * getPhoneNumber method returns PhoneNumber of user
     * @return returns PhoneNumber of user
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /** setPhoneNumber method set the PhoneNumber of user
     *@params phoneNumber which is the Phone Number of user.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * getEmail method returns Email of user
     * @return returns Email of user
     */
    public String getEmail() {
        return Email;
    }
    /** setEmail method set the Email of user
     *@params email which is the email of user.
     */
    public void setEmail(String email) {
        Email = email;
    }
    /**
     * verify the account of user
     */
    public boolean Verify_credentials (){
        return true;
    }

}
