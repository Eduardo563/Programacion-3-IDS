package aplication;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class RecuperarCuenta extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public RecuperarCuenta() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recuperar Cuenta");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel.setBounds(203, 44, 172, 34);
		add(lblNewLabel);

	}

}
