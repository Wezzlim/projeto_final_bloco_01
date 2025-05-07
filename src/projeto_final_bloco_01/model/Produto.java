package projeto_final_bloco_01.model;

public abstract class Produto {

	//atributos
	private int id;
    private String nome, categoria;
    private float preco;
    
    //construtor
	public Produto(int id, String nome, String categoria, float preco) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}

	//get e set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	// visualizar da classepai
	public void visualizar() 
	{
	    System.out.println("************************************");
	    System.out.println("ID: " + this.id);
	    System.out.println("Nome: " + this.nome);
	    System.out.println("Categoria: " + this.categoria);
	    System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
	    System.out.println("************************************");
	}
    
    
}
