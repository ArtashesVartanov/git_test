public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 200, 300,500};
        SalesManager salesManager = new SalesManager(arr);


        int max = salesManager.max();
        System.out.println(max);


    }
}
