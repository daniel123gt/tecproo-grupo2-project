import javax.swing.SwingUtilities;

import gui.V1;

public class Main {
	 public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				V1 principal = new V1();
		        principal.setVisible(true);
				
			}
		});
	        
	    }
}
