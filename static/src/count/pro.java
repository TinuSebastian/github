package count;
import java.util.*;

public class pro
{
	int height;
int length;
int breadth;
int volume;


pro()
{
	System.out.println("enter length ");
	System.out.println("enter breadth");
	System.out.println("enter height");
	Scanner s=new Scanner(System.in);
	height=s.nextInt();
	length=s.nextInt();
	breadth=s.nextInt();
	
}
public  int volume1()
{
	volume=length*breadth*height;
	return volume;
}
}
