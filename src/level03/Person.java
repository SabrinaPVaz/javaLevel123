package nivel03;
/** Douglas tem 33 anos e tem um cachorro
 * o cachorro se chama Snoopy, tem pelo branco. ele late informando a cor do pêlo: auauau, pelo branco.
 *
 faça um programa que imprima o nome, a idade do Douglas.
 além disso, o cachorro do Douglas deve dar um latido também.
 deve ser utilizada a tecnica de encapsulamento.
 */

public class Person {
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println(this.getNome() + " tem " + idade + " anos ");
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
