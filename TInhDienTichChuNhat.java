import java.util.Scanner;

public class TInhDienTichChuNhat {

    public static void main(String[] args) {

        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Width: ");
        width = scanner.nextFloat();


        System.out.println("Nhap Height: ");
        height = scanner.nextFloat();


        float area = width * height;
        System.out.println("Area: " + area);
    }

}
