// B - Crie um método para realizar a inserção de um novo aluno na primeira
    // posição disponível no vetor
    public static void inserirAlunoPrimeiraPosicaoDisponivel(Aluno[] alunos, Aluno aluno) {
        Aluno aluno = new Aluno();
        aluno.nome = "Kleber";
        aluno.matricula = 121112543;
        aluno.curso = "Engenharia Ambiental";

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
        }
    }

    // C - Crie um método para realizar a remoção de um aluno com base em um número
    // de matrícula informado

    public static Aluno[] removerAlunoPelaMatricula(Aluno[] alunos, int matricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].matricula == matricula) {
                alunos[i] = null;
                break;
            }
        }
    }

    // D - Crie um método para informar a quantidade de posições vazias (sem alunos)
    // na estrutura

    public static Aluno[] printarPosicoesVazias(Aluno[] alunos) {
        int numeroPosicoesVazias = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                numeroPosicoesVazias++;
            }
        }
        System.out.println("Numero de posicoes vazias: " + numeroPosicoesVazias);
        return alunos;

    }
    
    // E - Implemente a função de inserção que aumente de tamanho para caber mais
    // posições. Toda vez que a estrutura estiver cheia ela deve aumentar em 5
    // posições.

    public static Aluno[] adicionarAlunoAumentarArray(Aluno[] alunos, Aluno aluno) {
        int numeroPosicoesVazias = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                numeroPosicoesVazias++;
            }
        }
        if (numeroPosicoesVazias == 0) {
            Aluno[] novoArray = new Aluno[alunos.length + 5];
            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i];
            }
            alunos = novoArray;
        }
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
        }
        return alunos;
    }
