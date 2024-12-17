public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean

        int idade = 10; // Numeros Inteiros (4 bytes)
        long numeroGrande = 1000000000L; // Numeros Inteiros (8 bytes)
        double salarioDouble = 2000.0D; // Numeros Decimas (8 bytes)
        float salarioFloat = 2500.0F; // Numeros Decimais (4 bytes)
        byte idadeByte = 127; // 1 byte (-128 ate 127)
        short idadeShort = 32767; // 2 bytes (-32768 ate 32767)
        boolean verdadeiro = true; // 1 byte (true ou false)
        char caractere = '\u0041'; // 2 bytes (Tabela ASCII)
        String nome = "Goku";
        var nome2 = "Vegeta";

        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println("Oi meu nome é: " + nome);
        System.out.println("Oi meu nome é: " + nome2);
    }
}
