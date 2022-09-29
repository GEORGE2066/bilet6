public class Method {
    public static void check(int[] list1) {
        if (list1.length < 7) {
            throw new IllegalStateException("Размер массива счишком мал");
        } else {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] % 2 == 0) {
                    list1[i] = list1[i] + 1;
                }
            }
            for (int i = 2; i < 7; i++) {
                System.out.println(list1[i]);
            }
        }
    }
}
