package library;

public class hardwarebooks 
{
String hardwarecategory;
String publisher;
parent p;

public hardwarebooks(String authorname, String title, int price, int numberofpages, String hardwarecategory,
		String publisher) {
	//super(authorname, title, price, numberofpages);
	this.hardwarecategory = hardwarecategory;
	this.publisher = publisher;
}
/*void display()
{
	System.out.println("hardwarecategory"+hardwarecategory);
	System.out.println("publisher"+publisher);
    // super.display();
}*/
}