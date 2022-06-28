package projetoMaillard;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;

public class telaInicial {

	private JFrame frame;
	private JTextField textCodigoDeRastreio;
	private JTextField TextNome;
	private JTextField TextEndereco;
	private JTextField TextCodigoDeDesconto;
	private JTextField TextObservacoes;
	private JComboBox comboBoxAdicionar;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial window = new telaInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 382, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Maillard");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
		lblNewLabel.setBounds(136, 11, 116, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JButton BotaoAcompanharPedido = new JButton("Acompanhar pedido");
		BotaoAcompanharPedido.setBounds(206, 69, 150, 23);
		frame.getContentPane().add(BotaoAcompanharPedido);
		
		textCodigoDeRastreio = new JTextField();
		textCodigoDeRastreio.setBounds(67, 70, 129, 20);
		frame.getContentPane().add(textCodigoDeRastreio);
		textCodigoDeRastreio.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setBounds(10, 73, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setBounds(10, 111, 37, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		TextNome = new JTextField();
		TextNome.setBounds(67, 108, 129, 20);
		frame.getContentPane().add(TextNome);
		TextNome.setColumns(10);
		
		TextEndereco = new JTextField();
		TextEndereco.setBounds(67, 138, 129, 20);
		frame.getContentPane().add(TextEndereco);
		TextEndereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Endere\u00E7o:");
		lblNewLabel_3.setBounds(10, 141, 69, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton BotaoNovoPedido = new JButton("Novo pedido");
		BotaoNovoPedido.setBounds(206, 111, 150, 47);
		frame.getContentPane().add(BotaoNovoPedido);
		
		JLabel lblNewLabel_4 = new JLabel("Meu pedido:");
		lblNewLabel_4.setBounds(206, 177, 69, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total:");
		lblNewLabel_5.setBounds(206, 440, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		comboBoxAdicionar = new JComboBox();
		comboBoxAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBoxAdicionar.setModel(new DefaultComboBoxModel(new String[] {"Sanduiche", "Acompanhamento", "Bebida"}));
		comboBoxAdicionar.setToolTipText("");
		comboBoxAdicionar.setBounds(67, 174, 129, 22);
		frame.getContentPane().add(comboBoxAdicionar);
		
		lblNewLabel_6 = new JLabel("Adicionar:");
		lblNewLabel_6.setBounds(10, 178, 69, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton BotaoConfirmarItem = new JButton("Confirmar");
		BotaoConfirmarItem.setBounds(31, 491, 132, 23);
		frame.getContentPane().add(BotaoConfirmarItem);
		
		JButton BotaoLimparPedido = new JButton("Limpar");
		BotaoLimparPedido.setBounds(279, 173, 77, 23);
		frame.getContentPane().add(BotaoLimparPedido);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(201, 165, 10, 349);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.BLACK);
		separator_1.setToolTipText("");
		separator_1.setBounds(10, 100, 346, 9);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_7 = new JLabel("C\u00F3digo:");
		lblNewLabel_7.setBounds(206, 465, 54, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		TextCodigoDeDesconto = new JTextField();
		TextCodigoDeDesconto.setBounds(249, 462, 107, 20);
		frame.getContentPane().add(TextCodigoDeDesconto);
		TextCodigoDeDesconto.setColumns(10);
		
		JButton BotaoAplicarDesconto = new JButton("Aplicar desconto");
		BotaoAplicarDesconto.setBounds(206, 491, 147, 23);
		frame.getContentPane().add(BotaoAplicarDesconto);
		
		JLabel lblNewLabel_8 = new JLabel("Pre\u00E7o:");
		lblNewLabel_8.setBounds(10, 476, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel LabelPrecoDoProduto = new JLabel("0.00");
		LabelPrecoDoProduto.setBounds(79, 476, 56, 14);
		frame.getContentPane().add(LabelPrecoDoProduto);
		
		JLabel LabelValorTotal = new JLabel("0.00");
		LabelValorTotal.setBounds(268, 440, 46, 14);
		frame.getContentPane().add(LabelValorTotal);
		
		JLabel LabelObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		LabelObservacoes.setBounds(10, 409, 86, 14);
		frame.getContentPane().add(LabelObservacoes);
		
		TextObservacoes = new JTextField();
		TextObservacoes.setBounds(10, 426, 186, 47);
		frame.getContentPane().add(TextObservacoes);
		TextObservacoes.setColumns(10);
		
		Panel panel = new Panel();
		panel.setBounds(10, 225, 186, 178);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JButton BotaoIr = new JButton("Ir");
		
		BotaoIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double precoProduto = 0;
				
				LabelPrecoDoProduto.setText("" + precoProduto);
				panel.removeAll();
				panel.setVisible(false);
				
				
				
				if(comboBoxAdicionar.getSelectedItem().equals("Sanduiche")) {
					
					panel.setVisible(true);
					JLabel LabelSanduicheCarne = new JLabel("Carne:");
					LabelSanduicheCarne.setBounds(0, 11, 46, 14);
					panel.add(LabelSanduicheCarne);
					
					JComboBox comboBoxSanduicheCarne = new JComboBox();
					comboBoxSanduicheCarne.setBounds(56, 7, 130, 22);
					panel.add(comboBoxSanduicheCarne);
					comboBoxSanduicheCarne.setModel(new DefaultComboBoxModel(new String[] {"Smash(80g)", "Alto(160g)", "Smash duplo", "Vegetariano"}));
				
					JLabel LabelSanduicheQueijo = new JLabel("Queijo:");
					LabelSanduicheQueijo.setBounds(0, 36, 46, 14);
					panel.add(LabelSanduicheQueijo);
					
					JComboBox comboBoxSanduicheQueijo = new JComboBox();
					comboBoxSanduicheQueijo.setBounds(56, 32, 129, 22);
					panel.add(comboBoxSanduicheQueijo);
					comboBoxSanduicheQueijo.setModel(new DefaultComboBoxModel(new String[] {"Cheddar americano", "Cheddar ingl\u00EAs", "Mussarela", "Brie", "Cream cheese", "Nenhum"}));
					
					JLabel LabelSanduichePao = new JLabel("P\u00E3o:");
					LabelSanduichePao.setBounds(0, 61, 46, 14);
					panel.add(LabelSanduichePao);
					
					JComboBox comboBoxSanduichePao = new JComboBox();
					comboBoxSanduichePao.setBounds(56, 57, 129, 22);
					panel.add(comboBoxSanduichePao);
					comboBoxSanduichePao.setModel(new DefaultComboBoxModel(new String[] {"Brioche", "Tradicional", "Franc\u00EAs"}));
					
					JLabel LabelSanduicheTopping = new JLabel("Toppings:");
					LabelSanduicheTopping.setBounds(0, 111, 56, 14);
					panel.add(LabelSanduicheTopping);
					
					JComboBox comboBoxSanduicheTopping1 = new JComboBox();
					comboBoxSanduicheTopping1.setBounds(57, 82, 129, 22);
					panel.add(comboBoxSanduicheTopping1);
					comboBoxSanduicheTopping1.setModel(new DefaultComboBoxModel(new String[] {"Nenhum", "Salada", "Bacon", "Onion rings", "Picles", "Cebola roxa"}));
					
					JComboBox comboBoxSanduicheTopping2 = new JComboBox();
					comboBoxSanduicheTopping2.setBounds(56, 107, 129, 22);
					panel.add(comboBoxSanduicheTopping2);
					comboBoxSanduicheTopping2.setModel(new DefaultComboBoxModel(new String[] {"Nenhum", "Salada", "Bacon", "Onion rings", "Picles", "Cebola roxa"}));
					
					JComboBox comboBoxSanduicheTopping3 = new JComboBox();
					comboBoxSanduicheTopping3.setBounds(56, 132, 129, 22);
					panel.add(comboBoxSanduicheTopping3);
					comboBoxSanduicheTopping3.setModel(new DefaultComboBoxModel(new String[] {"Nenhum", "Salada", "Bacon", "Onion rings", "Picles", "Cebola roxa"}));
					
					JLabel LabelSanduicheMolho = new JLabel("Molho:");
					LabelSanduicheMolho.setBounds(0, 161, 46, 14);
					panel.add(LabelSanduicheMolho);
					
					JComboBox comboBoxSanduicheMolho = new JComboBox();
					comboBoxSanduicheMolho.setBounds(56, 157, 130, 22);
					panel.add(comboBoxSanduicheMolho);
					comboBoxSanduicheMolho.setModel(new DefaultComboBoxModel(new String[] {"Nenhum", "Barbecue", "Maionese de alho", "Maionese verde", "Maionese trufada"}));
					
					comboBoxSanduicheCarne.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxSanduicheCarne.getSelectedItem().equals("Smash(80g)")) {
								novoPreco = 7;
							}
							if(comboBoxSanduicheCarne.getSelectedItem().equals("Alto(160g)")) {
								novoPreco = 12;
							}
							if(comboBoxSanduicheCarne.getSelectedItem().equals("Smash duplo")) {
								novoPreco = 14;
							}
							if(comboBoxSanduicheCarne.getSelectedItem().equals("Vegetariano")) {
								novoPreco = 9;
							}
							
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					comboBoxSanduicheQueijo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxSanduicheQueijo.getSelectedItem().equals("Cheddar americano")) {
								novoPreco = 1.5;
							}
							if(comboBoxSanduicheQueijo.getSelectedItem().equals("Cheddar inglês")) {
								novoPreco = 2.5;
							}
							if(comboBoxSanduicheQueijo.getSelectedItem().equals("Mussarela")) {
								novoPreco = 1;
							}
							if(comboBoxSanduicheQueijo.getSelectedItem().equals("Brie")) {
								novoPreco = 2;
							}
							if(comboBoxSanduicheQueijo.getSelectedItem().equals("Cream cheese")) {
								novoPreco = 2;
							}
							if(comboBoxSanduicheQueijo.getSelectedItem().equals("Nenhum")) {
								novoPreco = 0;
							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					comboBoxSanduichePao.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxSanduichePao.getSelectedItem().equals("Brioche")) {
								novoPreco = 5;
							}
							if(comboBoxSanduichePao.getSelectedItem().equals("Tradicional")) {
								novoPreco = 3.5;
							}
							if(comboBoxSanduichePao.getSelectedItem().equals("Francês")) {
								novoPreco = 4;

							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					comboBoxSanduicheTopping1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxSanduicheTopping1.getSelectedItem().equals("Nenhum")) {
								novoPreco = 0;
							}
							if(comboBoxSanduicheTopping1.getSelectedItem().equals("Salada")) {
								novoPreco = 2;
							}
							if(comboBoxSanduicheTopping1.getSelectedItem().equals("Bacon")) {
								novoPreco = 4;
							}
							if(comboBoxSanduicheTopping1.getSelectedItem().equals("Onion rings")) {
								novoPreco = 5;
							}
							if(comboBoxSanduicheTopping1.getSelectedItem().equals("Picles")) {
								novoPreco = 2.5;
							}
							if(comboBoxSanduicheTopping1.getSelectedItem().equals("Cebola roxa")) {
								novoPreco = 2;
							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					comboBoxSanduicheTopping2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxSanduicheTopping2.getSelectedItem().equals("Nenhum")) {
								novoPreco = 0;
							}
							if(comboBoxSanduicheTopping2.getSelectedItem().equals("Salada")) {
								novoPreco = 2;
							}
							if(comboBoxSanduicheTopping2.getSelectedItem().equals("Bacon")) {
								novoPreco = 4;
							}
							if(comboBoxSanduicheTopping2.getSelectedItem().equals("Onion rings")) {
								novoPreco = 5;
							}
							if(comboBoxSanduicheTopping2.getSelectedItem().equals("Picles")) {
								novoPreco = 2.5;
							}
							if(comboBoxSanduicheTopping2.getSelectedItem().equals("Cebola roxa")) {
								novoPreco = 2;
							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					comboBoxSanduicheTopping3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxSanduicheTopping3.getSelectedItem().equals("Nenhum")) {
								novoPreco = 0;
							}
							if(comboBoxSanduicheTopping3.getSelectedItem().equals("Salada")) {
								novoPreco = 2;
							}
							if(comboBoxSanduicheTopping3.getSelectedItem().equals("Bacon")) {
								novoPreco = 4;
							}
							if(comboBoxSanduicheTopping3.getSelectedItem().equals("Onion rings")) {
								novoPreco = 5;
							}
							if(comboBoxSanduicheTopping3.getSelectedItem().equals("Picles")) {
								novoPreco = 2.5;
							}
							if(comboBoxSanduicheTopping3.getSelectedItem().equals("Cebola roxa")) {
								novoPreco = 2;
							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					
					comboBoxSanduicheMolho.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxSanduicheMolho.getSelectedItem().equals("Nenhum")) {
								novoPreco = 0;
							}
							if(comboBoxSanduicheMolho.getSelectedItem().equals("Barbecue")) {
								novoPreco = 4;
							}
							if(comboBoxSanduicheMolho.getSelectedItem().equals("Maionese de alho")) {
								novoPreco = 2.5;
							}
							if(comboBoxSanduicheMolho.getSelectedItem().equals("Maionese verde")) {
								novoPreco = 3;
							}
							if(comboBoxSanduicheMolho.getSelectedItem().equals("Maionese trufada")) {
								novoPreco = 5;
							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					BotaoConfirmarItem.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(comboBoxAdicionar.getSelectedItem().equals("Sanduiche")) {
								double valorTotal = 0;
								JTextPane txtpnRecisaoDoPedido = new JTextPane();
								txtpnRecisaoDoPedido.setBounds(208, 207, 148, 222);
								frame.getContentPane().add(txtpnRecisaoDoPedido);
								txtpnRecisaoDoPedido.setText(txtpnRecisaoDoPedido.getText() + "" + comboBoxSanduicheCarne.getSelectedItem() + " com "+ comboBoxSanduicheQueijo.getSelectedItem() + " no "
										+ comboBoxSanduichePao.getSelectedItem() + "com: " + comboBoxSanduicheTopping1.getSelectedItem() + ", "
										+ comboBoxSanduicheTopping2.getSelectedItem() + ", "+ comboBoxSanduicheTopping3.getSelectedItem()
										+ " e " + comboBoxSanduicheMolho.getSelectedItem() + "\nPor: R$" + LabelPrecoDoProduto.getText() + "\n");
								
								valorTotal = Double.parseDouble(LabelValorTotal.getText()) + Double.parseDouble(LabelPrecoDoProduto.getText());
								LabelValorTotal.setText(""+ valorTotal);
							}
						}
					});
					
					
				} if(comboBoxAdicionar.getSelectedItem().equals("Acompanhamento")) {
					
					panel.setVisible(true);
					JLabel LabelAcompanhamentoPorcao = new JLabel("Por\u00E7\u00E3o:");
					LabelAcompanhamentoPorcao.setBounds(0, 11, 54, 14);
					panel.add(LabelAcompanhamentoPorcao);
					
					JLabel LabelAcompanhamentoTamanho = new JLabel("Tamanho:");
					LabelAcompanhamentoTamanho.setBounds(0, 36, 73, 14);
					panel.add(LabelAcompanhamentoTamanho);
					
					JLabel LabelAcompanhamentoMolho = new JLabel("Molho:");
					LabelAcompanhamentoMolho.setBounds(0, 61, 46, 14);
					panel.add(LabelAcompanhamentoMolho);
					
					JComboBox comboBoxAcompanhamentoPorcao = new JComboBox();
					comboBoxAcompanhamentoPorcao.setModel(new DefaultComboBoxModel(new String[] {"Batata palito", "Batata chips", "Onion rings", "Cenoura no vapor"}));
					comboBoxAcompanhamentoPorcao.setBounds(64, 7, 122, 22);
					panel.add(comboBoxAcompanhamentoPorcao);
					
					JComboBox comboBoxAcompanhamentoTamanho = new JComboBox();
					comboBoxAcompanhamentoTamanho.setModel(new DefaultComboBoxModel(new String[] {"Pequeno", "M\u00E9dio", "Grande"}));
					comboBoxAcompanhamentoTamanho.setBounds(64, 32, 122, 22);
					panel.add(comboBoxAcompanhamentoTamanho);
					
					JComboBox comboBoxAcompanhamentoMolho = new JComboBox();
					comboBoxAcompanhamentoMolho.setModel(new DefaultComboBoxModel(new String[] {"Nenhum", "Barbecue", "Maionese de alho", "Maionese verde", "Maionese trufada"}));
					comboBoxAcompanhamentoMolho.setBounds(64, 57, 122, 22);
					panel.add(comboBoxAcompanhamentoMolho);
					
					comboBoxAcompanhamentoPorcao.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxAcompanhamentoPorcao.getSelectedItem().equals("Batata palito")) {
								novoPreco = 6.5;
							}
							if(comboBoxAcompanhamentoPorcao.getSelectedItem().equals("Batata chips")) {
								novoPreco = 6;
							}
							if(comboBoxAcompanhamentoPorcao.getSelectedItem().equals("Onion rings")) {
								novoPreco = 7;
							}
							if(comboBoxAcompanhamentoPorcao.getSelectedItem().equals("Cenoura no vapor")) {
								novoPreco = 5;
							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					comboBoxAcompanhamentoTamanho.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxAcompanhamentoTamanho.getSelectedItem().equals("Pequeno")) {
								novoPreco = Double.parseDouble(LabelPrecoDoProduto.getText());
							}
							if(comboBoxAcompanhamentoTamanho.getSelectedItem().equals("Médio")) {
								novoPreco = Double.parseDouble(LabelPrecoDoProduto.getText())* 2;
							}
							if(comboBoxAcompanhamentoTamanho.getSelectedItem().equals("Grande")) {
								novoPreco = Double.parseDouble(LabelPrecoDoProduto.getText())* 3;
							}
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					comboBoxAcompanhamentoMolho.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxAcompanhamentoMolho.getSelectedItem().equals("Nenhum")) {
								novoPreco = 0;
							}
							if(comboBoxAcompanhamentoMolho.getSelectedItem().equals("Barbecue")) {
								novoPreco = 4;
							}
							if(comboBoxAcompanhamentoMolho.getSelectedItem().equals("Maionese de alho")) {
								novoPreco = 2.5;
							}
							if(comboBoxAcompanhamentoMolho.getSelectedItem().equals("Maionese verde")) {
								novoPreco = 3;
							}
							if(comboBoxAcompanhamentoMolho.getSelectedItem().equals("Maionese trufada")) {
								novoPreco = 5;
							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					BotaoConfirmarItem.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(comboBoxAdicionar.getSelectedItem().equals("Acompanhamento")) {
								double valorTotal = 0;
								JTextPane txtpnRecisaoDoPedido = new JTextPane();
								txtpnRecisaoDoPedido.setBounds(208, 207, 148, 222);
								frame.getContentPane().add(txtpnRecisaoDoPedido);
								txtpnRecisaoDoPedido.setText(txtpnRecisaoDoPedido.getText() + comboBoxAcompanhamentoPorcao.getSelectedItem() + " tamanho "
										+ comboBoxAcompanhamentoTamanho.getSelectedItem() + " com " + comboBoxAcompanhamentoMolho.getSelectedItem() 
										+ "\nPor: R$" + LabelPrecoDoProduto.getText() + "\n ");
								
								valorTotal = Double.parseDouble(LabelValorTotal.getText()) + Double.parseDouble(LabelPrecoDoProduto.getText());
								LabelValorTotal.setText(""+ valorTotal);
							}
						}
					});
					
					
				} if(comboBoxAdicionar.getSelectedItem().equals("Bebida")) {
					
					panel.setVisible(true);
					JLabel LabelBebidaBebida = new JLabel("Bebida:");
					LabelBebidaBebida.setBounds(0, 11, 46, 14);
					panel.add(LabelBebidaBebida);
					
					JComboBox comboBoxBebidaBebida = new JComboBox();
					comboBoxBebidaBebida.setModel(new DefaultComboBoxModel(new String[] {"Coca-cola", "Fanta laranja", "Suco de laranja", "Ch\u00E1 gelado", "Suco de uva", "Guaran\u00E1"}));
					comboBoxBebidaBebida.setBounds(66, 7, 120, 22);
					panel.add(comboBoxBebidaBebida);
					
					comboBoxBebidaBebida.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double novoPreco = 0;
							if(comboBoxBebidaBebida.getSelectedItem().equals("Coca-cola")) {
								novoPreco = 5;
							}
							if(comboBoxBebidaBebida.getSelectedItem().equals("Fanta laranja")) {
								novoPreco = 4.5;
							}
							if(comboBoxBebidaBebida.getSelectedItem().equals("Suco de laranja")) {
								novoPreco = 3;
							}
							if(comboBoxBebidaBebida.getSelectedItem().equals("Chá gelado")) {
								novoPreco = 4;
							}
							if(comboBoxBebidaBebida.getSelectedItem().equals("Suco de uva")) {
								novoPreco = 3.5;
							}
							if(comboBoxBebidaBebida.getSelectedItem().equals("Guaraná")) {
								novoPreco = 4.5;
							}
							novoPreco = novoPreco + Double.parseDouble(LabelPrecoDoProduto.getText());
							
							LabelPrecoDoProduto.setText(""+ novoPreco);
						}
					});
					
					BotaoConfirmarItem.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								if(comboBoxAdicionar.getSelectedItem().equals("Bebida")) {
								double valorTotal = 0;
								JTextPane txtpnRecisaoDoPedido = new JTextPane();
								txtpnRecisaoDoPedido.setBounds(208, 207, 148, 222);
								frame.getContentPane().add(txtpnRecisaoDoPedido);
								txtpnRecisaoDoPedido.setText(txtpnRecisaoDoPedido.getText() + comboBoxBebidaBebida.getSelectedItem() 
									+ "\nPor: R$" + LabelPrecoDoProduto.getText() + "\n ");
								
								valorTotal = Double.parseDouble(LabelValorTotal.getText()) + Double.parseDouble(LabelPrecoDoProduto.getText());
								LabelValorTotal.setText(""+ valorTotal);
							}
						}
					});
				}
			}	
		});
		BotaoIr.setBounds(150, 201, 46, 18);
		frame.getContentPane().add(BotaoIr);
		
		JTextPane txtpnRecisaoDoPedido = new JTextPane();
		txtpnRecisaoDoPedido.setBounds(208, 207, 148, 222);
		frame.getContentPane().add(txtpnRecisaoDoPedido);
		
		JLabel lblNewLabel_9 = new JLabel("R$");
		lblNewLabel_9.setBounds(53, 476, 31, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("R$");
		lblNewLabel_10.setBounds(244, 440, 31, 14);
		frame.getContentPane().add(lblNewLabel_10);
	}
}
