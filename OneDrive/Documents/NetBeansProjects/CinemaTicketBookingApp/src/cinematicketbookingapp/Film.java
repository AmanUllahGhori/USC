/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketbookingapp;

/**
 *
 * @author giuseppe
 */
public class Film {
	private String filmTitle;
	private Rating rating;
	
	public Film(String title) {
		this.setTitle(title);
		rating=new Rating();
	}
	
	public Film(){
		this.filmTitle = "Unknown";
		this.rating = new Rating();
	}
	
	public String getTitle()
	{
		return this.filmTitle;
	}
	
	public void setTitle(String name)
	{
		this.filmTitle = name;
	}
	
	public Rating getRating()
	{
		return this.rating;
	}
	
	public void setRating(Rating rate)
	{
		this.rating = rate;
	}
	
	public String toString()
	{
		return this.filmTitle+" ("+this.rating+")";
	}
}
