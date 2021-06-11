package software;
import java.util.Scanner;
/**
 * This class represents a regestration page for an application called GoFo
 *@ author Mohamed Ali , Menna Hamedy , Sara ALaa
 */

public class Rejester {
    private String USerName;
    private static int User_ID=0;
    private String PassWord;
    private String Email;
    private String Phone_Num;
    private String Location;


    /**
     *
     * Constractor that sets our Users informations (Player,Owner).
     *@param uSerName
     *@param passWord
     *@param email
     *@param phone_num
     *@param location
     */
    //Enter Data
    public Rejester(String uSerName, String passWord, String email, String phone_num, String location) {
        USerName = uSerName;
        User_ID ++;
        PassWord = passWord;
        Email = email;
        Phone_Num = phone_num;
        Location = location;
    }

    /**
     * Boolean Function to check if the user enter the right password or not.
     * we concentrate in this function that the user password minimum size must equal
     * at least 8 numbers.
     *
     *@return return True if user enter correct password
     *@return return False if user enter incorrect password
     */

    public boolean CheackPasswordFormate(){
        if (this.PassWord.length()<8){
            System.out.println("The password min size must equal 8 or more");

            return false;
        }
        return true;
    }

    /**
     * Boolean Function to check if the user enter the right Email Format or not.
     * the email must ends with ("@gmail.com").
     *
     *@return return True if user enter correct Email Format.
     *@return return False if user enter incorrect Email Format.
     */

    public boolean CheackEmailFormate(){
        if (Email.endsWith("@gmail.com"))
            return true;
        System.out.println("Please Enter Correct Email");
        return false;
    }



    /** getUSerName method returns name of User.
     *@return returns name of User.
     */

    public String getUSerName() {
        return USerName;
    }

    /** setUSerName method set the name of User.
     *@params USerName which is the name of User.
     */
    public void setUSerName(String USerName ) {
        this.USerName = USerName;
    }

    /** getUser_ID method returns User ID.
     *@return returns User ID.
     */
    public int getUser_ID() {
        return User_ID;
    }

    /** setUser_ID method set User ID.
     *@params user_ID which is the ID of User.
     */
    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }

    /** getPassWord method returns User Password.
     *@return returns User Paaword.
     */

    public String getPassWord() {
        return PassWord;
    }

    /** setPassWord method set User Password.
     *@params passWord which is the passWord  of User.
     */

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    /** getEmail method returns User Email.
     *@return returns User Email.
     */


    public String getEmail() {
        return Email;
    }

    /** setPassWord method set User Email.
     *@params email which is the email of User.
     */

    public void setEmail(String email) {
        Email = email;
    }

    /** getPhone_Num method returns User phone_number.
     *@return returns User phone_number.
     */


    public String getPhone_Num() {
        return Phone_Num;
    }


    /** setPhone_Num method set User Phone_Num.
     *@params phone_Num which is the phone_Num of User.
     */


    public void setPhone_Num(String phone_Num) {
        Phone_Num = phone_Num;
    }

    /** getLocation method returns User Location.
     *@return returns User Location.
     */

    public String getLocation() {
        return Location;
    }

    /** setLocation method set User Location.
     *@params location which is the location of User.
     */

    public void setLocation(String location) {
        Location = location;
    }
}
