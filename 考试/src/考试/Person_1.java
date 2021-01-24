package øº ‘;

public class Person_1
{
	  public static void main(String[] args) {
		  Person aaa=new Person();
		  Student bbbStuden= new Student();
		  aaa.printPerson();
		  bbbStuden.printPerson();
	    new Person().printPerson();
        new Student().printPerson();
	  }
	}

	class Student extends Person {
	  @SuppressWarnings("unused")
	private String getInfo() {
	    return "Student";
	  }
	}

	class Person {
	  private String getInfo() {
	    return "Person";
	  }

	  public void printPerson() {
	    System.out.println(getInfo());
	  }
	}
