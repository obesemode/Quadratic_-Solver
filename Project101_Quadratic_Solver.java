
package fl.ed.suncoast.sy22.jdbp.p5;
import java.util.Scanner;

public class Project101_Quadratic_Solver {

	public static void main(String[] args) {
		
	//A quadratic equation takes the form of ax^2+bx+c=0
		//It has two roots, and this program will find both of them
		
	/*
	 if (a==0) Project101_Java_Review.linearSolver(1,2);
		else {
			
		}
		
	 */
		
			
		
	
		
		//1) Get three variables from user input using the Scanner
		Scanner var = new Scanner(System.in);
		
		System.out.println("A:");
		double a= var.nextDouble();
		System.out.println("B:");
		double b= var.nextDouble();
		System.out.println("C:");
		double c= var.nextDouble();
		
		
		
		
		
		
		var.close();
		//2) Calculate the roots
		
		
		  if (a==0) System.out.println(Project101_Linear_Solver.linearSolver(b,c));
		  else {
			  
		 
		
				
		double[] roots  = quadraticSolver(a,b,c);
		//3) Print the roots one at a time as output
	
		for(int i =0; i < roots.length;i++) 
			System.out.println(roots[i]);
	
		  }	
	}
	
	
	//This function will return both roots of a quadratic equation
	
	
	
	/*
	
	public static double[] quadraticSolver(double a,double b, double c) {
		double[] nm = new double[] {};
		
		double d = Math.sqrt((b*b)-(4*a*c));
		double rootone;
		double roottwo;
		//((b*b)-(4*a*c))
			//Depending on what d=b*b-4*a*c is:
		if(d>0) {
			rootone=(-b+d/(2*a));
			roottwo = (-b-d/(2*a));
		
		}

return nm;	
		*/
	public static double[] quadraticSolver(double a,double b, double c) {
		
			double d = Math.sqrt((b*b)-(4*a*c));
				
				
				double[] root = new double[] {((-b+d)/(2*a)),((-b-d)/(2*a))};
				
				//((b*b)-(4*a*c))
					//Depending on what d=b*b-4*a*c is:
				if(d<0) {
					double[] nmgh  = new double[] {Double.NaN,Double.NaN};
					return nmgh;
					
				}
				else if(d==0) {
					
				double[] jk = new double[] {(-b/(2*a))};
				return jk;
				}
				else {
					return root;
					
				}

			
			
			}

	
}


