package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {
	
    static String corTextoVerde = Cores.TEXT_GREEN_BOLD;
    static String corTextoAmarelo = Cores.TEXT_YELLOW_BOLD;
    static String corTextoVermelho = Cores.TEXT_RED_BOLD;
    static String corFundoPreto = Cores.ANSI_BLACK_BACKGROUND;
    static String reset = Cores.TEXT_RESET;

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        int opcao;

        while (true) {
            String horizontal = corTextoVerde + corFundoPreto + "============================================================" + reset;
            String vertical = corTextoVerde + corFundoPreto + "||                                                        ||" + reset;

            // cabeçalho
            System.out.println(horizontal);
            System.out.println(vertical);
            System.out.println(corTextoVerde + corFundoPreto + "||" + corTextoAmarelo + corFundoPreto + "                  LOJA ARTESANATO COM A                 " + corTextoVerde + corFundoPreto + "||" + reset);
            System.out.println(corTextoVerde + corFundoPreto + "||" + corTextoAmarelo + corFundoPreto + "                    SEJA BEM VINDO                      " + corTextoVerde + corFundoPreto + "||" + reset);
            System.out.println(vertical);
            System.out.println(horizontal);

            // opções
            System.out.println(corTextoAmarelo + corFundoPreto + "1. Cadastrar Produto                                      " + corTextoVerde + "||" + reset);
            System.out.println(corTextoAmarelo + corFundoPreto + "2. Listar Todos Produtos                                  " + corTextoVerde + "||" + reset);
            System.out.println(corTextoAmarelo + corFundoPreto + "3. Buscar Produto por ID                                  " + corTextoVerde + "||" + reset);
            System.out.println(corTextoAmarelo + corFundoPreto + "4. Atualizar Produto                                      " + corTextoVerde + "||" + reset);
            System.out.println(corTextoAmarelo + corFundoPreto + "5. Remover Produto                                        " + corTextoVerde + "||" + reset);
            System.out.println(corTextoVermelho + corFundoPreto + "0. Sair                                                   " + corTextoVerde + "||" + reset);
            System.out.println(horizontal);

            // entrada usuario
            System.out.print(corTextoAmarelo + corFundoPreto + "Selecione a opção desejada:                               " + corTextoVerde + "||" + reset);
            
            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(corTextoVermelho + "\nEntrada inválida! Por favor, digite um número inteiro." + reset);
                leia.next(); 
                continue;   
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nCadastrar Produto");

                    break;
                case 2:
                    System.out.println("\nListar Produtos");

                    break;
                case 3:
                    System.out.println("\nBuscar Produto por ID");

                    break;
                case 4:
                    System.out.println("\nAtualizar Produto");

                    break;
                case 5:
                    System.out.println("\nRemover Produto");

                    break;
                case 0:
                	System.out.println(horizontal);
                	System.out.println(vertical);
                    System.out.println(corTextoVerde + corFundoPreto + "||" + corTextoAmarelo + corFundoPreto + "            A Loja Artesanato com A, Agradece!          " + corTextoVerde + "||" + reset);
                    System.out.println(corTextoVerde + corFundoPreto + "||" + corTextoAmarelo + corFundoPreto + "                     VOLTE SEMPRE                       " + corTextoVerde + "||" + reset);
                    System.out.println(corTextoVerde + corFundoPreto + "||" + corTextoAmarelo + corFundoPreto + "                        😊 🎨                           " + corTextoVerde + "||" + reset);
                    System.out.println(vertical);
                    leia.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        }

	}

}
