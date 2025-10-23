public class square_pattern {
    public void pat(int q){
        for(int i=0;i<q;i++){
            for(int j=0;j<q;j++){
                if(i==0||i==q-1||j==0||j==q-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                if(j!=q-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        square_pattern nw = new square_pattern();
        nw.pat(5);
    }
}
