package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 648);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPiedraPapelO = new JLabel("PIEDRA, PAPEL O TIJERA by Emmanuel Diaz.");
		lblPiedraPapelO.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedraPapelO.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPiedraPapelO.setBounds(0, 0, 444, 29);
		contentPane.add(lblPiedraPapelO);
		final ImageIcon logo2 = new ImageIcon(getClass().getResource("/recursos/piedra.png"));
		final ImageIcon logo21 = new ImageIcon(getClass().getResource("/recursos/papel.png"));
		final ImageIcon logo211 = new ImageIcon(getClass().getResource("/recursos/tijera.png"));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(10, 206, 424, 209);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResultado.setBounds(10, 0, 404, 29);
		panel.add(lblResultado);

		JLabel lblPiedra_1_3_1 = new JLabel("TU");
		lblPiedra_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPiedra_1_3_1.setBounds(35, 27, 86, 29);
		panel.add(lblPiedra_1_3_1);

		JLabel lblPiedra_1_3_1_1 = new JLabel("CPU");
		lblPiedra_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPiedra_1_3_1_1.setBounds(296, 27, 86, 29);
		panel.add(lblPiedra_1_3_1_1);

		JLabel lblPiedra_1_3_1_1_1 = new JLabel("VRS");
		lblPiedra_1_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPiedra_1_3_1_1_1.setBounds(164, 88, 86, 29);
		panel.add(lblPiedra_1_3_1_1_1);

		JLabel lblOpcionTu = new JLabel("");
		lblOpcionTu.setBackground(Color.LIGHT_GRAY);
		lblOpcionTu.setBounds(30, 60, 102, 97);
		panel.add(lblOpcionTu);

		JLabel lblOpcionCPU = new JLabel("");
		lblOpcionCPU.setBackground(Color.LIGHT_GRAY);
		lblOpcionCPU.setBounds(296, 60, 102, 97);
		panel.add(lblOpcionCPU);

		JLabel lblRespuesta = new JLabel("RESPUESTA");
		lblRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
		lblRespuesta.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRespuesta.setBounds(61, 169, 297, 29);
		panel.add(lblRespuesta);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 26, 424, 167);
		contentPane.add(panel_1);

		JLabel lblCpu = new JLabel("CPU");
		lblCpu.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCpu.setBounds(10, 0, 404, 29);
		panel_1.add(lblCpu);

		JLabel lblPiedra = new JLabel("");
		lblPiedra.setBounds(31, 30, 102, 97);
		panel_1.add(lblPiedra);
		lblPiedra.setBackground(Color.LIGHT_GRAY);
		final ImageIcon icono2 = new ImageIcon(
				logo2.getImage().getScaledInstance(lblPiedra.getWidth(), lblPiedra.getHeight(), Image.SCALE_DEFAULT));
		lblPiedra.setIcon(icono2);

		JLabel lblPiedra_1 = new JLabel("PIEDRA");
		lblPiedra_1.setBounds(41, 138, 86, 29);
		panel_1.add(lblPiedra_1);
		lblPiedra_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblPiedra_1_1 = new JLabel("PAPEL");
		lblPiedra_1_1.setBounds(168, 138, 86, 29);
		panel_1.add(lblPiedra_1_1);
		lblPiedra_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblPapel = new JLabel("");
		lblPapel.setBounds(158, 30, 102, 97);
		panel_1.add(lblPapel);
		final ImageIcon icono21 = new ImageIcon(
				logo21.getImage().getScaledInstance(lblPapel.getWidth(), lblPapel.getHeight(), Image.SCALE_DEFAULT));
		lblPapel.setIcon(icono21);

		JLabel lblTijera = new JLabel("");
		lblTijera.setBounds(288, 30, 102, 97);
		panel_1.add(lblTijera);
		final ImageIcon icono211 = new ImageIcon(
				logo211.getImage().getScaledInstance(lblTijera.getWidth(), lblTijera.getHeight(), Image.SCALE_DEFAULT));
		lblTijera.setIcon(icono211);

		JLabel lblPiedra_1_2 = new JLabel("TIJERA");
		lblPiedra_1_2.setBounds(298, 138, 86, 29);
		panel_1.add(lblPiedra_1_2);
		lblPiedra_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(50, 205, 50));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 426, 424, 169);
		contentPane.add(panel_1_1);

		JLabel lblTu = new JLabel("TU");
		lblTu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTu.setBounds(10, 0, 404, 29);
		panel_1_1.add(lblTu);

		JLabel lblPiedra_2 = new JLabel("");
		lblPiedra_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				final ImageIcon icono22 = new ImageIcon(logo2.getImage().getScaledInstance(lblOpcionTu.getWidth(),
						lblOpcionTu.getHeight(), Image.SCALE_DEFAULT));
				lblOpcionTu.setIcon(icono22);

				int maquina = (int) (Math.random() * 3 + 0);

				if (maquina == 0) {
					final ImageIcon icono0 = new ImageIcon(logo2.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				} else if (maquina == 1) {
					final ImageIcon icono0 = new ImageIcon(logo21.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				} else if (maquina == 2) {
					final ImageIcon icono0 = new ImageIcon(logo211.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				}

				int opcionCPU = maquina;
				int opcionTu = 0;

				if (opcionTu == 0) {
					if (maquina == 0) {
						lblRespuesta.setText("EMPATE");
					} else if (maquina == 1) {
						lblRespuesta.setText("PIERDES");
					} else if (maquina == 2) {
						lblRespuesta.setText("!GANASTE!");
					}
				}

			}
		});
		lblPiedra_2.setBounds(30, 32, 102, 97);
		panel_1_1.add(lblPiedra_2);
		lblPiedra_2.setBackground(Color.LIGHT_GRAY);
		final ImageIcon icono22 = new ImageIcon(logo2.getImage().getScaledInstance(lblPiedra_2.getWidth(),
				lblPiedra_2.getHeight(), Image.SCALE_DEFAULT));
		lblPiedra_2.setIcon(icono22);

		JLabel lblPapel_1 = new JLabel("");
		lblPapel_1.setBounds(157, 32, 102, 97);
		panel_1_1.add(lblPapel_1);
		final ImageIcon icono2111 = new ImageIcon(logo21.getImage().getScaledInstance(lblPapel_1.getWidth(),
				lblPapel_1.getHeight(), Image.SCALE_DEFAULT));
		lblPapel_1.setIcon(icono2111);
		lblPapel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				final ImageIcon icono22 = new ImageIcon(logo21.getImage().getScaledInstance(lblOpcionTu.getWidth(),
						lblOpcionTu.getHeight(), Image.SCALE_DEFAULT));
				lblOpcionTu.setIcon(icono22);

				int maquina = (int) (Math.random() * 3 + 0);

				if (maquina == 0) {
					final ImageIcon icono0 = new ImageIcon(logo2.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				} else if (maquina == 1) {
					final ImageIcon icono0 = new ImageIcon(logo21.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				} else if (maquina == 2) {
					final ImageIcon icono0 = new ImageIcon(logo211.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				}

				int opcionCPU = maquina;
				int opcionTu = 1;

				if (opcionTu == 1) {
					if (maquina == 0) {
						lblRespuesta.setText("!GANASTE!");
					} else if (maquina == 1) {
						lblRespuesta.setText("EMPATE");
					} else if (maquina == 2) {
						lblRespuesta.setText("PIERDES");
					}
				}

			}
		});

		JLabel lblPiedra_1_3 = new JLabel("PIEDRA");
		lblPiedra_1_3.setBounds(40, 140, 86, 29);
		panel_1_1.add(lblPiedra_1_3);
		lblPiedra_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblPiedra_1_1_1 = new JLabel("PAPEL");
		lblPiedra_1_1_1.setBounds(167, 140, 86, 29);
		panel_1_1.add(lblPiedra_1_1_1);
		lblPiedra_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblPiedra_1_2_1 = new JLabel("TIJERA");
		lblPiedra_1_2_1.setBounds(297, 140, 86, 29);
		panel_1_1.add(lblPiedra_1_2_1);
		lblPiedra_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiedra_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblTijera_1 = new JLabel("");
		lblTijera_1.setBounds(287, 32, 102, 97);
		panel_1_1.add(lblTijera_1);
		final ImageIcon icono2112 = new ImageIcon(logo211.getImage().getScaledInstance(lblTijera_1.getWidth(),
				lblTijera_1.getHeight(), Image.SCALE_DEFAULT));
		lblTijera_1.setIcon(icono2112);
		lblTijera_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				final ImageIcon icono22 = new ImageIcon(logo211.getImage().getScaledInstance(lblOpcionTu.getWidth(),
						lblOpcionTu.getHeight(), Image.SCALE_DEFAULT));
				lblOpcionTu.setIcon(icono22);

				int maquina = (int) (Math.random() * 3 + 0);

				if (maquina == 0) {
					final ImageIcon icono0 = new ImageIcon(logo2.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				} else if (maquina == 1) {
					final ImageIcon icono0 = new ImageIcon(logo21.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				} else if (maquina == 2) {
					final ImageIcon icono0 = new ImageIcon(logo211.getImage().getScaledInstance(lblOpcionCPU.getWidth(),
							lblOpcionCPU.getHeight(), Image.SCALE_DEFAULT));
					lblOpcionCPU.setIcon(icono0);

				}

				int opcionCPU = maquina;
				int opcionTu = 2;

				if (opcionTu == 2) {
					if (maquina == 0) {
						lblRespuesta.setText("PIERDES");
					} else if (maquina == 1) {
						lblRespuesta.setText("!GANASTE!");
					} else if (maquina == 2) {
						lblRespuesta.setText("EMPATE");
					}
				}

			}
		});
	}
}
