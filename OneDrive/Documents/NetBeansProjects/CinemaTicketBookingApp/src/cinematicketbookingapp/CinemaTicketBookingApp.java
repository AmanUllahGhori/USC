/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketbookingapp;

import java.util.Scanner;
/**
 *
 * @author giuseppe
 */
public class CinemaTicketBookingApp {

  
        public static void main(String[]args){
            FilmController fc;
            fc=new FilmController();
            
            System.out.println("The film with the highest rating is"+fc.highestRating().getTitle());
            
        }

	
}
