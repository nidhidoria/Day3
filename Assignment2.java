import java.time.LocalDate;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library l1 = new Library("MJ LIBARAY", 105, "Book");
		System.out.println(l1);
		l1.add();
		System.out.println("************************************************");
		Library l2 = new Library("Vidhyapith", 802, "Book");
		System.out.println(l2);
		l2.add();
		
		System.out.println("************************************************");
		MovingLibrary l3 = new MovingLibrary("Pratham", 309, "Book","MK nagar","Bus");
		System.out.println(l3);
		l3.add();
		l3.move("Juhu");
		
		
		System.out.println("************************************************");
		MovingLibrary l4 = new MovingLibrary("Vishwa", 905, "Music","Belapur","Sims Hospital");
		System.out.println(l4);
		l4.add();
		l4.move("Appolo Hospital");
		
		System.out.println("************************************************");
		ClassroomLibrary l5 = new ClassroomLibrary("Kids Libray", 905, "Book","Dps School","School",9);
		System.out.println(l5);
		l5.add();
		l5.move(5);
		l5.maintain("Kavya");
		
	//	l2.add();
		
	//	Library l1 = new Library(103, "Alchemist", "Poulo coelho", 300, LocalDate.of(2015, 6, 10),"motivational",5);
	//	l1.setLibrary(103, "Alchemist", "Poulo coelho", 300, LocalDate.of(2015, 6, 10),"motivational",5);
		//System.out.println(l1);
		/*	Library l2 = new Library();
		Library l3 = new Library();
		Library l4 = new Library();
		Library l5 = new Library(); */
	/*	l1.addBook(102, "Alchemist", "Poulo coelho", "motivational", 300, LocalDate.of(2015, 6, 10));
		l1.showBook();		
		l1.addBook(105, "2States", "Chetan Bhagat", "LoveStory", 200, LocalDate.of(2016, 07, 9));
		l1.showBook();
		l1.addBook(108, "Power Of Now", "Echart Tolly", "Motivational", 400, LocalDate.of(2013, 8,8));
		l1.showBook();
		l1.addBook(109, "Anviksha", "Jigna Patel", "Fiction", 100, LocalDate.of(2017, 8, 21));
		l1.showBook();
		l1.addBook(111, "Seat Of Soul", "Gary Zukav", "spiritual", 800, LocalDate.of(2000,5,31));
		l1.showBook();*/
	}

}	


 class Library
{
	String libraryName;
	int libraryNo;
	String type;
	
	 Library(String libraryName, int libraryNo, String type) {
		super();
		this.libraryName = libraryName;
		this.libraryNo = libraryNo;
		this.type = type;
		System.out.println("Library Constucter");
	}
	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", libraryNo=" + libraryNo + ",  type="
				+ type + "]";
	}
		void add()
	{
		System.out.println("Adding Book in Library");
	}
}
 
 
 
 class MovingLibrary extends Library
 {
	 String currentLocation;
	 String  place;
	public MovingLibrary(String libraryName, int libraryNo, String type, String location,String Place) {
		super(libraryName, libraryNo, type);
		currentLocation = location;
		place=Place;
	}

@Override
	public String toString() {
		return "MovingLibrary [currentLocation=" + currentLocation + ", place=" + place + ", libraryName=" + libraryName
				+ ", libraryNo=" + libraryNo + ", type=" + type + "]";
	}

	void add() {
		System.out.println("Adding Book in MovingLibrary");
	}


	void move(String l2)
	{
		System.out.println("Moving library is moving to another location at " +l2);
	}
	 
 }
 
 
 
 class ClassroomLibrary extends MovingLibrary
 {
	 int std;
	
	public ClassroomLibrary(String libraryName, int libraryNo, String type, String location, String Place, int std) {
		super(libraryName, libraryNo, type, location, Place);
		this.std = std;
	}

	@Override
	public String toString() {
		return "ClassroomLibrary [std=" + std + ", currentLocation=" + currentLocation + ", place=" + place
				+ ", libraryName=" + libraryName + ", libraryNo=" + libraryNo + ", type=" + type + "]";
	}

	void add() {
		System.out.println("Adding Book in ClassroomLibrary");
	}

	void move(int s1)
	{
		System.out.println("Classroom library is moving to another Standard " +s1);
	}
	
	void maintain(String studentName)
	{
		System.out.println("Classroom library is maintained by " +studentName);
	}
 }
 
 
 

	




