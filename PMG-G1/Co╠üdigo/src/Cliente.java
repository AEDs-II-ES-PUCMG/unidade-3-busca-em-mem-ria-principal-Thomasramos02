import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private static int ultimoID = 10_000;

    private String nome;
    private int documento;

    /**
     * Construtor do cliente. Cria um novo cliente a partir do nome informado.
     * TODO: utilize obrigatoriamente o método setNome para atribuir o nome ao cliente.
     * TODO: atribua ao cliente um número de documento gerado sequencialmente a partir
     * do contador estático ultimoID (e incremente o contador).
     */
    public Cliente (String nome) {
        this.nome = nome;
        this.documento = documento;
        this.ultimoID = ultimoID;

    }

    /**
     * TODO: retorne o nome do cliente.
     */
    public String getNome() {
    	return nome;
    }

    /**
     * Atribui ao cliente o nome informado como parâmetro.
     * TODO: esse nome deve conter, pelo menos, duas palavras; caso contrário,
     * lance a exceção adequada (IllegalArgumentException).
     */
    public void setNome(String nome) {
        if(nome == null || nome.trim().split("\\s+").length < 2){
            throw new IllegalArgumentException("o nome dentro dos parenteses deve conter pelo menos duas palavras");
        }
    	this.nome = nome;

    }

    /**
     * TODO: retorne uma representação textual do cliente, incluindo seu nome e documento.
     */
    @Override
    public String toString() {
    	// TODO: implementar
        return "Cliente{nome='" + nome + "', documento='" + documento + "'}";
    }

    /**
     * TODO: retorne um código hash para o cliente, que corresponde a seu documento.
     */
    @Override
    public int hashCode(){
    	// TODO: implementar
        return documento != null ? documento.hashCode() : 0;
    }

     static Cliente criarDoTexto(String linha) {
        String[] dadosLinha;
        int quantidadeCliente;
        String nomeCliente;
        Cliente cliente;

        dadosLinha = linha.split(";");
        quantidadeCliente = Integer.parseInt(dadosLinha[0]);
        nomeCliente = dadosLinha[1];
        cliente = new Cliente(nomeCliente);
    	return cliente;
    }
}
