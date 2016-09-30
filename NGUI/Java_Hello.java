import java.awt.Graphics;
import java.applet.Applet;//
import java.util.*;//includes Vector/Calendar/Date;
import java.text.*;//includes DateFormat;
class   Java_Hello
{
	public static void main(String[] args) //方法；
	{
		/*int i=1;
		if(i<10)
		{
			System.out.println("i<10");

		}
        if (i>0) 
			System.out.println("i>0");
		if (i==1)
		{
			System.out.println("i Equals 1");
			System.out.println("Use one code block to");
			System.out.println("execute more than 1 statement");
		}
        if (i==2)
        {
			System.out.println("i Equals 2");
        }

		else 
		{
			System.out.println("i does not equals 2");
			System.out.println("We can execute more");
			System.out.println("than one statement in");
			System.out.println("an if");
		}
		if (i==1||i==2)
		{
			System.out.println("i equals 1 or 2");

		}
		if (i>0&&i<3)
		{
			System.out.println("i is >0 and <3");

		}
		if (i>0)
			if (i<3)
			{
				System.out.println("i is >0 and <3");
			}		
         int j=(i==1)?5:6;
		 System.out.println("j equals "+j);
		 System.out.println("i equals "+i);*/
		 //the programe above is a demostrition about if;
		
      /*
        String s = new String("Hello Again!");
		System.out.println("the length of s="+s.length());
        System.out.println("Hello Java!");
		*/
		//使用方法实例的案例；

/*
       int i=5;
	   String iString=String.valueOf(i);//iString 是属于String类的变量，此处为类方法；
	   System.out.println("Value of String is "+iString);
*/
	/*
	   String s = new String("Hello Again!");
	   System.out.println("length of s "+s.length());
	   System.out.println("chararcter at index 6 is "+s.charAt(6));
	   System.out.println("uppercase is "+s.toUpperCase());
*/




//string array-----------------------------------------------------
/*
	   String stringArray[] = new String[4];
	  // stringArray[0] = new String ("Hello");
	  //stringArray[1] = new String ("World");
	  // stringArray[2] = new String ("Wide");
	  // stringArray[3] = new String ("Web");
	   stringArray[0] = "Hello";
	   stringArray[1] = "World";
	   stringArray[2] = "Wide";
	   stringArray[3] = "Web";
	   //this is the same expression about intitialize the stringArray;
	   for (int i=0;i<stringArray.length ;i++ )
	   {
		   System.out.println(stringArray[i]);
		  System.out.println("the length of string above is "+stringArray[i].length());	
	   }
	  */
//string array----------------------------------------------------------





    //String 类中的方法和string array 的综合使用--------------------------------------
/*
	 String stringArray[] = new String[4];
	stringArray[0] = "Hello";
	stringArray[1] = "World";
    stringArray[2] = "Wide";
	stringArray[3] = "Web";
	String searchValue = "Web";
	int i = 0;
	boolean found = false;
	while (i < stringArray.length && !found)
	{
		if (searchValue.equals(stringArray[i]))//比较两个字符串是否相等
			found = true;
		else 
			i++;
		
	}
    if (found)
    {
		System.out.println("system has found the searchValue!");
		System.out.println("the serchValue is in line "+(i+1));
    }
	System.out.println("UpperCase the all String now !");
	for (int k=0;i<stringArray.length;k++ )
	{
		System.out.println(stringArray[k].toUpperCase());//大写方法
	}
//------------------------------------------------------------------------------------------

*/







//Vector类--------------------------------------------------------------------------------
/*	
Vector aVector = new Vector(3);
String s1 = new String ("Hello");
String s2 = new String ("World");
String s3 = new String ("Wide");
String s4 = new String ("Web");
aVector.add(s1);//one way to add the string;
aVector.add(s2);
aVector.add(new String ("Wide"));//another way to add the string;
System.out.println("the element of aVector is "+aVector.capacity());//the number of Vectro elements;
System.out.println(aVector.size() + " are populated");
System.out.println(aVector.contains("Hello"));//find the string "Hello" in the Vector; 
aVector.add(s4);
for (int i=0;i<aVector.size() ;i++ )//remember not to forget the ();
{
	System.out.println(aVector.get(i));//return the Vector located at i;
}
System.out.println("the newest element of Vector is "+aVector.capacity());

*/
//------------------------------------------------------------------------------------------







//Processing the time and  date-------------------------------------------------------------
/*
Calendar aCalendar = Calendar.getInstance();//do not use new;
Date today = aCalendar.getTime();//get the date information;
aCalendar.add(Calendar.MONTH,1);
aCalendar.add(Calendar.YEAR,1);//给予当前时间的计算，分别是月份加1，年份加1的时间；
Date aYearAndMonthLater = aCalendar.getTime();//对时间进行了重新的计算，此时相当于重新装填了
                                              //时间列表所以需要使用进行再次的获取时间信息；

aCalendar.set(1993,Calendar.MARCH,19);//设置时间，1993-03-19；
Date jiangluBirthday = aCalendar.getTime();//重新进行时间的获取；

DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);//设置日期显示的格式为长格式，这种格式比较多见；
DateFormat mediumFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);//设置日期的时间格式为中格式，这样的时间显示的格式也是比较多见得；
DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT);//设置时间的显示格式为短格式，时间显示比较简单，一目了然；
System.out.println("long format today is "+longFormat.format(today));//这是一个实例方法，调用了format方法（从属于DateFormat类）
System.out.println("medium format today is "+mediumFormat.format(today));
System.out.println("short format today is "+shortFormat.format(today));
System.out.println("the birthday od jianglu is "+longFormat.format(jiangluBirthday));
System.out.println("A year and month later is "+longFormat.format(aYearAndMonthLater));
if (aYearAndMonthLater.after(today))？//这仍然是一个实例方法，用于比较两者的时间那个在前面那个在后面（before and after）；
{
	System.out.println("aYearAndMonthLater is after today!");
}
if (today.before(aYearAndMonthLater))	
{
	System.out.println("today is beofore aYearAndMonthLater!");
}
*/

//-----------------------------------------------------------------------------------------------------------------




//使用包装器类（原语变量和包装器实例的区别要注意区分）-------------------------------------------------------------
/*
double d=1.1;//原语变量；
Double doubleWrapper = new Double(d);//数据包装器；引用doubleWrapper指向包含1.1的一个double实例；
System.out.println("d = "+d);
System.out.println("doubleWrapper = "+doubleWrapper);

//相互转换------------------------实例方法；
Double doublePrimitive = doubleWrapper.doubleValue();//xxxValue的方法功能是找出doubleWrapper中含有的double数据；
                                                     //xxx为数据类型，主要是为了查找出xxx数据类中包含的原始XXX型数据，属于同型类的查找；
System.out.println("the value in Wrapper is "+doublePrimitive);
//相互转换------------------------


//String的原语数据和字符串的转换-------(double--String)

//类方法；
String firstString = new String("2.2");
doublePrimitive = Double.parseDouble(firstString);//String to double;
//doublePrimitive = firstString.parseDouble();//这种表述没有方法，所以是错误的；
//System.out.println("String to Primitive2 is "+doublePrimitive);
System.out.println("String to Primitive is "+doublePrimitive);
String secondString = Double.toString(doublePrimitive);//double to String;
System.out.println("Primitive to Sring is "+secondString);
secondString = doublePrimitive.toString();
System.out.println("Primitive to String2 is "+secondString);


//将实例的String原始数据静态包装包装为double类数据；
String thirdString = new String("3.3");
doubleWrapper = Double.valueOf(thirdString);//相较于Double.parseDouble(thirdString)方法而言，本段程序是为了展示实例化转double类的包装，而后是为了展示字符串和原数据之间的转换，侧重点不一样；
System.out.println("String  to Wrapper is "+doubleWrapper);

//
String fourthString = doubleWrapper.toString();
System.out.println("Wrapper to String is "+fourthString);

fourthString = Double.toString(doubleWrapper);
System.out.println("Wrapper to String2 is "+fourthString);


//------------------------------函数和案例都很丰富------------------------------------------------------------------------------------------

//总结如下：
//1.字符串和原语数据之间的转换：DoubleVariable = Double.parseDouble(StringVariable);StringVariable = Double.toString(DoubleVariable);
//2.String实例和包装器实例之间的转换：DoubleVariable = Double.valueOf(StringVariable);StringVariable = DoubleVariable.toString();
//3.StringVariable = Double.toString(DoubleVariable)和StringVariable = DoubleVariable.toString()可以互相地转换；

//---------------------------------end of 包装器---------------------------------------------------------------------------------------------
*/





	}
}



