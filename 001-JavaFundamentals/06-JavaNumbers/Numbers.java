public class Numbers {
    public static void main(String[] args){
        /*
         * A escolha do tipo primitivo depende do valor numérico
         */
        // para valores inteiros
        byte idade = 36;
        short ano = 1987;
        int superficieAngola = 1246700;
        long distanciaTerraLua = 21474836415622L;
        // para valores de ponto flutuante
        float peso = 76.5f;
        double distanciaTerraNuvens = 12434655.25d;

        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("Superfície de Angola: " + superficieAngola);
        System.out.println("Distância da Terra para a Lua: " + distanciaTerraLua);
        System.out.println("Peso: " + peso);
        System.out.println("Distância da Terra para as nuvens: " + distanciaTerraNuvens);
    }
}
