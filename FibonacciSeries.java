public class FibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries obj = new FibonacciSeries();
        int N = 4;
        boolean res = obj.isFibonacci(N);
        System.out.println(res);
    }
    
    public boolean isPerfectSquare(int N){
        int s = (int) Math.sqrt(N);
        return s*s == N ;
    }
    
    public boolean isFibonacci(int N){
        // A number is Fibonacci if and only if one or both of (5 * n^2 + 4) or (5 * n^2 - 4) is a perfect square
        return isPerfectSquare(5*N*N+4) || isPerfectSquare(5*N*N-4);
    }
}
