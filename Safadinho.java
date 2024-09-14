public class Safadinho {
    private String[] elementos;
    private int tamanho;

    public Safadinho(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception {
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

    public String busca(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return elementos[posicao];
        } else {
            throw new Exception("Posição Inválida");
        }
    }

    public int busca1(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adicionaInicio(int posicao, String elemento) throws Exception {
        if (posicao >= 0 && posicao <= tamanho) {
            if (tamanho == elementos.length) {
                aumentaCapacidade();
            }
            for (int i = tamanho - 1; i >= posicao; i--) {
                elementos[i + 1] = elementos[i];
            }
            elementos[posicao] = elemento;
            tamanho++;
            return true;
        } else {
            throw new Exception("Posição Inválida");
        }
    }

    private void aumentaCapacidade() {
        String[] elementosNovos = new String[this.elementos.length * 2];
        System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
        this.elementos = elementosNovos;
    }

    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;
            this.elementos[this.tamanho] = null; // Evita referência fantasma
        } else {
            throw new Exception("Posição Inválida");
        }
    }
}
