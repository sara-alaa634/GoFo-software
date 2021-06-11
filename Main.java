
package software;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        List<PlayGround> playGrounds = new ArrayList<PlayGround>();
        Player player1=null ;
        Owner owner1 = null;

        Admistrator administrator1 = new Admistrator();
        int x;
        while (true) {
            System.out.println("Welcome in GOFO APPLication\n" + "For Register Enter 1\n" + "For Add Playground Enter 2\n" + "For Book PlayGround Enter 3\n" +
                    "For exit Enter 4");
            x= input.nextByte();
            Rejester rejester;
            if (x == 1) {
                System.out.println("1->Player\n" + "2->Owner");
                int y = input.nextByte();

                System.out.println("Please Enter The USerName");
                String userName = input.next();

                System.out.println("Please Enter Email");
                String Email = input.next();

                System.out.println("Please Enter Password");
                String password = input.next();
                System.out.println("Please Enter your phone Number");
                String PhoneNumber = input.next();
                System.out.println("Please Enter your Location");
                String Location = input.next();

                rejester = new Rejester(userName, password, Email, PhoneNumber, Location);

                while (true) {
                    if (y == 1) {
                        System.out.println("Please Enter Your Name");
                        String Name = input.next();
                        player1 = new Player(Name, userName, password, PhoneNumber, Email);
                        break;
                    } else if (y == 2) {
                        System.out.println("Please Enter Your Name");
                        String Name = input.next();
                        owner1 = new Owner(Name, userName, password, PhoneNumber, Email);
                        break;
                    } else
                        System.out.println("Please Enter vailid coice");
                }

            } else if (x == 2) {

                System.out.println("Please Enter Playground Name");
                String Name = input.next();
                System.out.println("Please Enter Playground Location");
                String Location = input.next();
                System.out.println("Please Enter Playground Size");
                int size = input.nextInt();
                System.out.println("Please Enter Playground Price");
                int price = input.nextInt();


                PlayGround playGround1 = new PlayGround(Name, Location, price, size);
                if (administrator1.cheackPlayground(playGround1)) {
                    System.out.println("Congratulation!..Your Playground Accepted");
                    playGrounds.add(playGround1);
                    owner1.AddPlayGround(playGround1);
                } else
                    System.out.println("Your Adding rejected");
            } else if (x == 3) {
                System.out.println("PlayGrounds");
                for (int i = 0; i < playGrounds.size(); i++) {
                    System.out.print(i + 1 + "-> ");
                    playGrounds.get(i).toString();
                    System.out.println();
                }
                Team team1 = new Team("Team1");
                team1.AddPlayer(player1);
                player1.AddTeam(team1);

                System.out.println("Please Enter The Number of Playground");
                int y = 0;
                while (true) {
                    y = input.nextByte();
                    if (y > playGrounds.size())
                        System.out.println("PlayGround Not Found\n" + "Please Enter correct input\n");

                    else
                        break;
                }
                System.out.println("Please Enter The Slot");
                int Slot = input.nextInt();
                Bookplayground bookplayground1;
                if (playGrounds.get(y - 1).IsFree(Slot)) {

                    bookplayground1 = new Bookplayground(Slot);
                    playGrounds.get(y - 1).Book(Slot);
                    System.out.println("Done");
                } else {
                    System.out.println("OPs...the slot is not empty");
                }
            } else
                break;

        }
    }
}