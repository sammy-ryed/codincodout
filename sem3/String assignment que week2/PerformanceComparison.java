import java.util.Scanner;
public class PerformanceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        testString(iterations);
        testStringBuilder(iterations);
        testStringBuffer(iterations);
        sc.close();
    }
    public static void testString(int iterations){
        long start = System.currentTimeMillis();
        String s = "";
        for(int i=0; i<iterations; i++) s += "Java";
        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end-start) + "ms, Length: " + s.length());
    }
    public static void testStringBuilder(int iterations){
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<iterations; i++) sb.append("Java");
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end-start) + "ms, Length: " + sb.length());
    }
    public static void testStringBuffer(int iterations){
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<iterations; i++) sb.append("Java");
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end-start) + "ms, Length: " + sb.length());
    }
}