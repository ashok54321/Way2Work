package testcases;

import java.util.Date;

public class TestTimeStamp {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date.toString().replace(":", "_").replace(" ", "_")+".jpg");

	}

}
