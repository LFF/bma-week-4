
public class Test {

	/**
	 * 	 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		
		if( args.length == 0 ) {
			System.out.println("Please enter an action");
			return;
		}

		String action = args[0];
		
		
		String [] values = new String[0];
		
		
		
		if ( args.length > 1)   {
			
			values = new String[args.length-1];
			
			
			for ( int i =1 ; i<args.length; i++)  {
				
				values[i-1] = args[i];
				
			}
			
			
			
		}
			
			
		
		

		if (action.equals("for-each"))	 {
		
		
			    testForEach(values);
		
		
	}  else
	
	
	  if  (action.equals("for"))  {
	
			
			
		        testFor(values);
		        
		        
	  }  else
		
	  
	  if (action.equals("while"))  {
		        
		        testWhile(values);		
			
				
		}
	  
	  else   {
		  
		  System.out.println(action + "not found");
		  
	  }
		
	  

	
	}
	
	
	
	
	  static void testForEach(String[] values) {
		 
			System.out.println( "Testing for each " );
						
			for(String value :  values ) {
				
				System.out.println(value);
				
			}
			
			
			
		 
	 }
	 

	  static void testFor(String[] values) { 
		 
		 System.out.println( "Testing For"  );
		 
		 for(int i = 0; i< values.length; i++ ) {
				
				System.out.println(values[i]);
				
			}
			
		 
		 
		 
		 
		 
	 }
	 

	  static void testWhile(String[] values) {
		 
		 System.out.println( "Testing for While" );
			
		  
		 int i = 0;
		 
		 while ( i < values.length)  {
			 
			 System.out.println(values[i]);
			 
			 i++;
		 }
		 		 
		 
		 
	 }
	 


}
