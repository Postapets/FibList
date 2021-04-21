import java.util.ArrayList;

public class Main {
    public static ArrayList<Long> FList = new ArrayList();
    static long nFib(int n) {
        //Проверка на выход из рекурсии
        if (n == 0 || n == 1)
            return 1;
        //Вычисление очередного значения
        return FList.get(n - 1) + FList.get(n - 2);
    }

    public static void main(String[] args) {
        int n = 15;
        //Каждое вычисленное значение
        for (int i = 0; i<n; i++){
            FList.add(nFib(i));
        }

        for (Long list : FList) {
            System.out.println(list);
        }
    }
}
