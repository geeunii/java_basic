package javabasic_02.day13_0808.InterfaceQue.FactoryTest;

public class TVFactory extends Factory implements IWorkingTogether {

    TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProduct(char skill) {
        switch (skill) {
            case 'A':
                return 8 * super.getWorkingTime();
            case 'B':
                return 5 * super.getWorkingTime();
            case 'C':
                return 3 * super.getWorkingTime();
            default:
                return 1;
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((TVFactory) partner).makeProduct('C'); // 어렵고 중요한 부분.
    }
}
