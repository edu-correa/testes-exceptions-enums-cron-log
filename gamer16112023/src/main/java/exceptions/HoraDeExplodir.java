package exceptions;

public class HoraDeExplodir {
    public static void main(String[] args) {
        HoraDeExplodir x = new HoraDeExplodir();
        x.haha(5);
    }
    public void haha(int n){
        haha(n - 1);
        System.out.println(n);
    }
}
