public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Souvik");
        sb.append("Anamika");
        System.out.println(sb);
        sb.insert(3, "hi");
        System.out.println(sb);
    }
}
