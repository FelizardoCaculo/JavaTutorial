public class BooleanDataType{
    publi static void main(String[] args){
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        int x = 10;
        int y = 20;
        int minhaIdade = 36;
        int idadeParaVotar = 18;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        System.out.println("x > y = " + x > y);
        System.out.println("x < y = " + x < y);
        System.out.println("x == y = " + x == y);
        System.out.println(minhaIdade >= idadeParaVotar);
        if (minhaIdade >= idadeParaVotar) {
            Sytem.out.println("Minha idade me permite votar!");
        } else {
            System.out.println("Minha idade não me permite votar!");
        }
    }
}