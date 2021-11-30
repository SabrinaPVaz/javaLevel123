package nivel01;
/**
 * O ambiente de execução java (JRE - java runtime envoirment) ao executar uma aplicação,
 * o JRE busca o método principal da aplicação (main)
 *
 * Na applicatrion é onde se INSTANCIAM os objetos e CHAMA os metodos para rodar
 */
public class Application {
    public static void main(String[] args) {

        Person daughter = new Person();
        daughter.nome = "Julia";
        daughter.idade = 3;

        daughter.imprimir();

        Person father = new Person();
        father.nome = "Douglas";
        father.idade = 33;

        father.imprimir();
    }
}
