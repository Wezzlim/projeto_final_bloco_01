package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.ProdutoDecorativo;
import projeto_final_bloco_01.util.Cores;

public class Menu {
	
    static String corTextoVerde = Cores.TEXT_GREEN_BOLD;
    static String corTextoAmarelo = Cores.TEXT_YELLOW_BOLD;
    static String corTextoVermelho = Cores.TEXT_RED_BOLD;
    static String corFundoPreto = Cores.ANSI_BLACK_BACKGROUND;
    static String reset = Cores.TEXT_RESET;
    
    static ProdutoController produtos = new ProdutoController();

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
                    System.out.println("\nCadastrar Produto Decorativo: ");
                    
                    System.out.print("ID: ");
                    int id = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Nome: ");
                    String nome = leia.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = leia.nextLine();

                    System.out.print("Preço: ");
                    float preco = leia.nextFloat();
                    leia.nextLine();

                    System.out.print("Material: ");
                    String material = leia.nextLine();

                    ProdutoDecorativo produto = new ProdutoDecorativo(id, nome, categoria, preco, material);

                    produtos.cadastrar(produto);
                    keyPress();
                    break;
                case 2:
                    System.out.println("\nListar Produtos");
                    
                    produtos.listarTodos();
                    keyPress();
                    break;
                case 3:
                    System.out.println("\nBuscar Produto por ID");

                    System.out.print("Informe o ID do produto: ");
                    int idBuscar = leia.nextInt();
                    produtos.procurarPorId(idBuscar);

                    keyPress();
                    break;
                case 4:
                    System.out.println("\nAtualizar Produto");

                    System.out.print("ID do produto que deseja atualizar: ");
                    int idAtualizar = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Novo Nome: ");
                    String novoNome = leia.nextLine();

                    System.out.print("Nova Categoria: ");
                    String novaCategoria = leia.nextLine();

                    System.out.print("Novo Preço: ");
                    float novoPreco = leia.nextFloat();
                    leia.nextLine();

                    System.out.print("Novo Material: ");
                    String novoMaterial = leia.nextLine();

                    // Cria o novo objeto para atualização
                    ProdutoDecorativo produtoAtualizado = new ProdutoDecorativo(idAtualizar, novoNome, novaCategoria, novoPreco, novoMaterial);

                    // Chama o controller para atualizar
                    produtos.atualizar(produtoAtualizado);
                    keyPress();
                    break;
                case 5:
                    System.out.println("\nRemover Produto");

                    System.out.print("Informe o ID do produto a ser removido: ");
                    int idRemover = leia.nextInt();

                    // Chama o controller para remover o produto
                    produtos.deletar(idRemover);
                    keyPress();
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
                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    keyPress();
                    break;
            }
        }

	}
	
	public static void keyPress() {
	    try {
	        Scanner leia = new Scanner(System.in);
	        System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
	        leia.nextLine();
	    } catch (Exception e) {
	        System.err.println("Erro ao esperar tecla Enter.");
	    }
	}

}
