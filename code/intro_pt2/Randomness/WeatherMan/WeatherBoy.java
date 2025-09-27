package intro_pt2.Randomness.WeatherMan;

import java.util.Random;

public class WeatherBoy
{
    private Random random;

    public WeatherBoy() {
        this.random = new Random();
    }

    public String forecast() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "It rains";
        } else if (probability <= 0.4) { // 0.1 + 0.3
            return "It snows";
        } else { // rest, 1.0 - 0.4 = 0.6
            return "The sun shines";
        }
    }

    public int makeAForecast() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }

    public static void main(String[] args) {
        Random random1 = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println((int) (2 * random1.nextGaussian()) - 2);
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.println((int) (2 * random1.nextGaussian()));
        }
    }
}
