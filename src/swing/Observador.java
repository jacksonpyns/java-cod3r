package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		// O "JFrame" é como se fosse uma janela da aplicação
		// E o String passado é o Título da tela "Observador"
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // Centralizar na tela
		
		
		JButton botao = new JButton("Clicar!"); 
		janela.add(botao);
		
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!!!");
		});
			
		janela.setVisible(true);
	}
}
