public class BmiService {

    // Индекс = масса (кг)/ рост(м2) = (масса (кг) * 10_000) / рост(см2)
    public int calculate(int weightKilo, int heightСentimeters) {
        return (weightKilo * 10_000) / (heightСentimeters * heightСentimeters);
    }
}
