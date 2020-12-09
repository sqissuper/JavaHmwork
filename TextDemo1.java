import java.util.Scanner;

public class TextDemo1 {
    //青蛙跳台
//    public static int jump(int n){
//        if(n == 1 || n == 2){
//            return 1;
//        }else{
//            return jump(n -  1) + jump(n - 2);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        System.out.println(jump(N));
//    }

    //汉诺塔
//    public static void hnt(int n,char ps1,char ps2, char ps3){
//        if(n == 1){
//            System.out.print(ps1 + "->" + ps3 + " ");
//        }else{
//            hnt(n - 1,ps1,ps3,ps2);
//            System.out.print(ps1 + "->" + ps3 + " ");
//            hnt(n - 1, ps2,ps1,ps3);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        hnt(n,'A','B', 'C');
//    }
//    public static void move(char ps1,char ps2){
//        System.out.println(ps1+"->"+ps2);
//    }
//    public static void hnt(int n,char ps1,char ps2,char ps3){
//        if(n == 1){
//            move(ps1,ps3);
//        }
//        hnt(n - 1,ps1,ps3,ps2);
//        move(ps1,ps3);
//        hnt(n - 1,ps2,ps1,ps3);
//    }
//    public static void main(String[] args){
//        hnt(3,'A','B','C');
//        System.out.println();
//    }

    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
//    public static int getOne(int[] arr){
//        int num = 0;
//        for(int i = 0; i < arr.length; i++){
//            num ^= arr[i];
//        }
//        return num;
//    }
//    public static void main(String[] args){
//        int[] arr = {3, 2, 1, 5, 3, 5, 2};
////        int num = 0;
////        int i;
////        for(i = 0; i < arr.length; i++){
////            num ^= arr[i];
////        }
//        System.out.println(getOne(arr));
//    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
//    public static void main(String[] args){
//        int i;
//        int[] arr = {2,3,4,1,5,6,7};
//        for(i = 0; i < arr.length; i++){
//            for(int j = i+1; j < arr.length;j++){
//                if(arr[i] % 2 == 0 && arr[j] % 2 == 1){
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        for(i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }


    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
//    public static int add(int x, int y){
//        return x + y;
//    }
//    public static double add(double x, double y, double z){
//        return x + y + z;
//    }
//    public static void main(String[] args){
//
//        int n = 1,m = 2;
//        double a = 1.234, b = 2.345, c = 3.456;
//
//        System.out.println(add(n,m));
//        System.out.println(add(a,b,c));
//    }



    //递归求斐波那契数列的第 N 项
//    public static int Fib(int n){
//        int f1 = 1;
//        int f2 = 1;
//        int f3 = 1;
//        if(n < 3){
//            return 1;
//        }else{
//            for(int i = 3; i <= n; i++){
//                f3 = f1 + f2;
//                f1 = f2;
//                f2 = f3;
//            }
//        }
//        return f3;
////        if(n == 1 || n == 2){
////            return 1;
////        }
////        return Fib(n - 1) + Fib(n - 2);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(Fib(n));
//    }


    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
//    public static int sum(int n){
//        if(n > 9){
//            return n % 10 + sum(n / 10);
//        }
//        return n;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(sum(n));
//    }
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
//    public static void printNum(int x){
//        if(x > 9){
//            printNum(x / 10);
//        }
//        System.out.print(x % 10 + " ");
//
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printNum(n);
//    }

    //递归求 1 + 2 + 3 + ... + 10
//    public static int sum(int x){
//        if(x == 1){
//            return 1;
//        }else{
//            return x + sum(x - 1);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(sum(n));
//    }
//递归求 N 的阶乘
//    public static int fac(int n){
//        if(n == 1){
//            return 1;
//        }else {
//            return n * fac(n - 1);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(fac(n));
//    }


    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系


//    public static double max(double x,double y){
//        return x > y ? x : y;
//    }
//    public static int max(int x,int y){
//        return x > y ? x : y;
//    }
//    public static void main(String[] args){
//        double a = 2.2341;
//        double b = 4.5643;
//        int c = 3;
//        int d = 4;
//        System.out.println(max(c,d));
//        System.out.println(max(a,b));
//        //System.out.println(max(max(a,b),c));
//    }


    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //
    //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
//    public static int max3(int x,int y,int z){
//        int max = 0;
//        if(max2(x,y) > z){
//            max = max2(x,y);
//        }else{
//            max = z;
//        }
//        return max;
//    }
//    public static int max2(int x, int y){
//        int max = 0;
//        if(x > y){
//            max = x;
//        }else{
//            max = y;
//        }
//        return max;
//    }
//    public static void main(String[] args){
//        int n,m,k;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        k = sc.nextInt();
//        System.out.println("较大值为：" + max3(n,m,k));
//    }


    //打印阶乘
//    public static int fac(int n){
//        int ret = 1;
//        for(int i = 1; i <= n; i++){
//            ret *= i;
//        }
//        return ret;
//    }
//    public static int sum(int num){
//        int sum = 0;
//        for(int i = 1; i <= num; i++){
//            sum += fac(i);
//        }
//        return sum;
    //}
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        System.out.println(fac(n));
//    }

}
