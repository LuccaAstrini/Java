package com.mycompany.interfacefuncionais;

public class InterfaceFuncionais {

    public static void main(String[] args) {

        //class anonima
        Exemplo ex = new Exemplo() {
            @Override
            public void saudacao(String s1) {
                System.out.println("Bom Feriado! \n" + s1);
            }
        };
        ex.saudacao("Quinta serie");
        
        //lambda
        Exemplo ex1 = arg->System.out.println("Bem melhor! "+arg);
        ex1.saudacao("Certo?");
    }
}
