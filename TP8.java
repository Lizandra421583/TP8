public class TP8 {
    
    private int[] ArrayA = new int[10];
    private int[] ArrayB = new int[10];
    private int posicao;
    private int valor;
    private int a;
    private int b;
    private float c;
    
    
    public int[] getArrayA(){
        return ArrayA;
    }
    public void setArrayA(int[] ArrayA){
        this.ArrayA = ArrayA;
    }
    public void setArrayANaPosicao(int posicao, int valor){
        try{
            ArrayA[posicao] = valor;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exceção Capturada: Posição inexistente. Digite um valor entre 0(zero) e 9.");
        }
    }
    
    
    public int[] getArrayB(){
        return ArrayB;
    }
    public void setArrayB(int[] ArrayB){
        this.ArrayB = ArrayB;
    }
    public void setArrayBNaPosicao(int posicao, int valor){
        try{
            ArrayB[posicao] = valor;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exceção Capturada: Posição inexistente. Digite um valor entre 0(zero) e 9.");
        }
    }
    
    
    public void calcula(int a, int b){
        try{
            c = a/b;
            if (c == 0) throw new NumberFormatException();
        }
        catch(ArithmeticException e){
            System.out.println(" Exceção Capturada: Não é possível fazer uma divisão por zero.");
        }
        catch(NumberFormatException e){
            System.out.println(" Exceção Capturada: Divisão igual a zero.");
        }
        finally{
            if (c != 0) {
                System.out.println(" Resultado da divisão: "+(float)c);
            }
            System.out.println(" numerador = "+a);
            System.out.println(" denominador = "+b);
            System.out.println("");
        }
    }    
    
    public void CalculaDivisaoArrays(int[] ArrayA, int[] ArrayB){
        for (int i = 0; i < 10 ; i++){
        System.out.println("Arrays na posição "+i);
        a = ArrayA[i];
        b = ArrayB[i];
        calcula(a, b);
        }
    }
}
