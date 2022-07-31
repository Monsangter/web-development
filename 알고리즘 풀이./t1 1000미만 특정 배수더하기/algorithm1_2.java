public class algorithm1_2 {

    public static void main(String args[]) {
        System.out.println("정답은 : " +lesssum(1000));
    }
    public static int lesssum(int x){
        int sum = 0;
       for (int i = 1; i<x;i++){
           if (i % 3 ==0 || i%5 == 0)
           {
               sum += i;
           }
       }
       return sum;
    }
}
