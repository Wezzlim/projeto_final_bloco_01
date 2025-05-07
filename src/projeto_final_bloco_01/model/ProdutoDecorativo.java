package projeto_final_bloco_01.model;

public class ProdutoDecorativo extends Produto {

	private String material;
	
	public ProdutoDecorativo(int id, String nome, String categoria, float preco, String material) {
		super(id, nome, categoria, preco);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	//sobre escrito metodo visualizar da classe filha
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Material: " + this.material);
    }
	
}
