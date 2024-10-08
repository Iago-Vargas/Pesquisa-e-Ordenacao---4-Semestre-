//Iago Vargas
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe principal para executar a ordenação de listas de estudantes usando diferentes métodos.
 */
public class Principal {
    public static void main(String[] args) {

        // Inicializando as listas
        List<Estudante> listaBolha = new ArrayList<>();
        List<Estudante> listaSelecao = new ArrayList<>();
        List<Estudante> listaInsercao = new ArrayList<>();
        List<Estudante> listaSort = new ArrayList<>();

        int quantidade = 60000; // serão 60 mil estudantes gerados.

        Random random = new Random();
        int tamanhoNome = random.nextInt(3, 5); // fazendo com que o tamanho dos nomes mude a cada compilação do código.

        // Gerando os nomes e idades.
        listaBolha = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaSelecao = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaInsercao = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaSort = Util.gerarNomesEIdades(quantidade, tamanhoNome);

        // ----------------------------------------------------- //

        // Exibindo e ordenando as listas

        Util.exibirOrdenacao(listaBolha, "bolha");
        //Util.exibirOrdenacao(listaSelecao, "selecao");
        //Util.exibirOrdenacao(listaInsercao, "insercao");
        //Util.exibirOrdenacao(listaSort, "sort");
    }
}
