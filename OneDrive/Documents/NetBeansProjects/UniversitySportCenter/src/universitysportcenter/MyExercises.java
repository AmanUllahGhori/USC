/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitysportcenter;

/**
 *
 * @author shahr
 */
public class MyExercises {
    
	private String name;
        private int id;
        private double price;
        private int members;
        private String day;
        private String morningTime;
        private String AfternoonTime;
        private String EveningTime;
        
        public MyExercises(String name,int id,double price,int members,String day,String morningTime,String AfternoonTime,String EveningTime) {
		this.name=name;
                this.id=id;
                this.price=price;
                this.members=members;
                this.day=day;
                this.morningTime=morningTime;
                this.AfternoonTime=AfternoonTime;
                this.EveningTime=EveningTime;
	}
         public MyExercises() {
		
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
        
        public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
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
        
        public String getMoringTime()
	{
		return this.morningTime;
	}
	
	public void setMoringTime(String morningTime)
	{
		this.morningTime = morningTime;
	}
        
        public String getAfternoonTime()
	{
		return this.AfternoonTime;
	}
	
	public void setAfternoonTime(String AfternoonTime)
	{
		this.AfternoonTime = AfternoonTime;
	}
        
        public String getEveningTime()
	{
		return this.EveningTime;
	}
	
	public void setEveningTime(String EveningTime)
	{
		this.EveningTime = EveningTime;
	}
        


        



}
