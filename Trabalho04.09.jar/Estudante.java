//Iago Vargas de Oliveira
/**
 * Representa um estudante com nome e idade.
 * Implementa a interface Comparable para permitir a comparação e ordenação de estudantes.
 */
public class Estudante implements Comparable<Estudante> {

    private String nomeEstudante;
    private int idadeEstudante;

    /**
     * Construtor da classe Estudante.
     * 
     * @param nomeEstudante O nome do estudante.
     * @param idadeEstudante A idade do estudante.
     */
    public Estudante(String nomeEstudante, int idadeEstudante) {
        this.nomeEstudante = nomeEstudante;
        this.idadeEstudante = idadeEstudante;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public int getIdadeEstudante() {
        return idadeEstudante;
    }

    public void setIdadeEstudante(int idadeEstudante) {
        this.idadeEstudante = idadeEstudante;
    }

    @Override
    public String toString() {
        return "\nEstudante [nomeEstudante=" + nomeEstudante + ", idadeEstudante=" + idadeEstudante + "]";
    }

    /**
     * Compara este estudante com outro estudante para fins de ordenação.
     * Ordena primeiro por nome e, em caso de empate, por idade.
     * 
     * @param outroEstudante O outro estudante para comparação.
     * @return Um valor negativo, zero ou positivo conforme este estudante é menor, igual ou maior que o outro estudante.
     */
    @Override
    public int compareTo(Estudante outroEstudante) {
        int nomeComparacao = this.nomeEstudante.compareTo(outroEstudante.getNomeEstudante());
        if (nomeComparacao != 0) {
            return nomeComparacao;
        } else {
            return Integer.compare(this.idadeEstudante, outroEstudante.getIdadeEstudante());
        }
    }
}

