package StringPrograms;

public class Pgm {
		
		public static void table(int r,int c) {
			System.out.println("<table>"); 
			for(int j=0;j<r;j++) {
				System.out.println("<tr>");
				  for(int i=0;i<c;i++) {
					  System.out.println("<td> \t </td>");
				  }
				  System.out.println("</tr>");
			}
			
				  System.out.println("</table>");
			}
		

		public static void main(String[] args) {
		
			table(2, 2);
			
	         
			
		}

	}


