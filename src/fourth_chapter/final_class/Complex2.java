package fourth_chapter.final_class;

// Неизменяемый класс со статическими фабриками вместо конструкторов
public class Complex2 {
    private final double real;
    private final double imaginary;

    private Complex2(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex2 valueOf(double real, double imaginary) {
        return new Complex2(real, imaginary);
    }
}
