package player;

import java.util.Scanner;

public class Player {
    private String name;
    private String address;
    private String contactnumber;
    private String emailid;
    private int age;

    public void setPlayerDetails(String name,String address,String contactnumber, String emailid,int age) {
        this.name = name;

        this.address = address;
        this.contactnumber = contactnumber;
        this.emailid = emailid;
        this.age = age;

    }

    public void setPlayerDetailsWithUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player name");
        String name = sc.next();
        System.out.println("Enter player emailid");
        String emailId = sc.next();
        System.out.println("Enter player age");
        int age = sc.nextInt();
        System.out.println("Enter player address");
        String address = sc.next();
        System.out.println("Enter player contactno.");
        String contactno = sc.next();

        this.setPlayerDetails(name,address,contactno,emailId,age);


    }

    public void setPlayerNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPlayerNameEmailAge(String name, String emailid, int age) {
        this.name = name;
        this.age = age;
        this.emailid = emailid;

    }


    public void setPlayerName(String name) {
        this.name = name;

    }

    public String getPlayerName() {
        return this.name;
    }



    public void getPlayerDetails() {
        System.out.println("Player Name: "+ this.name);
        System.out.println("Player Email: "+ this.emailid);
        System.out.println("Player Age: "+ this.age);
        System.out.println("Player Contact Number: "+ this.contactnumber);
        System.out.println("Player Address: "+ this.address);
    }


}
