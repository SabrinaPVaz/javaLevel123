package nivel02;

import nivel03.Dog;

import java.util.Set;

/**
 * O ambiente de execução java (JRE - java runtime envoirment) ao executar uma aplicação,
 * o JRE busca o método principal da aplicação (main)
 *
 * Na applicatrion é onde se INSTANCIAM os objetos e CHAMA os metodos para rodar
 */
public class Application {
    public static void main(String[] args) {
        // NomeDaClasse variavelDeInstancia = new NomeDaClasse();
        Person daughter = new Person();
        daughter.setNome("julia");
        daughter.setIdade(3);

        daughter.imprimir();

        Person mother = new Person();
        mother.setNome("sabrina");
        mother.setIdade(33);

        mother.imprimir();


    }
}
