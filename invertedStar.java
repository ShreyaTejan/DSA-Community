public class invertedStar {
    public static void main(String[] args) {
        int total = 4;
        for(int line =1; line <= total; line++){
            for(int str=1; str <= (total - line+1); str++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
