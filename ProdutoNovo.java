import java.time.LocalDate;
// criei a classe para colocar os atributos
public class ProdutoNovo {
	    // Atributos da classe
	    private String nome;         // Armazena o nome do produto
	    private double valcusto;   // Armazena o custo do produto
	    private double valvenda;   // Armazena o valor de venda do produto
	    private LocalDate fabricacao;   // Armazena a data de fabricação do produto
	    private LocalDate validade;   // Armazena a data de validade do produto
	    // metodo construtor para organizar os atributos
	    public ProdutoNovo (String nome, double valcusto, double valvenda, LocalDate fabricacao, LocalDate validade) { 
	        // direciona as caracteristicas ao atributo
	    	this.nome = nome;
	        this.valcusto = valcusto;
	        this.valvenda = valvenda;
	        this.fabricacao = fabricacao;
	        this.validade = LocalDate.now().plusMonths(1);
	    }
	    // metodo construtor para receber os atributos nome, valcusto, valvenda e fabricacao
	    public ProdutoNovo(String nome, double valcusto, double valvenda, LocalDate fabricacao) {
	        this(nome, valcusto, valvenda, fabricacao, fabricacao.plusMonths(1));
	    }
	    // metodo construtor para receber os atributos nome e valcusto
	    public ProdutoNovo(String nome, double valcusto) {  
	    	// atribui as informações
	        this.nome = nome;
	        this.valcusto = valcusto;
	        this.valvenda = valcusto * 1.10; // coloca 10% a mais sobre o preço de custo
	        this.fabricacao = LocalDate.now();      // Data de fabricação é em tempo real
	        this.validade = fabricacao.plusMonths(1); // adiciona um mês em relação a data de fabricação
	    }

	    // metodo get para pegar o valor do atributo nome 
	    public String getNome() {
	        return nome;
	    }
	    // metodo get para pegar o valor de custo do atributo valcusto
	    public double getValcusto() {          
	        return valcusto;
	    }
	    // metodo get para pegar o valor de venda do atributo valvenda
	    public double getValvenda() {
	        return valvenda;
	    }
	    // metodo get para pegar a data de fabricacao do atributo fabricacao
	    public LocalDate getFabricacao() {
	        return fabricacao;
	    }
	    // metodo get para pegar a data de validade do atributo validade
	    public LocalDate getValidade() {
	        return validade;
	    }
	    // metodo para organizar as todas informações 
	    public String descricao() {
	        return "Nome do Produto: " + nome + 
	               "\nPreço de Custo: R$ " + valcusto + 
	               "\nValor de Venda: R$ " + valvenda + 
	               "\nData de Fabricação: " + fabricacao + 
	               "\nData de Validade: " + validade;
	    }
	    public static void main(String[] args) {
	    	// mostra o primeiro produto
	    	ProdutoNovo p1 = new ProdutoNovo("Arroz", 42, 67, LocalDate.now(), LocalDate.now());
	        System.out.println(p1.descricao());

	        System.out.println(" ");
	        // mostra o segundo produto
	        ProdutoNovo p2 = new ProdutoNovo("Batata", 12, 23, LocalDate.now());
	        System.out.println(p2.descricao());

	        System.out.println(" ");
	        // mostra o terceiro produto
	        ProdutoNovo p3 = new ProdutoNovo("Feijão", 20);
	        System.out.println(p3.descricao());
	    }
	}