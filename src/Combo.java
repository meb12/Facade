public class Combo {

    private Burguer burguer = new Burguer();
    private Bebida bebida = new Bebida();
    private Sobremesa sobremesa = new Sobremesa();

    public int CriarCombo(int tipo){
        if (tipo == 1){
            burguer.setGramas(200);
            bebida.setMl(00);
            sobremesa.Sobremesa("Medio");
            burguer.setPreco(13.00);
            burguer.setDescricao("Lanche: X-Egg-"+burguer.getGramas()+"gr "+"R$"+burguer.getPreco()+"/");
            bebida.setPreco(12.00);
            bebida.setDescricao("Bebida: Soda-"+bebida.getMl()+"ml "+"R$"+bebida.getPreco()+"/");
            sobremesa.setPreco(11.00);
            sobremesa.setDescricao("Sobremesa: Pudim-"+sobremesa.getTamanho()+" R$"+sobremesa.getPreco()+"/");
        } else if (tipo == 2) {
            burguer.setGramas(400);
            bebida.setMl(500);
            sobremesa.Sobremesa("Grande");
            burguer.setPreco(25.00);
            burguer.setDescricao("Lanche: X-Salada-"+burguer.getGramas()+"gr "+"R$"+burguer.getPreco()+"/");
            bebida.setPreco(13.00);
            bebida.setDescricao("Bebida: Fanta Uva-"+bebida.getMl()+"gr "+"R$"+bebida.getPreco()+"/");
            sobremesa.setPreco(19.00);
            sobremesa.setDescricao("Sobremesa: Sorvete de chocolate-"+sobremesa.getTamanho()+" R$"+sobremesa.getPreco()+"/");
        }
        return tipo;
    }
    @Override
    public String toString(){
        return burguer.getDescricao() + bebida.getDescricao() + sobremesa.getDescricao();
    }
}