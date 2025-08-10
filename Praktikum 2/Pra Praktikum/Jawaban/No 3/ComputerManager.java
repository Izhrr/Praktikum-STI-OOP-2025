import java.util.ArrayList;
import java.util.List;

// Author: Izhar Alif Akbar - 18223129

public class ComputerManager {
    private List<Computer> list = new ArrayList<Computer>();

    /**
     * Menambahkan komputer ke array
     * 
     * @param computer objek Computer
     */
    public void addComputer(Computer computer) {
        list.add(computer);
    }

    /**
     * Menyalakan monitor semua komputer yang mempunyai monitor 
     * dengan metode turnOnMonitor
     */
    public void turnOnAllMonitors() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Monitor) {
                ((Monitor) list.get(i)).turnOnMonitor();
            }
        }
    }

    /**
     * Mematikan monitor semua komputer yang mempunyai monitor 
     * dengan metode turnOffMonitor
     */
    public void turnOffAllMonitors() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Monitor) {
                ((Monitor) list.get(i)).turnOffMonitor();
            }
        }
    }

    /**
     * Mencetak spesifikasi semua komputer
     * dengan metode printSpecification
     */
    public void printAllSpecifications() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).printSpecification();
        }
    }

    /**
     * Memindahkan semua komputer yang portable
     * dengan metode move
     */
    public void moveAllPortableComputers() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Portable) {
                ((Portable) list.get(i)).move();
            }
        }
    }

    /**
     * Menggunakan keyboard semua komputer yang memiliki keyboard
     * dengan metode useKeyboard
     */
    public void useAllKeyboards() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Keyboard) {
                ((Keyboard) list.get(i)).useKeyboard();
            }
        }
    }

}