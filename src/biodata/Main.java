/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodata;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main (String [] args){
        biodata data = new biodata ();
        
        data.setfullname("Ezra");
        data.setplaceofbirth("Jakarta");
        data.setdateofbirth("22/06/2003");
        data.sethobby("drakor");
        data.setzodiac("cancer");
        data.setfavfood("meatball");
        data.setfuturegoal("sucessfull person");
        
        System.out.println(data.getFullname());
        System.out.println(data.getPlaceofbirth());
        System.out.println(data.getDateofbirth());
        System.out.println(data.getHobby());
        System.out.println(data.getZodiac());
        System.out.println(data.getFavfood());
        System.out.println(data.getFutureGoal());
    }

   
    }
    


