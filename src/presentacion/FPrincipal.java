package presentacion;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Parcial;

public class FPrincipal extends JFrame implements ActionListener{
	private JLabel lA;
	private JLabel lB;
	private JLabel lC;
	private JLabel lResultado;
	private JTextField tA;
	private JTextField tB;
	private JTextField tC;
	private JButton bCalcular;
	private Parcial parcial;
	
	public FPrincipal() {
		this.parcial = new Parcial();
		this.setLayout(new GridLayout(4, 2, 10, 10));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Examen");
		this.setBounds((int)pantalla.getWidth()/2 - 175, (int)pantalla.getHeight()/2 - 110, 350, 220);

		this.lA = new JLabel("a:");
		this.lA.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lA);
		this.tA = new JTextField();
		this.add(this.tA);

		this.lB = new JLabel("b:");
		this.lB.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lB);
		this.tB = new JTextField();
		this.add(this.tB);

		this.lC = new JLabel("c:");
		this.lC.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lC);
		this.tC = new JTextField();
		this.add(this.tC);

		this.bCalcular = new JButton("Calcular");
		this.add(this.bCalcular);
		this.bCalcular.addActionListener(this);

		this.lResultado = new JLabel("");
		this.add(this.lResultado);

		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int a = Integer.parseInt(this.tA.getText());
			int b = Integer.parseInt(this.tB.getText());
			int c = Integer.parseInt(this.tC.getText());
			String res = this.parcial.raices(a, b, c);
			this.lResultado.setText(res);
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(this, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}

