class Funcionario {
    String nome;
    int salario;
    int nasc;
    int idade;

    public Funcionario(String nome, int nasc, int salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }


    public void informarSalario() {
        System.out.println("O salário do funcionário " + nome + " é R$: " + salario);
    }

    public void calcularIdade() {
        idade = 2024 - nasc;
        System.out.println("A idade do " + nome + " é " + idade);

    }
}

class Gerente extends Funcionario {
    String projeto;

    public Gerente(String nome, int nasc, int salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("O projeto do gerente " + nome + " consiste na " + projeto);
    }
}

class Programador extends Funcionario {
    String linguagem;
    public Programador(String nome, int nasc, int salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("A linguagem do programador " + nome + " é " + linguagem);
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("pedro", 2005, 2000);
        Gerente gerente = new Gerente("Joao", 2003, 5000, "implementação de LLM");
        Programador programador = new Programador("Lira", 2006, 15000, "java");

        funcionario.calcularIdade();
        funcionario.informarSalario();

        gerente.informarProjeto();

        programador.informarLinguagem();
    }
}