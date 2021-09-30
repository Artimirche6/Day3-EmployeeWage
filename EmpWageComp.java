public class EmpWageComp
{
	public static void main(String[] args)
	{

		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;

		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;

		int empCheck = (int) (Math.floor(Math.random()*10)%3);

 		System.out.println("EmpCheck : "+empCheck);

		if(empCheck == IS_FULL_TIME)
 		{
	   	empHrs=16;
	   	System.out.println("Employee is Present");
	   }
		else if(empCheck == IS_PART_TIME)
 		{
	  		empHrs=8;
			System.out.println("Employee is Part Time Present");
 		}
 		else
 		{    
	 		empHrs=0;
	   	System.out.println("Employee is Absent");
 		}

 	empWage=empHrs*EMP_RATE_PER_HOUR;
 	System.out.println("Employee Wage : "+empWage);
	
	}

}
