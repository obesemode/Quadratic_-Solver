package fl.ed.suncoast.sy22.jdbp.p5;
import java.util.Scanner;
public class Project101_Linear_Solver {

	public static void main(String[] args) {
		
		//  A linear equation is one that can take the form ax+b=0
		// In this assignment, you will get two variables, a and b
		// as user input, then use that to solve for x
		
		
		//1) Get two variables, a and b, as user input
		
		Scanner sc  = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		
		
		
		//Some Objects, called Closeables, cannot be automatically 
		// deleted by Java during runtime and so must be closed manually
		//sc.close();
		//2) Solve for x by calling linearSolver()
		
		
		
		
		//3) Print x as output
		System .out.println(linearSolver(a,b));
		sc.close();
	}
	

	
	
	
// This function returns x given 'a' and 'b', where ax+b=0
	public static double linearSolver(double a, double b) {
		return  -b/a;
	}
}

