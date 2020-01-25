package com.iampatildipak;

public final class Computer {

    private final String processor;
    private final int ram;
    private final double speed;
    private final int memory;

    public Computer(final String processor, final int ram, final double speed, final int memory) {
        this.processor = processor;
        this.ram = ram;
        this.speed = speed;
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public double getSpeed() {
        return speed;
    }

    public int getMemory() {
        return memory;
    }
}
