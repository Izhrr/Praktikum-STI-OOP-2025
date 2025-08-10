/**
 * Pipo.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author 18223129 Izhar Alif Akbar | 18223111 Nicholas Zefanya
 */

public class Pipo extends Handphone {
	private String camera;

	public Pipo(String camera) {
		super("Pipo", 3000000,3 );
        this.camera = camera;
	}

	@Override
	public Boolean tawar(Integer hargaTawaran) {
		return hargaTawaran >= 2500000;
	}

	@Override
	public void printSpeciality() {
        System.out.println("Kamera ni HP " + camera);
		// Print (tanpa tanda kutip, diakhiri newline):
		// "Kamera ni HP " + camera
	}
}