public class gato extends animal{
    public int racao;
    @Override
    public int QuantidadeDeRacao() {
        if (peso<=3){
            int racao = 10*peso;
            System.out.println(nome + " deverá comer "+ racao +" gramas de ração");
        }
        else {
            int racao = 13*peso;
            System.out.println(nome + " deverá comer "+ racao +" gramas de ração");
        }
        return racao;
    }

    @Override
    public String som() {
        return "miau! miau!";
    }
}
