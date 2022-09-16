public class Boolean {

    public static void main(String[] args){
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosPraia);

        //ternario
        String mensagem = fimDeSemana ? "Oba" : "Nhé";
        System.out.println(mensagem);
    }
}
