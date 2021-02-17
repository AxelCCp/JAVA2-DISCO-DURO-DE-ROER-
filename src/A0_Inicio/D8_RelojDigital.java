package A0_Inicio;

import java.time.LocalTime;

import javax.swing.JOptionPane;

public class D8_RelojDigital {
	public static void main(String[]args) {
		
		LocalTime objTime = LocalTime.now();
		
		for(int i=0; ;i++) {
			
			objTime = objTime.now();
			System.out.println(objTime);
			
		}
		
	
		
	}

}
