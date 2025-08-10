/**
 * Apel.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author 18223129 Izhar Alif Akbar | 18223111 Nicholas Zefanya
 */

public class Apel extends Handphone {
	public Apel() {
		super("Apel", 10000000, 6);
	}

	@Override
	public Boolean tawar(Integer hargaTawaran) {
		return false;
	}

	@Override
	public void printSpeciality() {
        System.out.println("Stylish nih bos");
		// Print (tanpa tanda kutip, diakhiri newline):
		// "Stylish nih bos"
	}
}