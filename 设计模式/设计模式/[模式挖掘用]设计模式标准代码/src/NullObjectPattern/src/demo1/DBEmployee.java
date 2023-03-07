package NullObjectPattern.src.demo1;

import java.util.Date;

public class DBEmployee extends Employee {

	@Override
	public boolean isPayDay(Date today) {
		//if() �Ƿ��������
		return false;
	}

	@Override
	public void pay() {
		//ʵ��֧��
		
	}

}
