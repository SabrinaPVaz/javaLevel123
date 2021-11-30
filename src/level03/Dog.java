package nivel03;
/** Douglas tem 33 anos e tem um cachorro
 * o cachorro se chama Snoopy, tem pelo branco. ele late informando a cor do pêlo: auauau, pelo branco.
 *
 faça um programa que imprima o nome, a idade do Douglas.
 além disso, o cachorro do Douglas deve dar um latido também.
 deve ser utilizada a tecnica de encapsulamento.
 */
public class Dog {
    private String nomeCachorro;
    private String corCachorro;

    public void latirInformandoCor(){
        System.out.println(this.latir() + " meu pêlo é " + this.corCachorro);
    }
    private String latir(){
        return " Au au";
    }

    public void setNomeCachorro(String nomeCachorro) {
        this.nomeCachorro = nomeCachorro;
    }
    public String getNomeCachorro (){
        return nomeCachorro;
    }

    public void setCorCachorro(String corCachorro) {
        this.corCachorro = corCachorro;
    }

    public String getCorCachorro() {
        return corCachorro;
    }
}
