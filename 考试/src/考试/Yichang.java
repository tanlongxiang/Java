package 考试;

public class Yichang {
	  public static void main(String[] args) {
	    try {
	      String s = "5.6";
	      Integer.parseInt(s); // 引起一个 NumberFormatException异常

	      int i = 0;
	      @SuppressWarnings("unused")
		int y = 2 / i;
	    }
	    catch (Exception ex) {
	      System.out.println("NumberFormatException");
	    }
//	    catch (RuntimeException ex) {
//	      System.out.println("RuntimeException");
//	    }
	  }
	}
