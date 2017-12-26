import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.Calendar;

public class Helloworld {
	public static void main(String[] args)  {
		Calendar Cld = Calendar.getInstance();
		int YY = Cld.get(Calendar.YEAR) ;
		int MM = Cld.get(Calendar.MONTH)+1;
		int DD = Cld.get(Calendar.DATE);
		int HH = Cld.get(Calendar.HOUR_OF_DAY);
		int mm = Cld.get(Calendar.MINUTE);
		int SS = Cld.get(Calendar.SECOND);
		int MI = Cld.get(Calendar.MILLISECOND);    
		//由整型而来,因此格式不加0,如  2016/5/5-1:1:32:694
		System.out.println(YY + "/" + MM + "/" + DD + "-" + HH + ":" + mm + ":" + SS + ":" + MI);

		//func2
		Calendar cal = Calendar.getInstance(); 
		Date date = cal.getTime();
		//  2016/05/05-01:01:34:364
		System.out.println(new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(date));

		//func3  2016/05/05-01:01:34:364
		System.out.println(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));

		String nowtime = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		System.out.println(nowtime);

		test1 test1qqq = new test1();
		test2 test2qqq = new test2();
		test2qqq.setCity("1");
		test2qqq.setHome("2");
		test2qqq.setName("3");

		test1qqq.setLocation("4");
		test1qqq.setSchool("6");
		test1qqq.setTest2objec(test2qqq);
		test2qqq.setTest1objec(test1qqq);
		//test1qqq.setTest2objec(test2qqq);

		System.out.println(test1qqq.getLocation()+"  "+test1qqq.getSchool()+"  "+test1qqq.getTest2objec().getTest1objec().getLocation());
		String string = "";

		System.out.println(System.currentTimeMillis());
		System.out.println(new Date());
		System.out.println(new Date().toString());

		System.out.println(new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss:SSS").format(new Date()));

		String str = "http://weixin.qq.com/q/02uwfgdAlJcX210000M032";

		if (str.startsWith("http://weixin.qq.com/q/")) {
			str = str.replace("http://weixin.qq.com/q/", "");
		}
		System.out.println(str);
		
		
		String imei="123456789";
		System.out.println(imei);
		System.out.println(imei.length());
		System.out.println(imei.substring(imei.length()-5, imei.length()));		
		
		
	}

	

}
