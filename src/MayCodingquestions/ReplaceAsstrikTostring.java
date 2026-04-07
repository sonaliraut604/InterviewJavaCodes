package MayCodingquestions;

public class ReplaceAsstrikTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


	 
	        String name = "sonaliraut567jk*%$#^&";
	        String replaced = name.replaceAll("\\d", "*");
	        System.out.println("Original: " + name);
	        System.out.println("Modified: " + replaced);
	        
	        
	        String name1 = "sonaliraut567";
	        String replaced1 = name1.replaceAll(".", "*");
	        System.out.println("Original: " + name1);
	        System.out.println("Modified: " + replaced1);
	        
	        String name2 = "sonaliraut567jk";
	        String replaced2 = name2.replaceAll("[a-zA-Z]","*");
	        System.out.println("Original: " + name2);
	        System.out.println("Modified: " + replaced2);
	        
	        String name3 = "sonaliraut567jk";
	        String replaced3 = name3.replaceAll("[0-9]","*");
	        System.out.println("Original: " + name3);
	        System.out.println("Modified: " + replaced3);
	        
	        String name4 = "sonali&^%raut567jk&^%$#^&";
	        String replaced4 = name4.replaceAll("[^a-zA-Z0-9]","*");
	        System.out.println("Original: " + name4);
	        System.out.println("Modified: " + replaced4);
	    }
	}

	


