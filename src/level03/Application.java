package nivel03;

public class Application {
    public static void main(String[] args) {
        Person person = new Person();
        person.setNome("Douglas");
        person.setIdade(33);

        Dog cachorro = new Dog();
        cachorro.setNomeCachorro("Snoopy");
        cachorro.setCorCachorro("branco");

        cachorro.latirInformandoCor();

        System.out.println("a idade da " + person.getNome() + " é " + person.getIdade() );
        System.out.println("o nome do cachorro é " + cachorro.getNomeCachorro() +
                " e a cor do seu pêlo é " + cachorro.getCorCachorro());

    }
}
