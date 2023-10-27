import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crea expresiones
        Expresion expresion1 = new Suma(new Numero(2), new Numero(3), "+");
        Expresion expresion2 = new Multiplicacion(new Suma(new Numero(5), new Numero(5), "+"), new Resta("-", new Numero(3), new Numero(1)), "*");
        Expresion expresion3 = new Division(new Suma(new Numero(7), new Numero(8), "+"), new Resta("-", new Numero(5), new Numero(3)), "/");

        // Obtiene valores de las expresiones
        float valor1 = expresion1.getValor();
        float valor2 = expresion2.getValor();
        float valor3 = expresion3.getValor();

        System.out.println("Valor de expresion1: " + valor1);
        System.out.println("Valor de expresion2: " + valor2);
        System.out.println("Valor de expresion3: " + valor3);

        // Obtiene números y operadores de las expresiones
        List<Float> numeros1 = expresion1.getNumeros();
        List<Float> numeros2 = expresion2.getNumeros();
        List<Float> numeros3 = expresion3.getNumeros();

        List<String> operadores1 = expresion1.getOperadores();
        List<String> operadores2 = expresion2.getOperadores();
        List<String> operadores3 = expresion3.getOperadores();

        System.out.println("Números en expresion1: " + numeros1);
        System.out.println("Números en expresion2: " + numeros2);
        System.out.println("Números en expresion3: " + numeros3);

        System.out.println("Operadores en expresion1: " + operadores1);
        System.out.println("Operadores en expresion2: " + operadores2);
        System.out.println("Operadores en expresion3: " + operadores3);

        // Imprime las expresiones
        String expresionStr1 = expresion1.toString();
        String expresionStr2 = expresion2.toString();
        String expresionStr3 = expresion3.toString();

        System.out.println("Expresion1: " + expresionStr1);
        System.out.println("Expresion2: " + expresionStr2);
        System.out.println("Expresion3: " + expresionStr3);
    }
}