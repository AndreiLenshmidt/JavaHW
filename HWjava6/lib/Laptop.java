package HWjava6.lib;

public class Laptop {
    private String laptopName;
    private int ram;
    private String ssd_hdd;
    private int memory;
    private String processorName;
    private int core;
    private double frequency;
    private String videoCardName;
    private String videoMemoryType;
    private int videoMemory;
    private String matrix;
    private int screen;
    private String webCamera;
    //  Метод - конструктор
    public Laptop(String laptopName,int ram, String ssd_hdd, int memory, String processorName, int core, double frequency, String videoCardName, String videoMemoryType, int videoMemory, String matrix, int screen, String webCamera) {
        this.laptopName = laptopName;
        this.ram = ram;
        this.ssd_hdd = ssd_hdd;
        this.memory = memory;
        this.processorName = processorName;
        this.core = core;
        this.frequency = frequency;
        this.videoCardName = videoCardName;
        this.videoMemoryType = videoMemoryType;
        this.videoMemory = videoMemory;
        this.matrix = matrix;
        this.screen = screen;
        this.webCamera = webCamera;
    }
    // Метод который выводит всюинформацию о ноутбуке
    public void showLaptopInformation() {
        System.out.println(laptopName);
        System.out.println(String.format("Объем оперативной памяти: %d", ram));
        System.out.println(String.format("SSD/HDD: %s, Объем накопителя: %d", ssd_hdd, memory));
        System.out.println(String.format("Процессор: %s: %d ядер, частота %3.2f", processorName, core, frequency));
        System.out.println(String.format("Видеоката: %s: %s %d", videoCardName, videoMemoryType, videoMemory));
        System.out.println(String.format("Матрица: %s с диагональю %d", matrix, screen));
        System.out.println(String.format("Вебкамера: %s", webCamera));
    }
    // Метод который выводит информацию о полях, принимает Srting название поля
    public String getInformation(String parametr) {
        if (parametr.equalsIgnoreCase("laptopName")) {
            return laptopName;
        }
        else if (parametr.equalsIgnoreCase("ram")) {
            return String.valueOf(ram);
        }
        else if (parametr.equalsIgnoreCase("SSD")) {
            return ssd_hdd;
        }
        else if (parametr.equals("HDD")) {
            return ssd_hdd;
        }
        else if (parametr.equalsIgnoreCase("memory")) {
            return String.valueOf(memory);
        }
        else if (parametr.equalsIgnoreCase("processorName")) {
            return processorName;
        }
        else if (parametr.equalsIgnoreCase("core")) {
            return String.valueOf(core);
        }
        else if (parametr.equalsIgnoreCase("frequency")) {
            return String.valueOf(frequency);
        }
        else if (parametr.equalsIgnoreCase("videoCardName")) {
            return videoCardName;
        }
        else if (parametr.equalsIgnoreCase("videoMemoryType")) {
            return videoMemoryType;
        }
        else if (parametr.equalsIgnoreCase("videoMemory")) {
            return String.valueOf(videoMemory);
        }
        else if (parametr.equalsIgnoreCase("matrix")) {
            return matrix;
        }
        else if (parametr.equalsIgnoreCase("screen")) {
            return String.valueOf(screen);
        }
        else if (parametr.equalsIgnoreCase("webCamera")) {
            return webCamera;
        }
        
        return "Такого параметра нет";
    }
}
