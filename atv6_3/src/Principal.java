import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    public void main(String[] args){
        int volume,numero,tiragem;
        String tituloRevista,dataEdicao;
        long issn;
        String periodiciodade;
        String titulo, resumo, autores;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o Título da Revista");
        tituloRevista = ler.nextLine();
        System.out.println("Digite o ISSN Revista");
        issn = ler.nextLong();
        System.out.println("Digite a Periodicidade ");
        periodiciodade = ler.nextLine();
        System.out.println("Digite o Número ");
        numero = ler.nextInt();
        System.out.println("Digite o Volume ");
        volume = ler.nextInt();
        System.out.println("Digite a Data de Edição ");
        dataEdicao = ler.nextLine();
        System.out.println("Digite a Tiragem ");
        tiragem = ler.nextInt();
        titulo = ler.nextLine();

        Edicao edicao = new Edicao(numero,volume,tiragem,tituloRevista);
        RevistaCientifica revista = new RevistaCientifica(titulo, periodiciodade, issn, edicao);
        ArrayList<Artigo> artigos = new ArrayList<>();

        for (int i=0; i < 10; i++){
            System.out.println("Digite o título");
            titulo = ler.nextLine();
            System.out.println("Digite o resumo");
            resumo = ler.nextLine();
            System.out.println("Digite os autores");
            autores = ler.nextLine();
            artigos.add(new Artigo(titulo, resumo, autores));
            edicao.adicionaArtigo(artigos.get(i));

        }


    }
}
