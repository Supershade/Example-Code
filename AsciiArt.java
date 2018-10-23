public class AsciiArt {  
	
    public static void main(String[] args) {    

    	wholeBody();

    }  
    
    //This method is used to draw the whole thing
    
    public static void wholeBody() {
    	
    	drawHair();
    	drawHead();
    	drawBody();
    	drawLeg();
    	drawShoe();
    	
    }

    //This method is used to create the hair  

    public static void drawHair() {  

        space(16); 
        System.out.print("\\|/");  

    }  

    //These are all the methods for the head   

    public static void headRow1() {  

        nextLine();  
        space(16); 
        System.out.print("/"); 
        space(0);
        System.out.print("\\");

    }  

    public static void headRow2() {  

        nextLine();  
        space(15);  
        System.out.print("/");  
        space(2);
        System.out.print("\\");

    }  

    public static void headRow3() {  

        nextLine();  
        space(14); 
        System.out.print("/");  
        space(4);  
        System.out.print("\\");  

    }  

    public static void headRow4() {  

        nextLine();  
        space(13); 
        System.out.print("/");  
        udrScr(1);  
        space(2);  
        udrScr(1);  
        System.out.print("\\");  

    }  

    public static void headRow5() {  

        nextLine();  
        space(12); 
        System.out.print("/");  
        space(1);  
        System.out.print("0");  
        space(2);  
        System.out.print("0");  
        space(1);  
        System.out.print("\\");  

    }  

    public static void headRow6() {  

        nextLine();  
        space(11); 
        System.out.print("/");  
        space(10); 
        System.out.print("\\");  

    }  

    public static void headRow7() {  

        nextLine();  
        space(10);  
        System.out.print("/");  
        space(12);  
        System.out.print("\\");  

    }  

    public static void headRow8() {  

        nextLine();  
        space(10);  
        System.out.print("\\");  
        space(12);  
        System.out.print("/");  

    }  

    public static void headRow9() {  

        nextLine();  
        space(11); 
        System.out.print("\\");  
        space(1); 
        System.out.print("|");  
        udrScr(4);
        System.out.print("|");
        space(1); 
        System.out.print("/");  

    }  

    public static void headRow10() {  

        nextLine();  
        space(12); 
        System.out.print("\\");  
        space(8); 
        System.out.print("/");  

    }  

    public static void headRow11() {  
    	
        nextLine();  
        space(13); 
        System.out.print("\\");  
        space(6);  
        System.out.print("/");  

    }  

    public static void headRow12() {  

        nextLine();  
        space(3);  
        udrScr(10); 
        System.out.print("\\");  
        space(4);  
        System.out.print("/");  
        udrScr(10);  

    }  

    public static void headRow13() {  
    	
        nextLine();  
        space(3);  
        System.out.print("|");  
        space(3); 
        System.out.print("|");
        space(5);
        System.out.print("\\");
        space(2); 
        System.out.print("/"); 
        space(6); 
        System.out.print("|");  
        space(3); 
        System.out.print("|");  

    }  

    public static void headRow14() {  

        nextLine(); 
        space(3);
        System.out.print("|");  
        space(3); 
        System.out.print("|");  
        space(6); 
        System.out.print("\\_/");  
        space(7); 
        System.out.print("|");  
        space(3); 
        System.out.print("|");  

    }  

    public static void drawHead() {  

        headRow1();  
        headRow2();  
        headRow3();  
        headRow4();  
        headRow5();  
        headRow6();  
        headRow7();  
        headRow8();  
        headRow9();  
        headRow10();  
        headRow11();  
        headRow12();  
        headRow13();  
        headRow14();  

    }  
    
    //These are all body methods  

    public static void bodyRow0() {  

        nextLine();  
        space(8); 
        System.out.print("|");  
        space(17);  
        System.out.print("|");  

    }  

    public static void bodyRow1() {  

        nextLine();  
        space(3);  
        System.out.print("|"); 
        space(3); 
        System.out.print("|");  
        space(17);  
        System.out.print("|");  
        space(3); 
        System.out.print("|");  

    }  

    public static void bodyRow2() {  
    	
        nextLine();  
        space(3);  
        System.out.print("|");  
        space(3); 
        System.out.print("|");  
        space(17);  
        System.out.print("|");  
        space(3); 
        System.out.print("|");  

    }  

    public static void bodyRow3() {  

        nextLine();  
        space(3);  
        System.out.print("|");
        space(3);
        System.out.print("|");
        space(17); 
        System.out.print("|");  
        space(3); 
        System.out.print("|");  

    }  

    public static void bodyRow4() {  

        nextLine();  
        space(3);  
        System.out.print("\\");
        udrScr(3);        
        System.out.print("|"); 
        space(17);  
        System.out.print("|");  
        udrScr(3);
        System.out.print("/");  

    }  

    public static void bodyRow5() {  

        nextLine();  
        space(8); 
        System.out.print("|");  
        udrScr(17);
        System.out.print("|");

    }  

    public static void drawBody() {  

        bodyRow1();  
        bodyRow2();  
        bodyRow3();  
        bodyRow4(); 
        
        for(int ii = 0; ii<=5; ii++) {
        	
        	bodyRow0();
        	
        }
        
        bodyRow5(); 

    }  

    // These are all leg methods  

    public static void legRow() {  

        nextLine();  
        space(8);  
        System.out.print("|"); 
        space(5);
        System.out.print("|");
        space(2);  
        System.out.print("|");  
        space(6); 
        System.out.print("|"); 

    }  

    public static void lastLegRow() {  

        nextLine();  

        space(8); 

        System.out.print("|");
        udrScr(5);
        System.out.print("|");
        space(2);  
        System.out.print("|");  
        udrScr(6);
        System.out.print("|");

    }  

    public static void drawLeg() {  

    	for(int ii = 0; ii <= 7; ii++) {
    		
    		legRow();
    		
    	}
    	
        lastLegRow();  

    }  

    //These methods draw the shoe  

    public static void topOfShoe() {  

        nextLine();  
        space(3);  
        udrScr(4);
        System.out.print("|");  
        space(5);  
        System.out.print("|");  
        space(2);  
        System.out.print("|");  
        space(6);  
        System.out.print("|");  
        udrScr(4);

    }  

    public static void shoeSole() {  

        nextLine();  
        space(2);  
        System.out.print("(");
        udrScr(11);
        System.out.print("|");
        space(2);  
        System.out.print("|"); 
        udrScr(12);
        System.out.print(")");
        nextLine();
        nextLine();

    }  

    public static void drawShoe() {  

        topOfShoe();  
        shoeSole();  

    }  

    //These are all common methods.   

    public static void space(int numSpaces) {    

        for(int ii = 0; ii <= numSpaces; ii++) {  

            System.out.print(" ");  

        }  

    } 
    
    public static void udrScr(int numUdrScr) {
    	
    	for(int ii = 0; ii <= numUdrScr; ii++) {
    		
    		System.out.print('_');
    		
    	}
    	
    }

    public static void nextLine() {    
    	    	
        System.out.println();    
        
    }    

} 