package library;

public class softwarebooks extends parent
{
String softwareversion;
String softwarename;
public softwarebooks(String authorname, String title, int price, int numberofpages, String softwareversion,
		String softwarename) {
	super(authorname, title, price, numberofpages);
	this.softwareversion = softwareversion;
	this.softwarename = softwarename;
}
void display()
{
	System.out.println("softwareverion"+softwareversion);
	System.out.println("softwarename"+softwarename);
	super.display();
}
}
