package nivel02;

/**
 * Faça um programa q imprima o nome e a idade de uma pessoa
 * utilizando a tecnica de encapsulamento
 * Nessa classe People é onde DECLARA os atributos (caracteristicas - adjetivos) e métodos (o que ele faz - verbo)
 */

public class Person {
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println(this.getNome() + " " + idade);
    }

    public void setNome(String argNome){

        this.nome = argNome;
    }

    public String getNome(){

        return this.nome;
    }

    public void setIdade (int argIdade){

        this.idade = argIdade;
    }

    public int getIdade(){

        return this.idade;
    }
}
