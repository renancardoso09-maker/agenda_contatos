package br.edu.principal;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Uteis {

	public static int selecionaOpcao(Scanner sc) {
    	System.out.print("Escolha uma opção: ");
        int opc = sc.nextInt();
        sc.nextLine();
        return opc;
    }
    
    public static void sair(boolean continuar) {
    	System.out.println("Saindo da Agenda de Contatos...");
        continuar = false;
    }
    
    public static void sobre() {
    	JOptionPane.showMessageDialog(null,
    			"Desenvolvido por Renan L. Cardoso.");
    	
    }
}