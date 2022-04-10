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
 MyExercises[] myexercises = new MyExercises[10];
 int purchaseArraySize=2;
 PurchaseExercises[] purchaseExercises=new PurchaseExercises[purchaseArraySize];
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
        universitySportCenter.InsertData();
        universitySportCenter.DashBoardData();
    }
    
    public void InsertData()
    {
         MyExercises yoga = new MyExercises("Yoga",1,300,5,"Sunday","Morning");
         MyExercises Sweat = new MyExercises("Sweat",2,300,6,"Sunday","AfterNoon");
         MyExercises PowerHour = new MyExercises("Power Hour",3,300,5,"Sunday","Evening");
         MyExercises CurlsCrunches = new MyExercises("Curls n’ Crunches",4,300,7,"Sunday","Morning");
         MyExercises FabFitFun = new MyExercises("Fab & Fit & Fun",5,300,3,"Saturday","AfterNoon");
         MyExercises AbsFab = new MyExercises("Abs Fab / Fab Abs",6,300,2,"Saturday","Evening");
         MyExercises WalkthisWeigh = new MyExercises("Walk this Weigh",7,300,4,"Saturday","Morning");
         MyExercises WishfulShrinking = new MyExercises("Wishful Shrinking",8,300,0,"Saturday","AfterNoon");
         MyExercises Transform = new MyExercises("Transform",9,300,3,"Saturday","Evening");
         MyExercises SweatFest = new MyExercises("Sweat Fest",10,300,1,"Sunday","Morning");

         myexercises[0]= yoga;
         myexercises[1]= Sweat;
         myexercises[2]= PowerHour;
         myexercises[3]= CurlsCrunches;
         myexercises[4]= FabFitFun;
         myexercises[5]= AbsFab;
         myexercises[6]= WalkthisWeigh;
         myexercises[7]= WishfulShrinking;
         myexercises[8]= Transform;
         myexercises[9]= SweatFest;
         
        PurchaseExercises yogaPurchase = new PurchaseExercises("Yoga",1,300,5,"Sunday","Morning");
        PurchaseExercises WalkthisWeighPurchase = new PurchaseExercises("Walk this Weigh",7,300,4,"Saturday","Morning");
        purchaseExercises[0]= yogaPurchase;
        purchaseExercises[1]= WalkthisWeighPurchase;


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
        for(int i=0;i<purchaseArraySize;i++)
        {
          System.out.println("id:"+purchaseExercises[i].getId()+"\nName:"+purchaseExercises[i].getName()+"\nTime:"+purchaseExercises[i].getDay()+" "+purchaseExercises[i].getTime()+"\nPrice:"+purchaseExercises[i].getPrice()+"\nTotal Members:"+purchaseExercises[i].getMembers()+"\n\n");
        }        
        
          char selection ='A';
		do{
                        System.out.println("Are you want to Update any Exercise(Enter Y or N) Thanks!");
			selection = input.next().charAt(0);
			selection = Character.toLowerCase(selection);
		}
		while (selection != 'y'&& selection != 'n');
                if(selection=='y')
                {
                    int UpdateId=0;
                    boolean isExisit=false;
                    do{
                        System.out.println("Please enter exercise id number to update Thanks!");
			UpdateId = input.nextInt();
                         for(int i=0;i<purchaseArraySize;i++)
                        {
                            if(purchaseExercises[i].getId()==UpdateId)
                            {
                                isExisit=true;
                            }
                           
                            
                        }   
                         if(isExisit==true)
                         {
                           System.out.println("validate Exercise id succesfully!");
                         }
                         else
                         {
                          System.out.println("invalid Exercise id Thanks!");
                         }
                        
		}
		while (isExisit==false);
                    
                     this.UpdateExercise(UpdateId);
                     
                }
                else
                {
                    this.DashBoardData();
                }
//                this.DashBoardData();

    };
    
    public void UpdateExercise(int UpdateId)
    {
        for(int i=0;i<10;i++)
        {
          System.out.println("id:"+myexercises[i].getId()+"\nName:"+myexercises[i].getName()+"\nTime:"+myexercises[i].getDay()+" "+myexercises[i].getTime()+"\nPrice:"+myexercises[i].getPrice()+"\nTotal Members:"+myexercises[i].getMembers()+"\n\n");
        }
        
        
        int NewId=0;
        boolean isExisit=false;
                    do{
                        System.out.println("Please enter exercise id number to update Thanks!");
			NewId = input.nextInt();
                         for(int i=0;i<myexercises.length;i++)
                        {
                            if(myexercises[i].getId()==NewId)
                            {
                                isExisit=true;
                            }
                           
                            
                        }   
                         if(isExisit==true)
                         {
                           System.out.println("validate Exercise id succesfully!");
                         }
                         else
                         {
                          System.out.println("invalid Exercise id Thanks!");
                         }
                        
		}
		while (isExisit==false);
                    if(myexercises[NewId].getMembers()<5)
                    {
                     System.out.println("Number of members less then 4 Thanks!");
                     this.DashBoardData();
                    }
                    else if(myexercises[NewId].getPrice()!=purchaseExercises[UpdateId].getPrice())
                        {
                     System.out.println("Exercise Price conflicts Thanks!");
                     this.DashBoardData();
                    }
                    else if(NewId==UpdateId)
                        {
                     System.out.println("New Exercise and Updated Exercise same Thanks!");
                     this.DashBoardData();
                    }
                    for(int i=0;i<purchaseArraySize;i++)
                     {
                        if(myexercises[NewId].getDay().equals(purchaseExercises[i].getDay()) && myexercises[NewId].getTime().equals(purchaseExercises[i].getTime()))
                        {
                          System.out.println("Exercise time conflicts Thanks!");
                          this.DashBoardData();
                        }

                     } 
                         
                    myexercises[UpdateId-1].setMembers( myexercises[UpdateId-1].getMembers()-1);
                    myexercises[NewId-1].setMembers( myexercises[NewId-1].getMembers()+1);
                    
                    for(int i=0;i<purchaseArraySize;i++)
                     {
                        
                        if(purchaseExercises[i].getId()==UpdateId)
                        {
                         purchaseExercises[i].setName(myexercises[NewId-1].getName());
                         purchaseExercises[i].setId(myexercises[NewId-1].getId());
                         purchaseExercises[i].setMembers(myexercises[NewId-1].getMembers());
                         purchaseExercises[i].setPrice(myexercises[NewId-1].getPrice());
                         purchaseExercises[i].setDay(myexercises[NewId-1].getDay());
                         purchaseExercises[i].setTime(myexercises[NewId-1].getTime());
                         System.out.println("Exercise update Succesfully Thanks!");

                        }

                     } 
                    this.DashBoardData();

                    
        
    };
    
    
    
    public void CurrentAvailableExercises()
            
    {
       
        for(int i=0;i<10;i++)
        {
          System.out.println("id:"+myexercises[i].getId()+"\nName:"+myexercises[i].getName()+"\nTime:"+myexercises[i].getDay()+" "+myexercises[i].getTime()+"\nPrice:"+myexercises[i].getPrice()+"\nTotal Members:"+myexercises[i].getMembers()+"\n\n");
        }
        
        
        
          char selection ='A';
		do{
                        System.out.println("Please Enter ( y ) to go back Thanks!");
			selection = input.next().charAt(0);
			selection = Character.toLowerCase(selection);
		}
		while (selection != 'y');
                this.DashBoardData();
    
       
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


