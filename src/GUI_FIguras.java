import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_FIguras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Figura objFig = new Figura();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_FIguras frame = new GUI_FIguras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_FIguras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTriangulo = new JLabel("<|");
		lblTriangulo.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblTriangulo.setBounds(37, 49, 52, 43);
		contentPane.add(lblTriangulo);
		
		JLabel lblcirculo = new JLabel("o");
		lblcirculo.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblcirculo.setBounds(175, 49, 35, 43);
		contentPane.add(lblcirculo);
		
		JLabel lblrectangulo = new JLabel("📐");
		lblrectangulo.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblrectangulo.setBounds(296, 49, 52, 43);
		contentPane.add(lblrectangulo);
		
		// Botón para calcular el área del triángulo (implementación pendiente)
		JButton btnArea1 = new JButton("Área");
		btnArea1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Acción para calcular el área del triángulo
			}
		});
		btnArea1.setBounds(24, 139, 85, 21);
		contentPane.add(btnArea1);
		
		// Botón para calcular el área del círculo (implementación pendiente)
		JButton btnArea1_1 = new JButton("Área");
		btnArea1_1.setBounds(154, 139, 85, 21);
		contentPane.add(btnArea1_1);
		
		// Botón para calcular el área del rectángulo
		JButton btnArea1_2 = new JButton("Área");
		btnArea1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// este es un comentario de mi programa para el git 
				try {
					// Captura de datos del usuario
					float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame la base del rectángulo:"));
					float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame la altura del rectángulo:"));
					
					// Cálculo del área usando el objeto Figura
					float area = objFig.calcularAreaRectangulo(base, altura);
					
					// Muestra el área calculada
					JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + area);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Por favor ingresa valores numéricos válidos.");
				}
			}
		});
		btnArea1_2.setBounds(288, 139, 85, 21);
		contentPane.add(btnArea1_2);
	}
}
