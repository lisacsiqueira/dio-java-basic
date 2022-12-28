public class Aula1_4 {

    // metodos: 
    /*
     *  Tipo de retorno
     * parametros
     * tipoRetorno Nome
    */

    public static void main (String [] args) {
        String nome01 = "maria";
        String nome02 = "carla";

        String nomeCompleto = nomeCompleto( nome01, nome02);

        System.out.println(nomeCompleto);
    }

    public static String  nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}