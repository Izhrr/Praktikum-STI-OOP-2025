/**
 * Huawoi.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author 18223129 Izhar Alif Akbar | 18223111 Nicholas Zefanya
 */

public class Huawoi extends Handphone {
	private Boolean isKW;

	public Huawoi(Boolean isKW) {
        super("Huawoi", 5000000, 4);
        this.isKW = isKW;
        if(isKW){
            super.setNama("Huawoi KW");
            super.setHarga(2000000);
            super.setRam(2);
        }
	}

	@Override
	public Boolean tawar(Integer hargaTawaran) {
        if(isKW){
            return hargaTawaran >= (2000000 - 1000000);
        }
        else{
		    return hargaTawaran >= (5000000 - 1000000);
        }
	}

	@Override
	public void printSpeciality() {
        if(isKW){
            System.out.println("HPnya murah bos");
        }
        else{
            System.out.println("Speknya kenceng bos");
        }
		// Bila isKW = true, Print (tanpa tanda kutip, diakhiri newline) "HPnya murah
		// bos"
		// Bila isKW = false, Print (tanpa tanda kutip, diakhiri newline) "Speknya
		// kenceng bos"
	}
}