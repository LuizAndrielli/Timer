package timer.telas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimer extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricao = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricao2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	
	public TelaTimer() {
		
		/*Configurações iniciais*/
		setTitle("Timer com Thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		/*Controlador de posicionamento de Componentes*/
		GridBagConstraints bagConstraints = new GridBagConstraints();
		bagConstraints.gridx = 0;
		bagConstraints.gridy = 0;
		
		descricao.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricao,bagConstraints);
		add(jPanel,BorderLayout.WEST);
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		bagConstraints.gridy++;
		jPanel.add(mostraTempo,bagConstraints);
		
		descricao2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		jPanel.add(descricao2,bagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		jPanel.add(mostraTempo2,bagConstraints);
		
		
		
		
		
		/*Sempre será a útima linha*/
		setVisible(true);
	}
}
