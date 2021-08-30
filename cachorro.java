public class cachorro extends animal{

    public int racao;

    @Override
    public int QuantidadeDeRacao() {
        if (peso<=4){
            int racao = 40*peso;
            System.out.println(nome + " deverá comer "+ racao +" gramas de ração");
        }
        else if (peso<=12 || peso>4){
            int racao = 45*peso;
            System.out.println(nome + " deverá comer "+ racao +" gramas de ração");
        }
        else if(peso>12){
            int racao = 55*peso;
            System.out.println(nome + " deverá comer "+ racao +" gramas de ração");
        }
        return racao;
    }

    @Override
    public String som() {
        return "Au! au!";
    }
}
