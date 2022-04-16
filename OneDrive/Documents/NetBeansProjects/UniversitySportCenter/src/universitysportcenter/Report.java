/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitysportcenter;

/**
 *
 * @author shahr
 */

public class Report {
    
	private String studentName;
        private int exerciseId;
        private String exerciseName;
        private int reportId;
        private String reportComent;
        private int weekNumber;
       
        
        public Report(String name,int id,String exerciseName,int reportId,String reportComent,int weekNumber) {
		this.studentName=name;
                this.exerciseId=id;
                this.exerciseName=exerciseName;
                this.reportId=reportId;
                this.reportComent=reportComent;
                this.weekNumber=weekNumber;
                
	}
         public Report() {
		
	 }
        
        public String getStudentName()
	{
		return this.studentName;
	}
	
	public void setStudentName(String name)
	{
		this.studentName = name;
	}
        
        public int getExerciseId()
	{
		return this.exerciseId;
	}
	
	public void setExerciseId(int id)
	{
		this.exerciseId = id;
	}
        
        public String getExerciseName()
	{
		return this.exerciseName;
	}
	
	public void setExerciseName(String exerciseName)
	{
		this.exerciseName = exerciseName;
	}
        
        public int getReportId()
	{
		return this.reportId;
	}
	
	public void setReportId(int reportId)
	{
		this.reportId = reportId;
	}
        
        public String getReportComent()
	{
		return this.reportComent;
	}
	
	public void setReportComent(String reportComent)
	{
		this.reportComent = reportComent;
	}
        
        public int getWeekNumber()
	{
		return this.weekNumber;
	}
	
	public void setwWeekNumber(int weekNumber)
	{
		this.weekNumber = weekNumber;
	}


}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

