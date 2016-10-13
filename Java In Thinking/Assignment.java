class  Number1{
	int i;
}
public class Assignment{
	public static void main(String[] args){
		Number1 n1 = new Number1();
		Number1 n2 = new Number1();
		n1.i = 9;
		n2.i = 47;
		System.out.println("1:n1.i = "+n1.i+" ,n2.i = "+n2.i);
		n1=n2;//由于是对对象的引用的复制，所以在下面的代码发现了改变了n1的值得同时也修改了n2的值；
	    System.out.println("2:n1.i = "+n1.i+" ,n2.i = "+n2.i);
		n1.i = 27;//由于n1和n2包含的是相同的引用，因此两者指向相同的对象使得
		System.out.println("3:n1.i = "+n1.i+" ,n2.i = "+n2.i);
	}
}
/*在讲到赋值的时候，我们要特别强调的是关于引用赋值的注意点：
 *对于基本数据的赋值是很简单的。基本类型存储了实际的数值，并非指向一个对象的引用
 *是直接将一个地方的内容复制到了另一个地方。
 *但是在作为对象“赋值”的时候，情况就发生了变化。对一个对象进行操作时，我们真正操作的
 *是对对象的引用。所以如果真的存在“将一个对象赋值给另一个对象”实际指的是将“引用”从一个地方复制到另一个地方。
*/