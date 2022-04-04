/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuiexcerciseproject.cuiexcerciseproject;

/**
 *
 * @author shahr
 */
public class AvailableExercisesModal {
    public int id;
    public String ExerciseName;
    public String Day;
    public double Price;
  
    // Student class constructor
    AvailableExercisesModal(String name,double price,String day)
    {
        
        this.ExerciseName = name;
        this.Price=price;
        this.Day=day;
        
    }
}
