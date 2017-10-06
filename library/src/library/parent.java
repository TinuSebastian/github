package library;

public class parent 
{String authorname;
String title;
int price;
int numberofpages;
public parent(String authorname, String title, int price, int numberofpages) {
	super();
	this.authorname = authorname;
	this.title = title;
	this.price = price;
	this.numberofpages = numberofpages;
}
void display()
{
	System.out.println("authorname:"+authorname);
	System.out.println("title:"+title);
    System.out.println("price:"+price);
    System.out.println("numberofpages:"+numberofpages);
}

}
