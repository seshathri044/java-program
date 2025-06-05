public class even_odd {
    public void disp(int a){
        if(a%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
    public static void main(String [] args){
        int x = 10;
        even_odd nw = new even_odd();
        nw.disp(x);
    }
}
