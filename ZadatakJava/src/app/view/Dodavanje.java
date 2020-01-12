package app.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dodavanje extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public Dodavanje() {
		setTitle("Dodavanje entiteta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 465, 300);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Dodaj studenta");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddingDialog nw = new AddingDialog();

				nw.setVisible(true);
				dispose();

			}
		});
		btnNewButton.setBounds(32, 76, 120, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Dodaj predmet");
		btnNewButton_1.setBounds(162, 76, 120, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddingDialogPredmet mw = new AddingDialogPredmet();

				mw.setVisible(true);
				dispose();
			}
		});
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Dodaj profesora");
		btnNewButton_2.setBounds(292, 76, 120, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddingDialogProfesor kw = new AddingDialogProfesor();

				kw.setVisible(true);
				dispose();
			}
		});
		panel.add(btnNewButton_2);
	}
}
