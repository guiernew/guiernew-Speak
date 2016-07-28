package speak.guiernew.com.github.speak.Classes;

/**
 * Created by Guilherme on 27/07/2016.
 */
public class Livro {

    private String nome;
    private String descricao;
    private long codigo;

    public Livro(String nome, String descricao, long codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
}
