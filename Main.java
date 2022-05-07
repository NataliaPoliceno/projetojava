public class Main {
    public static void  main (String[] args) {
        //calculadora.soma
        System.out.println("exercicio calculadora");
        Calculadora.soma(1,3);
        Calculadora.subtracao(6,9);
        Calculadora.multiplicacao(3,7);
        Calculadora.divisao(2,5);

        System.out.println("exercicio menssagem");
        Menssagem.obtermenssagemin(9);
        Menssagem.obtermenssagemin(17);
        Menssagem.obtermenssagemin(23);
        
        System.out.println("exercicio emprestimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

     }
}

    

    
