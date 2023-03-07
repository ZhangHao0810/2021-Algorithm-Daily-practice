package NullObjectPattern.src.demo1;

import java.util.Date;

public abstract class Employee {
   public abstract boolean isPayDay(Date today);
   
   public abstract void pay();
   
   public static NullEmployee NULLObject=new NullEmployee();
   
   public class NullEmployee extends Employee{

	@Override
	public boolean isPayDay(Date today) {
		return false;
	}

	@Override
	public void pay() {
				
	}
	   
   }
}
