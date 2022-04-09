/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universitysportcenter;
import java.util.Scanner;
/**
 *
 * @author shahr
 */
public class UniversitySportCenter {
 public  Scanner input = new Scanner(System.in);
 MyExercises myExercises=new MyExercises();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     System.out.println("""
                              ---------------------------- 
                           Welcome Back to CUI Exercise Center 
                              ----------------------------""");
        UniversitySportCenter universitySportCenter=new UniversitySportCenter();
        universitySportCenter.DashBoardData();
    }
    
    public void DashBoardData() {
                int selection=0;
                        
                        
                    
		System.out.println(" 1 : Current Available Exercises");
                System.out.println(" 2 : Current Purchase Exercises");
                System.out.println(" 3 : Purchase Exercises");
		System.out.println(" 4 : Give Rating");
		System.out.println(" 5 : Display Maximum Earning Exersise");
                System.out.println(" 6 : Display Exersises Report");
               
                //Ensures a Name is entered.
		do{
			 System.out.println("Please select any option menu number");
                         selection = input.nextInt();
		}
		while(selection > 6 );
                System.out.println( selection+"Please select any option menu number");
            switch (selection) {
                case 1 -> this.CurrentAvailableExercises();
                case 2 -> this.CurrentPurchaseExercises();
                case 3 -> System.out.println("3 Current Purchase Exercises");
                case 4 -> System.out.println("4 Current Purchase Exercises");
                case 5 -> System.out.println("5 Current Purchase Exercises");
                case 6 -> System.out.println("6 Current Purchase Exercises");
                default -> System.out.println("else Current Purchase Exercises");
            }
                




	}
    
    public void CurrentPurchaseExercises()
    {
        
    };
    public void CurrentAvailableExercises()
    {
        MyExercises[] myexercises = new MyExercises[6];
        MyExercises yoga = new MyExercises("Yoga",1,300,5,"Sunday","8:00 AM","1:00 PM","8:00 PM");
        myexercises[0]= yoga;
        System.out.println("id:"+yoga.getId()+"\nName:"+yoga.getName());
    };
    public void GiveRating()
    {
        
    };
    public void MaxEarning()
    {
        
    };
    public void DisplayReport()
    {
        
    };
    
}


