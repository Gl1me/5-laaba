import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пример y=3x+5.\nВведите x:");
        int x = scan.nextInt();
        Primer p = new Primer(x, 0, 0);
        p.Sum();

        System.out.println("Пример y=(a+b)/(a-b).\nВведите a:");
        int a = scan.nextInt();
        System.out.println("Введите b:");
        int b = scan.nextInt();
        Primer r = new Primer(0, a, b);
        r.Division();

        System.out.println("Пример y=(ax/b)!.\nВведите a:");
        int a1 = scan.nextInt();
        System.out.println("Введите b:");
        int b1 = scan.nextInt();
        System.out.println("Введите x:");
        int x1 = scan.nextInt();
        Primer i = new Primer(x1, a1, b1);
        i.Factorial();
    }
}

class Primer {
    int x;
    int a;
    int b;

    Primer(int x, int a, int b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    void Sum() {
        System.out.println("Результат выражения y=3x+5:");
        System.out.println(3 * this.x + 5);
    }

    void Division() {
        if (a == b) {
            System.out.println("Ошибка. Деление на 0.");
        } else {
            System.out.println("Результат выражения y=(a+b)/(a-b):");
            double res = (double) (this.a + this.b) / (this.a - this.b);
            System.out.println(res);
        }
    }

    void Factorial() {
        if (b == 0) {
            System.out.println("Ошибка. Деление на 0.");
        } else {
            int res = this.a * this.x / this.b;
            if (res < 0) {
                System.out.println("Ошибка: факториала отрицательного числа не существует");
            } else {
                long fact = 1;
                for (int i = 2; i <= res; i++) {
                    fact *= i;
                }
                System.out.println("Результат выражения y=(ax/b)!:");
                System.out.println(fact);
            }
        }
    }
}