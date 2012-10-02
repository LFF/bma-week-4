
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		

		if (args.length == 0)  {
			
			
			System.out.println("no arguments found enter some");
		
		}
		
		
		else {
			
			String action;
			
			action = args[0];
			
			if ( action.equals("for-each"))
				
				{ 
				

				System.out.println(action + " action");
				
				
				}
					
					else 
				
						if   ( action.equals("for"))
							
						{ 
							
							
							System.out.println(action + " action");
								
							
						}
							
											
							else
								
								if  (action.equals("while" ))
									
								{ 
																		
									System.out.println(action + " action");
									
																		
								}
			
								else
									
								{ 
									
									System.out.println( " No  match found for " + action );
									
																		
								}
			
									
			
			
				
		}

	}

}
