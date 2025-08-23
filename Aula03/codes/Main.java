public class Main {
    public static void main(String[] args) {
        // Invocando um método de Instância
        // Para poder invocar um método desse tipo, 
        //   é necessário possuir um objeto instanciado
        //   para então, apartir da varíavel que referencia este objeto,
        //   poder invocar o método.

        Person raulzito = new Person();
        // Declara-se uma variável do tipo "Person" >> 'Person raulzito'
        // Instancia-se um novo objeto apartir da classe Person >> 'new Person()'
        // Atribui a referência do novo objeto para a variável ' = '

        raulzito.setName("Raul Santos Seixas");
        // Apartir da variável que referência um objeto "Person"
        //   é possível invocar um método de Instância. 
        //   Este método normalmente irá impactar somente neste objeto
        //     referenciado por esta variável (raulzito)

        raulzito.toString();

        // Invocando um método de Classe (Estátigo - Static)
        // Para poder invocar um método desse tipo, 
        //   NÃO é necessário possuir um objeto instanciado
        //   Você pode instanciar apartir do nome da Classe.

        Person lucas = Person.build();
        // Declara-se uma variável do tipo "Person" >> 'Person lucas'
        // Invoca-se o método estático "build()" apartir Person >> 'Person.build()'
        // Atribui o retorno do método na variável ' = ' (no caso uma referência para um objeto Person novo)

        lucas.setName("George Walton Lucas Jr.");

        
    }
}
