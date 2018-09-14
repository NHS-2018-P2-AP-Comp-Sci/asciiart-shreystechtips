/*
 * Purpose of Program:
 * ASCII Art for Microsoft Logo
 * I know this is a bit advanced (with constructors and for loops),
 * but this is what made my job easy and fun.
 * Hope you enjoy it
 * 
 */

public class ASCIIArt {
	public static void main(String[] args) {
		box(2,1);
		System.out.println();
		System.out.println();
		box(2,2);
		System.out.println("\n");
		m();
		i();
		c();	
		r();
	    o();
	    s();
	    o();
	    f();
	    t();
	}
	/*Prints the Boxes for the traditional Microsoft Logo
	 * Based on coloring patterns in the Logo
	 */
	public static void box(int amt, int num) {
		for (int i = 1;i<=amt;i++) {
			if((i==1&&num==1)||(i==2&&num==2)) {
				System.out.print("|=======|  ");
			}
			else {
				System.out.print("|=======|  ");
			}			
		}
		System.out.println();
		for (int i=1; i<=2;i++) {
		for (int j = 1;j<=amt;j++) {
			if ((j==1&&num==1)||(j==2&&num==2)) {
				System.out.print("|\\\\\\\\\\\\\\|  ");	
			}
			else {
				System.out.print("|///////|  ");	
			}
		}
		System.out.println();
		}
		for (int j = 1;j<=amt;j++) {
			if ((j==1&&num==1)||(j==2&&num==2)) {
				System.out.print("|=======|  ");		
			}
			else {
				System.out.print("|=======|  ");	
			}					
		}	
	}
	public static void m(){
      System.out.println("||\\\\   //||");
      System.out.println("|| \\\\ // ||");
      System.out.println("||   \\/  ||");
      for (int i=1;i<=4;i++) {
    	  mStruct(); 
      }
      System.out.println();
      System.out.println();
    }
    public static void mStruct(){
      System.out.println("||       ||");
    } 
    // Prints the letter I
    public static void i(){
	  iTop();
	    for (int i =1; i<=5;i++){
	      iStruct();
	    }
	  iTop();
	    System.out.println();
	  }
	  public static void iTop(){
	    System.out.println("==========");
	  }
	  public static void iStruct(){
	    System.out.println("    ||");
	  }
	  //Prints the Letter S
	  public static void s(){
	      sTop();
	      sStructBig();
	      System.out.println("\\\\");
	      sTop();
	      System.out.println("      \\\\");
	      sStructBig();
	      sTop();
	      System.out.println();
	      System.out.println();
        }
    public static void sTop(){
      System.out.println("  =====");
    }
    public static void sStructBig(){
      System.out.println("||     ||");
    }
    // Prints the Letter C
    public static void c() {
    	cTop();
    	System.out.println(" //");
    	for(int i =1; i<=3;i++) {
    		cBody();
    	}
    	System.out.println(" \\\\");
    	cTop();
    	System.out.println();
    }
    public static void cTop() {
    	System.out.println("   ======");
    }
    public static void cBody() {
    	System.out.println("||");
    }
    //Prints the letter R
    public static void r() {
    	rStraight();
    	rTopBody();
    	rStraight();
    	rBottomBody();
    	System.out.println();
    }
    public static void rStraight() {
    	System.out.println("======");
    }
    public static void rTopBody() {
      	System.out.println("||    \\\\");
      	System.out.println("||    //");
    	
    }
    public static void rBottomBody() {
    	for (int i=1;i<=3;i++) {
    		System.out.print("||  ");
    		for (int j=1;j<=i;j++) {
    			System.out.print(" ");
    		}
    		System.out.println("\\\\");
    	}
    }
    // Prints the letter O
    public static void o() {
    	oTop();
    	System.out.println(" //    \\\\");
    	for(int i=1;i<=3;i++) {
    		oBody();
    	}
    	System.out.println(" \\\\    //");
    	oTop();
    	System.out.println();
    }
    public static void oTop() {
    	System.out.println("   ====  ");
    }
    public static void oBody() {
    	System.out.println("||     ||");
    }
    //Prints the letter F
    public static void f() {
    	System.out.println("=========");
    	for(int i=1;i<=2;i++) {
    		fBody();
    	}
    	System.out.println("======");
    	for(int i=1;i<=3;i++) {
    		fBody();
    	}
    	System.out.println();
    }
    public static void fBody() {
    	System.out.println("||");
    }
  //Prints the letter T
    public static void t() {
    	System.out.println("=========");
    	for(int i=1;i<=6;i++) {
    		tBody();
    	}
    }
    public static void tBody() {
    	System.out.println("   ||");
    }
 }
