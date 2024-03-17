package timer.telas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
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
	
	private JButton botaoStart = new JButton("Start");
	private JButton botaoStop = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread threadTimer1;
	
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
		bagConstraints.gridwidth = 2;
		bagConstraints.insets = new Insets(5, 10, 5, 5);
		bagConstraints.anchor = bagConstraints.WEST;
		
		descricao.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricao,bagConstraints);
		add(jPanel,BorderLayout.WEST);
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		bagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo,bagConstraints);
		
		descricao2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		jPanel.add(descricao2,bagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2,bagConstraints);
		
		bagConstraints.gridwidth = 1;
		
		botaoStart.setPreferredSize(new Dimension(92, 25));
		bagConstraints.gridy++;
		jPanel.add(botaoStart,bagConstraints);
		
		botaoStop.setPreferredSize(new Dimension(92, 25));
		bagConstraints.gridx++;
		jPanel.add(botaoStop,bagConstraints);
		
		
		botaoStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { /*Executa o clique no botao start*/
				threadTimer1 = new Thread(thread1);
				threadTimer1.start();
			}
		});
		
		botaoStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				threadTimer1.stop();
			}
		});
		
		
		/*Sempre será a útima linha*/
		setVisible(true);
	}
}
