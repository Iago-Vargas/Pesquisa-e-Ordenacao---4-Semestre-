//Iago Vargas
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Classe utilitária para gerar nomes e idades aleatórios para estudantes.
 */
public class Util {

    /**
     * Gera um nome aleatório com o tamanho especificado.
     * 
     * @param tamanho O tamanho do nome a ser gerado.
     * @return O nome aleatório gerado.
     */
    public static String gerarNomeAleatorio(int tamanho) {

        String letras = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder nome = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            char letraSorteada = letras.charAt(random.nextInt(letras.length()));
            nome.append(letraSorteada);
        }

        return nome.toString();
    }

    /**
     * Gera uma idade aleatória entre 18 e 70 anos.
     * 
     * @return A idade aleatória gerada.
     */
    public static int gerarIdadeAleatoria() {

        Random random = new Random();
        return random.nextInt(18, 70);
    }

    /**
     * Exibe o estado da lista antes e depois da ordenação.
     * 
     * @param lista A lista de estudantes a ser exibida.
     * @param metodo O método de ordenação a ser aplicado.
     */
    public static void exibirOrdenacao(List<Estudante> lista, String metodo) {

        switch (metodo) {
            case "bolha":
                Ordenacao.metodoBolha(lista);
                break;
            case "selecao":
                Ordenacao.metodoSelecao(lista);
                break;
            case "insercao":
                Ordenacao.metodoInsercao(lista);
                break;
            case "sort":
                Collections.sort(lista);
                break;
            default:
                throw new IllegalArgumentException("Método de ordenação inválido: " + metodo);
        }

        System.out.println("\n==== Lista " + metodo + " COM ordenação ====\n");
        System.out.println(lista);
    }

    /**
     * Gera uma lista de estudantes com nomes e idades aleatórios.
     * 
     * @param quantidade A quantidade de estudantes a ser gerada.
     * @param tamanhoNome O tamanho dos nomes dos estudantes.
     * @return A lista de estudantes gerados.
     */
    public static List<Estudante> gerarNomesEIdades(int quantidade, int tamanhoNome) {

        List<Estudante> lista = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            String nome = gerarNomeAleatorio(tamanhoNome);
            int idade = gerarIdadeAleatoria();
            lista.add(new Estudante(nome, idade));
        }

        return lista;
    }
}
