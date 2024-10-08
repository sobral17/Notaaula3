class Animal {
    String nome;
    String raca;

    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecida";
    }

    public Animal() {
        this.nome = "Leão";
        this.raca = "Desconhecida";
    }

    public void caminha() {
        System.out.println(this.nome + " Está caminhando!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

class Cachorro extends Animal {

    public Cachorro() {
        super();
    }

    public Cachorro(String nome) {
        super(nome);
    }

    public void late() {
        System.out.println(getNome() + " Está latindo");
    }
}

class Gato extends Animal {
    public Gato() {
        super();
    }

    public Gato(String nome) {
        this.nome = nome;
    }

    public void mia() {
        System.out.println(getNome() + " Está miando");
    }
}


public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Liz");


        gato.mia();
        gato.caminha();

        cachorro.late();
        cachorro.caminha();
    }
}