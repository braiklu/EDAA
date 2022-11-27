public class Questao03 {
// B - Crie um método para inserção de um novo aluno na última posição da estrutura

public static Aluno[] inserirAlunoUltimaPosicao(Aluno[] alunos, Aluno aluno) {
    Aluno[] novoAlunos = new Aluno[alunos.length + 1];
    for (int i = 0; i < alunos.length; i++) {
        novoAlunos[i] = alunos[i];
    }
    novoAlunos[novoAlunos.length - 1] = aluno;
    return novoAlunos;
}

// C - Crie um método para inserção de um novo aluno na primeira posição da estrutura

public static Aluno[] inserirAlunoNaPrimeiraPosicao(Aluno[] alunos, Aluno aluno) {
    Aluno[] novoAlunos = new Aluno[alunos.length + 1];
    novoAlunos[0] = aluno;
    for (int i = 0; i < alunos.length; i++) {
        novoAlunos[i + 1] = alunos[i];
    }
    return novoAlunos;
}

// D - Crie um método para inserção de um novo aluno em uma posição informada pelo usuário

public static Aluno[] inserirAlunoEmPosicaoInformadaPeloUsuario(Aluno[] alunos, Aluno aluno, int posicao) {
    Aluno[] novoAlunos = new Aluno[alunos.length + 1];
    for (int i = 0; i < posicao; i++) {
        novoAlunos[i] = alunos[i];
    }
    novoAlunos[posicao] = aluno;
    for (int i = posicao; i < alunos.length; i++) {
        novoAlunos[i + 1] = alunos[i];
    }
    return novoAlunos;
}

// E - Crie um método que retorne a quantidade de alunos armazenados na lista

public static void quantidadeDeAlunosArmazenadosNaLista() {
    if (inicio == null) {
        System.out.println("A lista está vazia");
        return;
    }
    Aluno aux = inicio;
    int contador = 0;
    while (aux != null) {
        aux = aux.proximo;
        contador++;
    }
    System.out.println("A quantidade de alunos armazenados na lista é: " + contador);
}

// F - Crie um método para realizar a remoção de um aluno com base em um número de matrícula informado

public static Aluno[] removerAlunoComBaseEmNumeroDeMatriculaInformada(int matricula) {
    if (inicio == null) {
        System.out.println("A lista está vazia");
        return null;
    }
    Aluno aux = inicio;
    Aluno anterior = null;
    while (aux != null && aux.matricula != matricula) {
        anterior = aux;
        aux = aux.proximo;
    }
    if (aux == null) {
        System.out.println("Aluno não encontrado");
        return null;
    }
    if (anterior == null) {
        inicio = aux.proximo;
        return null;
    }
    anterior.proximo = aux.proximo;
}
