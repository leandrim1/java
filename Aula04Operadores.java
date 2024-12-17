public class Aula04Operadores {
    public static void main(String[] args){
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        int idade2 = 35;
        float salario2 = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta2 = idade2 >= 30 || salario2 >= 4612;
        boolean isDentroDaLeiMenorQueTrinta2 = idade2 < 30 || salario2 >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta2 "+isDentroDaLeiMaiorQueTrinta2);
        System.out.println("isDentroDaLeiMenorQueTrinta2 "+isDentroDaLeiMenorQueTrinta2);
        
    }
}
