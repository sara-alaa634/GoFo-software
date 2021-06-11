package software;
import java.awt.print.Book;
import java.sql.Array;
import java.util.*;

/**
 * This class represents playground information and do some function that help in booking the playground for an application called GoFo
 *@ author Mohamed Ali , Menna Hamedy , Sara ALaa
 */

public class PlayGround {
    private String Name;
    private String Location;
    private int price;
    private int size;
    private int[] slots;

    /**
     * Default constractor intialize array of slots 1-24 (hours of the day).
     */

    public PlayGround() {
        slots = new int[24];
        for (int i = 1; i <= 24; i++) {
            slots[i - 1] = i;
        }
        //arr = removeTheElement(arr, index);
    }

    /**
     *
     *Constractor that sets playground information and intialize array of slots 1-24 (hours of the day) .

     *@param name
     *@param location
     *@param price
     *@param size
     */

    public PlayGround(String name, String location, int price, int size) {
        Name = name;
        Location = location;
        this.price = price;
        this.size = size;
        slots = new int[24];
        for (int i = 1; i <= 24; i++) {
            slots[i - 1] = i;
        }
    }

    /**
     * function to check if the slot the player want to book is from the availabe hours that the owner put or not
     *@param slot
     *@return return true if the slot is free and false if not
     */

    public boolean IsFree(int slot) {
        for (int i = 0; i < 24; i++) {
            if (slot == slots[i])
                return true;
        }
        return false;
    }

    /**
     * fuction that print the free hours for the playground
     */
    public void FreeHours() {
        for (int i = 0; i < slots.length; i++) {
            if(slots[i]!=0)
                System.out.print(slots[i] + " ");
        }
    }

    /**
     * Function that take the slot that the player want to book and remove it from the availabe
     * hours for the playground (from array of slots in playground by intialize this slot by 0)
     * @param
     */
    public void Book(int slot) {
        int idx = 0;
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == slot) {
                idx = i;
                break;
            }
            slots[idx]=0;
        }

    }


    /** getLocation method returns Location of playground
     *@return returns Location of playground
     */
    public String getLocation() {
        return Location;
    }
    /** setName method set the name of playground.
     *@params name which is the name of playground.
     */
    public void setName(String name) {
        Name = name;
    }
    /** setLocation method set the location of playground.
     *@params location which is the location of playground.
     */
    public void setLocation(String location) {
        Location = location;
    }

    /** setPrice method set the price of slot in playground.
     *@params price  which is the price of slot in playground.
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /** setSize method set the size of playground.
     *@params size which is the size of slot in playground.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /** getPrice method returns price of slot in playground
     *@return returns  price of slot in playground
     */

    public int getPrice() {
        return price;
    }

    /** getName method returns name of playground
     *@return returns  name of playground
     */
    public String getName() {
        return Name;
    }
    /** getSize method returns size of playground
     *@return returns  size of playground
     */

    public int getSize() {
        return size;
    }

    /**
     *Function to display all playground information
     */

    @Override
    public String toString() {
        return "PlayGround{" +
                "Name='" + Name + '\'' +
                ", Location='" + Location + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
