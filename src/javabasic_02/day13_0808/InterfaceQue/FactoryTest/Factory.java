package javabasic_02.day13_0808.InterfaceQue.FactoryTest;

public abstract class Factory {
    private int openHour;
    private int closeHour;
    private String name;

    Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName() {
        return this.name;   // 공장이름 반환
    }

    int getWorkingTime() {
        return this.closeHour - this.openHour; // 공장 가동시간
    }

    abstract int makeProduct(char skill);
}
