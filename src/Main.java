import java.util.Scanner;

class Print{
    public
    String enter(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return str;
    }
    int enter_int() {
        Scanner s = new Scanner(System.in);
        int str = s.nextByte();
        return str;
    }
    double enter_d(){
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble();
        return d;
    }
    void print(String str){
        System.out.print("\nВаш друг живёт по тарифу " + str);
    }
    void print(int str){
        System.out.print("\nТы на расстоянии " + str + " световых лет");
    }

    void print(String str, String ss){
        System.out.print("\nШла женьщина с " + str + ", около неё шёл ребёнок" +
                ", держа в руках "+ ss);
    }
    void print(int i, String str, double x, double y){
        System.out.print("\nНа широте " + x +
        " по долготе " + y + " исптали тайные орудия под названием" + str);
    }
    void print(int i, String str){
        System.out.print("\nВчера у зданиея № " + i + " Колька танцевал с " + str+'\n');
    }
    Print(){
        System.out.print("\nВведите слово\n");
        print(enter());

        System.out.print("\nВведите цифру\n");
        print(enter_int());

        System.out.print("\nВведите два слова\n");
        print(enter(),enter());

        System.out.print("\nВведите цифру, слово, два вещественных числа\n");
        print(enter_int(),enter(), enter_d(), enter_d());

        System.out.print("\nВведите цифру и слово\n");
        print(enter_int(), enter());
    }
}
class Calc{
    public
    int enter_i(){
        Scanner s = new Scanner(System.in);
        int i = s.nextByte();
        return i;
    }
    double enter_d(){
        Scanner s = new Scanner(System.in);
        double i = s.nextDouble();
        return i;
    }
    long enter_l(){
        Scanner s = new Scanner(System.in);
        long i = s.nextLong();
        return i;
    }

    int min(int i, int j){ return Math.min(i,j); }
    double min(double a, double b){ return Math.min(a, b); }
    long min(long a, long b){ return Math.min(a,b); }
    Calc(){
        System.out.print("\nузнаём минимальное из двух чисел\n");
        System.out.print("\nВведите два целых числа\n");
        min(enter_i(), enter_i());
        System.out.print("\nВведите два вещественных(double) числа\n");
        min(enter_d(), enter_d());
        System.out.print("\nВведите два вещественных(long) числа\n");
        min(enter_l(), enter_l());
    }
}
class Main{
    static void print(int i){
        System.out.print("\nIQ блохи " + i + ". Hе так ли?\n");
    }
    static void print(Integer j){
        System.out.print("\nПлощадь луны = "+ j + "\n");
    }
    public static void main(String argc[]){
        Print p = new Print();
        int gg = 123;
        Integer g = 777;
        print(gg);
        print(g);

        Calc c = new Calc();
    }
}