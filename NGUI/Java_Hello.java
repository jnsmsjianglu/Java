import java.awt.Graphics;
import java.applet.Applet;//
import java.util.*;//includes Vector/Calendar/Date;
import java.text.*;//includes DateFormat;
class   Java_Hello
{
	public static void main(String[] args) //������
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
		//ʹ�÷���ʵ���İ�����

/*
       int i=5;
	   String iString=String.valueOf(i);//iString ������String��ı������˴�Ϊ�෽����
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





    //String ���еķ�����string array ���ۺ�ʹ��--------------------------------------
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
		if (searchValue.equals(stringArray[i]))//�Ƚ������ַ����Ƿ����
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
		System.out.println(stringArray[k].toUpperCase());//��д����
	}
//------------------------------------------------------------------------------------------

*/







//Vector��--------------------------------------------------------------------------------
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
aCalendar.add(Calendar.YEAR,1);//���赱ǰʱ��ļ��㣬�ֱ����·ݼ�1����ݼ�1��ʱ�䣻
Date aYearAndMonthLater = aCalendar.getTime();//��ʱ����������µļ��㣬��ʱ�൱������װ����
                                              //ʱ���б�������Ҫʹ�ý����ٴεĻ�ȡʱ����Ϣ��

aCalendar.set(1993,Calendar.MARCH,19);//����ʱ�䣬1993-03-19��
Date jiangluBirthday = aCalendar.getTime();//���½���ʱ��Ļ�ȡ��

DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);//����������ʾ�ĸ�ʽΪ����ʽ�����ָ�ʽ�Ƚ϶����
DateFormat mediumFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);//�������ڵ�ʱ���ʽΪ�и�ʽ��������ʱ����ʾ�ĸ�ʽҲ�ǱȽ϶���ã�
DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT);//����ʱ�����ʾ��ʽΪ�̸�ʽ��ʱ����ʾ�Ƚϼ򵥣�һĿ��Ȼ��
System.out.println("long format today is "+longFormat.format(today));//����һ��ʵ��������������format������������DateFormat�ࣩ
System.out.println("medium format today is "+mediumFormat.format(today));
System.out.println("short format today is "+shortFormat.format(today));
System.out.println("the birthday od jianglu is "+longFormat.format(jiangluBirthday));
System.out.println("A year and month later is "+longFormat.format(aYearAndMonthLater));
if (aYearAndMonthLater.after(today))��//����Ȼ��һ��ʵ�����������ڱȽ����ߵ�ʱ���Ǹ���ǰ���Ǹ��ں��棨before and after����
{
	System.out.println("aYearAndMonthLater is after today!");
}
if (today.before(aYearAndMonthLater))	
{
	System.out.println("today is beofore aYearAndMonthLater!");
}
*/

//-----------------------------------------------------------------------------------------------------------------




//ʹ�ð�װ���ࣨԭ������Ͱ�װ��ʵ��������Ҫע�����֣�-------------------------------------------------------------
/*
double d=1.1;//ԭ�������
Double doubleWrapper = new Double(d);//���ݰ�װ��������doubleWrapperָ�����1.1��һ��doubleʵ����
System.out.println("d = "+d);
System.out.println("doubleWrapper = "+doubleWrapper);

//�໥ת��------------------------ʵ��������
Double doublePrimitive = doubleWrapper.doubleValue();//xxxValue�ķ����������ҳ�doubleWrapper�к��е�double���ݣ�
                                                     //xxxΪ�������ͣ���Ҫ��Ϊ�˲��ҳ�xxx�������а�����ԭʼXXX�����ݣ�����ͬ����Ĳ��ң�
System.out.println("the value in Wrapper is "+doublePrimitive);
//�໥ת��------------------------


//String��ԭ�����ݺ��ַ�����ת��-------(double--String)

//�෽����
String firstString = new String("2.2");
doublePrimitive = Double.parseDouble(firstString);//String to double;
//doublePrimitive = firstString.parseDouble();//���ֱ���û�з����������Ǵ���ģ�
//System.out.println("String to Primitive2 is "+doublePrimitive);
System.out.println("String to Primitive is "+doublePrimitive);
String secondString = Double.toString(doublePrimitive);//double to String;
System.out.println("Primitive to Sring is "+secondString);
secondString = doublePrimitive.toString();
System.out.println("Primitive to String2 is "+secondString);


//��ʵ����Stringԭʼ���ݾ�̬��װ��װΪdouble�����ݣ�
String thirdString = new String("3.3");
doubleWrapper = Double.valueOf(thirdString);//�����Double.parseDouble(thirdString)�������ԣ����γ�����Ϊ��չʾʵ����תdouble��İ�װ��������Ϊ��չʾ�ַ�����ԭ����֮���ת�������ص㲻һ����
System.out.println("String  to Wrapper is "+doubleWrapper);

//
String fourthString = doubleWrapper.toString();
System.out.println("Wrapper to String is "+fourthString);

fourthString = Double.toString(doubleWrapper);
System.out.println("Wrapper to String2 is "+fourthString);


//------------------------------�����Ͱ������ܷḻ------------------------------------------------------------------------------------------

//�ܽ����£�
//1.�ַ�����ԭ������֮���ת����DoubleVariable = Double.parseDouble(StringVariable);StringVariable = Double.toString(DoubleVariable);
//2.Stringʵ���Ͱ�װ��ʵ��֮���ת����DoubleVariable = Double.valueOf(StringVariable);StringVariable = DoubleVariable.toString();
//3.StringVariable = Double.toString(DoubleVariable)��StringVariable = DoubleVariable.toString()���Ի����ת����

//---------------------------------end of ��װ��---------------------------------------------------------------------------------------------
*/





	}
}



