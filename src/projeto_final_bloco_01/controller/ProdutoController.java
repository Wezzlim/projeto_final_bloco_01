package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.Optional;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<>();

	@Override
	public void procurarPorId(int id) {
		
        Optional<Produto> produto = buscarNaCollection(id);

        if (produto.isPresent()) {
            produto.get().visualizar();
        } else {
            System.out.printf("\nProduto com ID %d não foi encontrado.\n", id);
        }
		
	}

	@Override
	public void listarTodos() {
		
        if (listaProdutos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado ainda.");
        } else {
            for (Produto produto : listaProdutos) {
                produto.visualizar();
            }
        }
		
	}

	@Override
	public void cadastrar(Produto produto) {

        listaProdutos.add(produto);
        System.out.println("\nProduto cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produtoAtualizado) {

	    Optional<Produto> produtoExistente = buscarNaCollection(produtoAtualizado.getId());

	    if (produtoExistente.isPresent()) {
	        listaProdutos.set(listaProdutos.indexOf(produtoExistente.get()), produtoAtualizado);
	        System.out.println("\nProduto atualizado com sucesso!");
	    } else {
	        System.out.printf("\nProduto com ID %d não encontrado.\n", produtoAtualizado.getId());
	    }
	}

	@Override
	public void deletar(int id) {
		
        Optional<Produto> produto = buscarNaCollection(id);

        if (produto.isPresent()) {
            listaProdutos.remove(produto.get());
            System.out.printf("\nProduto com ID %d foi removido com sucesso!\n", id);
        } else {
            System.out.printf("\nProduto com ID %d não encontrado.\n", id);
        }
		
	}
	
    // método auxiliar p/buscar produtos
    private Optional<Produto> buscarNaCollection(int id) {
        return listaProdutos.stream().filter(p -> p.getId() == id).findFirst();
    }
	
	
}
