package car;

public class SpyCarwithSunRoof 
{

	car1 c=new car1();
	spycar s=new spycar();
	sunroof su=new sunroof();
	
	void carstart()
	{
		c.carstart();
	}
	void carstop()
	{
		c.carstop();
	}
	void shootrocket()
	{
		s.shootrocket();
	}
	void opensunroof()
	{
		su.opensunroof();
	}
	void closesunroof()
	{
		su.closesunroof();
	}

	
}
