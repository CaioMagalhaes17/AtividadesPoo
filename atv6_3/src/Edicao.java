import java.util.ArrayList;

public class Edicao {
    private int numero, volume, tiragem;
    private String dataEdicao;
    private ArrayList<Artigo> artigos;

    public Edicao(int numero, int volume, int tiragem, String dataEdicao) {
        this.numero = numero;
        this.volume = volume;
        this.tiragem = tiragem;
        this.dataEdicao = dataEdicao;
        ArrayList<Artigo> artigos = new ArrayList<Artigo>();
    }

    public void adicionaArtigo(Artigo art){
        artigos.add(art);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public ArrayList<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(ArrayList<Artigo> artigos) {
        this.artigos = artigos;
    }

}
