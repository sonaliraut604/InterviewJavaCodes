
public class MergeTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String s1 = "100,000";
        String s2 = "200,000";
        
        s1=s1.replaceAll(",", "");
        s2=s2.replaceAll(",", "");
        
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        
        
        
        
        
//       int num1=Integer.parseInt(s1.replaceAll(",", ""));
//       int num2=Integer.parseInt(s2.replaceAll(",", ""));
//       
    
       
       int sum=num1+num2;
       
       System.out.println(sum);
      
        
	}

}
