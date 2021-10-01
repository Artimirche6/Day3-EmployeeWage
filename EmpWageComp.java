public class EmpWageComp
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_OF_WORKING_DAYS = 2;


	public static void main(String args[])
	{

		int empHrs = 0;
		int empWage = 0, totalEmpWage = 0;

		for (int day=0; day < NUM_OF_WORKING_DAYS; day++)
		{

			int empCheck = (int) (Math.floor(Math.random()*10)%3);

 			System.out.println("EmpCheck : " + empCheck);

			switch(empCheck)
	 		{
				case IS_FULL_TIME:
	   				empHrs=8;
	   				System.out.println("Employee is Present");
	   				break;
				case IS_PART_TIME:
	  				empHrs=4;
					System.out.println("Employee is Part Time Present");
 					break;
	 			default:
		 			empHrs=0;
	   				System.out.println("Employee is Absent");
 			}

			empWage=empHrs*EMP_RATE_PER_HOUR;
		        System.out.println("Employee Wage : "+empWage);
			totalEmpWage += empWage;

		}

 	System.out.println("Total Employee Wage : "+totalEmpWage);
	
	}

}
