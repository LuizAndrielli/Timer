package timer.telas;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimer extends JDialog{
	
	
	public TelaTimer() {
		
		/*Configurações iniciais*/
		setTitle("Timer com Thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
		/*Sempre será a útima linha*/
		setVisible(true);
	}
}
