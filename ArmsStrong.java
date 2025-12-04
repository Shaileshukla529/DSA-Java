public class ArmsStrong {
    static public int  isArm(int n,int count){
     if (n ==0){
        return 0;
     }
     System.out.println(count);
     return (int) Math.pow(n%10, count)+ isArm(n/10, count);

    }
  
    public static void main(String[] args) {
        int n = 944;
        int copy = n;
        int count = 0;
        while (copy>0){
            copy = copy/10;
            count +=1;
        }
        int r = isArm(n,count);
        if (r==n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }
    }
}
