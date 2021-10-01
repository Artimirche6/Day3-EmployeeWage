public class EmpWageComp
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static final int EMP_RATE_PER_HOUR = 20;

        public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String args[])
	{

		int empHrs = 0;
		int empWage = 0, totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) 
		{

			totalWorkingDays++;
			System.out.println(" Day : "+totalWorkingDays);

			int empCheck = (int) (Math.floor(Math.random()*10)%3);

 			System.out.println("EmpCheck : " + empCheck);

			switch(empCheck)
	 		{
				case IS_FULL_TIME:
	   				empHrs=8;
	   				System.out.println("Employee is Full Time Present : "+empHrs);
	   				break;
				case IS_PART_TIME:
	  				empHrs=4;
					System.out.println("Employee is Part Time Present : "+empHrs);
 					break;
	 			default:
		 			empHrs=0;
	   				System.out.println("Employee is Absent : "+empHrs);
 			}

			totalEmpHrs += empHrs;
			System.out.println("Total Employee Hrs : "+totalEmpHrs);

			totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
                        System.out.println("Employee Wage : "+totalEmpWage);

		}

			
 	System.out.println("Total Employee Salary : "+totalEmpWage);
	
	}

}
