package javabasic_02.day13_0808.InterfaceQue.FactoryTest;

public class CarFactory extends Factory implements IWorkingTogether {

    CarFactory() {

    }

    CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProduct(char skill) {
        switch (skill) {
            case 'A':
                return 3 * super.getWorkingTime();
            case 'B':
                return 2 * super.getWorkingTime();
            case 'C':
                return super.getWorkingTime();
            default:
                return 0;
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((CarFactory) partner).makeProduct('B'); // 어렵고 중요한 부분.
    }
}
