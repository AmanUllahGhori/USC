/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitysportcenter;

/**
 *
 * @author shahr
 */
public class PurchaseExercises {
    
	private String name;
        private int id;
        private int price;
        private int members;
        private String day;
        private String time;
       
        
        public PurchaseExercises(String name,int id,int price,int members,String day,String Time) {
		this.name=name;
                this.id=id;
                this.price=price;
                this.members=members;
                this.day=day;
                this.time=Time;
                
	}
         public PurchaseExercises() {
		
	 }
        
        public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
        
        public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
        
        public int getPrice()
	{
		return this.price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
        
        public int getMembers()
	{
		return this.members;
	}
	
	public void setMembers(int members)
	{
		this.members = members;
	}
        
        public String getDay()
	{
		return this.day;
	}
	
	public void setDay(String day)
	{
		this.day = day;
	}
        
        public String getTime()
	{
		return this.time;
	}
	
	public void setTime(String Time)
	{
		this.time = Time;
	}


}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

