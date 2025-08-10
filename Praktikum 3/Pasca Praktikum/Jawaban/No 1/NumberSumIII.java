import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Author: Izhar Alif Akbar - 18223129

public class NumberSumIII {

    public Number[] numberSumIII(Number[] numbers) {
        Number[] result = new Number[numbers.length]; // array keluaran
        int index = 0;
        
        boolean[] processed = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (!processed[i]) {
            
            Number current = numbers[i];
            boolean tambah = true, kurang = false, kali = false;
            
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j].getClass().equals(numbers[i].getClass()) && !processed[j]) {
                    if (tambah) {
                        current = add(current, numbers[j]);
                        tambah = false;
                         kurang = true;
                    } else if (kurang) {
                        current = subtract(current, numbers[j]);
                        kurang = false;
                         kali = true;
                    } else if (kali) {
                        current = multiply(current, numbers[j]);
                        kali = false; 
                        tambah = true;
                    }
                    processed[j] = true;
                }
            }
            
            result[index++] = current;
            }
        }
        
        while (index < numbers.length) {
            result[index++] = null;
        }
        
        return result;
    } 

    private static Number add(Number a, Number b) {
        if (a instanceof Byte && b instanceof Byte) {
            return (byte) (a.byteValue() + b.byteValue());
        } else if (a instanceof Short && b instanceof Short) {
            return (short) (a.shortValue() + b.shortValue());
        } else if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() + b.intValue();
        } else if (a instanceof Long && b instanceof Long) {
            return a.longValue() + b.longValue();
        } else if (a instanceof Float && b instanceof Float) {
            return a.floatValue() + b.floatValue();
        } else if (a instanceof Double && b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        }
        return 0;
    }

    private static Number subtract(Number a, Number b) {
        if (a instanceof Byte && b instanceof Byte) {
            return (byte) (a.byteValue() - b.byteValue());
        } else if (a instanceof Short && b instanceof Short) {
            return (short) (a.shortValue() - b.shortValue());
        } else if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() - b.intValue();
        } else if (a instanceof Long && b instanceof Long) {
            return a.longValue() - b.longValue();
        } else if (a instanceof Float && b instanceof Float) {
            return a.floatValue() - b.floatValue();
        } else if (a instanceof Double && b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        }
        return 0;
    } 

    private static Number multiply(Number a, Number b){
        if (a instanceof Byte && b instanceof Byte) {
            return (byte) (a.byteValue() * b.byteValue());
        } else if (a instanceof Short && b instanceof Short) {
            return (short) (a.shortValue() * b.shortValue());
        } else if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() * b.intValue();
        } else if (a instanceof Long && b instanceof Long) {
            return a.longValue() * b.longValue();
        } else if (a instanceof Float && b instanceof Float) {
            return a.floatValue() * b.floatValue();
        } else if (a instanceof Double && b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        }
        return 0;
    }
}