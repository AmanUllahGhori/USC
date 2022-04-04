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
public class FilmController {
        private Scanner input = new Scanner(System.in);
	private final int NUMBER_OF_FILMS = 4;
	private Film[] filmList = new Film[NUMBER_OF_FILMS];
	
	static Customer customer = new Customer();
	Film desiredFilm = new Film();
        
        public Film highestRating(){
            
            Film hR=new Film();
            double rt=filmList[0].getRating().getAvg();
            for (int i=1; i<=filmList.length;i++){
                if (filmList[i].getRating().getAvg()>rt)
                    rt=filmList[i].getRating().getAvg();
            }
            return hR;
        }
//SELECTING THE FILM
	private Film filmSelection() {	
		for(int count = 0; count < NUMBER_OF_FILMS; count++){
			System.out.println((count + 1) + ". " + filmList[count]);
		}
		System.out.println("Which film would you like to watch?");
		int selection = input.nextInt();
		selection -= 1;
	
		if(selection > NUMBER_OF_FILMS | selection < 0)
		{
			System.out.println("Invalid number entered.");
			filmSelection();
		}
		
		return filmList[selection];
		
	}
	//ISSUING THE TICKET
	 private  Ticket issueTicket(Customer aCustomer, Film aFilm) {
		 Ticket ticket = new Ticket(aCustomer, aFilm);
		 int minimumAge=2;
		 
		 //Makes sure the customer is old enough to view the movie.
		if (aCustomer.getAge() >= minimumAge) {
			return ticket;
		}
		else {
			System.out.println("Sorry, You are not old enough to see this film. \n");
			return null;
		}
	}




//ENTERING AND VALIDATING CUSTOMER DETAILS
	private Customer customerDetailsInput() {
		String custName = "";
		int custAge = -1;
		char custStud = '0';
		
		//Ensures a Name is entered.
		do{
			System.out.println("Enter your Name: ");
			custName = input.nextLine();
		}
		while(custName.isEmpty());
		customer.setName(custName);
		
		System.out.println("Enter your Age: ");
		custAge = input.nextInt();

		//Validating Age
		while(custAge < 0 || custAge > 130 || custAge != (int)custAge)
		{
			custAge = -1;
			System.out.println("Please enter a valid Age: ");
			custAge = input.nextInt();
		}
		customer.setAge(custAge);
		
		//Checks if customer is a student
		do{
			System.out.println("Are you a student? (Type Y or N): ");
			custStud = input.next().charAt(0);
			custStud = Character.toLowerCase(custStud);
		}
		while (custStud != 'y' && custStud != 'n');
		customer.setStud(custStud);
		
		return customer;
	}
        
        public FilmController(){
        
        Film antman = new Film("Ant-Man");
                Film minions = new Film("Minions");
		Film jurassic = new Film("Jurassic World"); 
		Film inside = new Film("Inside Out");
		
		filmList[0] = antman;
		filmList[1] = minions;
		filmList[2] = jurassic;
		filmList[3] = inside;
		
		//Recursion for issuing another ticket
		boolean purchaseLoop = true;
		do {
			System.out.println(issueTicket(customerDetailsInput(), filmSelection()));
			char purchaseAgain = '0';
			while(purchaseAgain != 'Y' && purchaseAgain != 'N') {
				System.out.println("Would you like to purchase another ticket? (Y / N)");
				purchaseAgain = input.next().charAt(0);
				purchaseAgain = Character.toUpperCase(purchaseAgain);
				if(purchaseAgain == 'N') {
					System.out.println("Goodbye!");
					purchaseLoop = false; //Closes the loop and the program.
				}	
				else if(purchaseAgain == 'Y') {
					continue; //Loops the program
				}
			}

		}
		while(purchaseLoop);
		//System.exit(0);
	}		
        
        
        
        }
        
        
	
	

	
		


