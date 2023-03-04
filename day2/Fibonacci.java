package week1.day2;

public class Fibonacci {
       
	public static void main(String[] args) {
		
			    int n = 14, firstTerm = 0, secondTerm = 1;
		        
			    System.out.println("Fibonacci Series Upto " + n + ": ");
			    
			    while (firstTerm <= n) {
			      System.out.print(firstTerm + ", ");

			      int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;

			    }
		  }
	}

