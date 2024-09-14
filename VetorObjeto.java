package projeto_revisao_ed;

public class VetorObjeto<T> {
    private Object[] elementos;
    private int tamanho;


    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }


    public void adiciona(T elemento) {
        if (this.tamanho == this.elementos.length) {
            aumentaCapacidade();
        }
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }


    public int tamanho() {
        return this.tamanho;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]).append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }


    private void aumentaCapacidade() {
        Object[] elementosNovos = new Object[this.elementos.length * 2];
        System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
        this.elementos = elementosNovos;
    }


    public T busca(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return (T) this.elementos[posicao];
        } else {
            throw new Exception("Posição Inválida");
        }
    }


    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;
            this.elementos[this.tamanho] = null;
        } else {
            throw new Exception("Posição Inválida");
        }
    }
}
