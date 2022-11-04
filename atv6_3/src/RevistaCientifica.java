public class RevistaCientifica {
    private String titulo, peridiocidade;
    private long issn;
    private Edicao edicoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeridiocidade() {
        return peridiocidade;
    }

    public void setPeridiocidade(String peridiocidade) {
        this.peridiocidade = peridiocidade;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public Edicao getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(Edicao edicoes) {
        this.edicoes = edicoes;
    }

    public RevistaCientifica(String titulo, String peridiocidade, long issn, Edicao edicoes) {
        this.titulo = titulo;
        this.peridiocidade = peridiocidade;
        this.issn = issn;
        this.edicoes = edicoes;
    }
}
