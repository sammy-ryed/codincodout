public class StringPerformanceComparison {
    public static void main(String[] args) {
        long start = System.nanoTime();
        concatenateWithString(1000);
        long end = System.nanoTime();
        System.out.println("String time: " + (end-start));

        start = System.nanoTime();
        concatenateWithStringBuilder(1000);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end-start));

        start = System.nanoTime();
        concatenateWithStringBuffer(1000);
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end-start));
    }

    public static String concatenateWithString(int iterations){
        String result = "";
        for(int i=0; i<iterations; i++){
            result += "Java " + i + " ";
        }
        return result;
    }
    public static String concatenateWithStringBuilder(int iterations){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<iterations; i++){
            sb.append("Java ").append(i).append(" ");
        }
        return sb.toString();
    }
    public static String concatenateWithStringBuffer(int iterations){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<iterations; i++){
            sb.append("Java ").append(i).append(" ");
        }
        return sb.toString();
    }
}