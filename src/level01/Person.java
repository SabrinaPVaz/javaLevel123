package nivel01;
/**
 * nível 1:
 * faça um programa q imprima o nome e a idade de uma pessoa.
 * neste momento, tudo público, sem restrição de acesso.
 *
 * Nessa classe People é onde DECLARA os atributos (caracteristicas - adjetivos) e métodos (o que ele faz - verbo)
 */
public class Person {

    public String nome;
    public int idade;

    public void imprimir() {
        System.out.println(nome + " " + idade);
    }

}
