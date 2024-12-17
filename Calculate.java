public class Calculate {
    public static void main (String[] args) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        if (args[0].equals("somar")){
            sum(a, b);
        } else if (args[0].equals("subtrair")){
            minus(a, b);
        } else {
            System.out.println("Nenhuma instrucao definida");
        }
    }

    static void sum (int a, int b) {
        System.out.println(a + b);
    }

    static void minus(int a, int b){
        System.out.println(a - b);
    }
}
