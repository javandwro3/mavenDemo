package pl.jwrabel.trainings.mavenDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by jakubwrabel on 13/05/2017.
 */
public class SimpleWindow extends JFrame {
	public SimpleWindow() {
		this.setVisible(true);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		JTextField textFieldX = new JTextField();
		textFieldX.setPreferredSize(new Dimension(100,50));
		add(textFieldX);

		JTextField textFieldY = new JTextField();
		textFieldY.setPreferredSize(new Dimension(100,50));
		add(textFieldY);

		JButton button = new JButton("Dodaj");
		add(button);

		JTextField textFieldResult = new JTextField();
		textFieldResult.setPreferredSize(new Dimension(100,50));
		add(textFieldResult);

		button.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(textFieldX.getText());
				double y = Double.parseDouble(textFieldY.getText());

				double sum = BusinessLogic.add(x, y);

				textFieldResult.setText("" + sum);
			}
		});

		repaint();
	}

	public static void main(String[] args) {
		new SimpleWindow();
	}
}
