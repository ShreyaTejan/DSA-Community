public class numPattern {
    //HALF PYRAMID
    public static void main(String[] args) {
        int r=4;
        
        for(int line=1; line <= r; line++){
            for(int num=1; num <=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
