package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

import imagefactories.*;

/**
 * Frame usado para seleccionar la apariencia del juego.
 */
public class GraphicSelectorFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Crea un nuevo selector de graficas.
	 */
	public GraphicSelectorFrame() {
		setSize(320, 380);
		getContentPane().setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setVisible(true);
		crearBotones();
		
	}
	
	/**
	 * Crea los botones de este frame.
	 */
	private void crearBotones() {
		Font font = new Font("SansSerif", Font.BOLD, 20);
		
		JButton btnCellColors = new JButton("COLORS");
		JButton btnCellBlack = new JButton("BLACK");
		JButton btnExit = new JButton("EXIT");
		
		btnCellColors.addActionListener(e -> startWithFactory(new ConcreteImageFactory1()));
		btnCellBlack.addActionListener(e -> startWithFactory(new ConcreteImageFactory2()));
		btnExit.addActionListener(e -> exit());
		
		btnCellColors.setFont(font);
		btnCellBlack.setFont(font);
		btnExit.setFont(font);
		
		btnCellColors.setBounds(50, 101, 220, 50);
		btnCellBlack.setBounds(50, 161, 220, 50);
		btnExit.setBounds(50, 271, 220, 50);
		
		getContentPane().add(btnCellColors);
		getContentPane().add(btnCellBlack);
		getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("SELECT GRAPHICS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(10, 11, 300, 40);
		getContentPane().add(lblNewLabel);
		
		
	}
	
	/**
	 * Inicia la gui del juego.
	 * @param imgFact La factory para el juego.
	 */
	protected void startWithFactory(ImageFactory imgFact) {
		int currentScreenWidth = Math.toIntExact(1280);
		int currentScreenHeight = Math.toIntExact(720);
		
		new GUI(imgFact, currentScreenWidth, currentScreenHeight);
	}
	
	/**
	 * Cierra el programa.
	 */
	protected void exit() {
		System.exit(0);
	}
	
}
