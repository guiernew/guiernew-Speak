package speak.guiernew.com.github.speak.Classes;

/**
 * Created by Guilherme on 27/07/2016.
 */
public class Licao {

    private String nome;
    private String descricao;
    private Livro livro;
    private  boolean feitoDownload;

    public boolean isFeitoDownload() {
        return feitoDownload;
    }

    public void setFeitoDownload(boolean feitoDownload) {
        this.feitoDownload = feitoDownload;
    }

    public Licao() {
    }

    public Licao(String nome, String descricao, Livro livro, boolean feitoDownload) {
        this.nome = nome;
        this.descricao = descricao;
        this.livro = livro;
        this.feitoDownload = feitoDownload;
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
