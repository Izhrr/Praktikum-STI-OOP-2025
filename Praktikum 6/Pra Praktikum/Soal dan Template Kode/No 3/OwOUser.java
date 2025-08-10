public class OwOUser {
    private String username;
    private double balance;

    /**
     * Constructor untuk OwOUser dengan username
     * Balance diinisialisasi dengan 0
     * 
     * @param username Username
     */
    public OwOUser(String username) {
    }

    /**
     * Constructor untuk OwOUser dengan username dan balance
     * 
     * @param username Username
     * @param balance  Balance
     * @throws InvalidParameterException dengan pesan "Balance tidak boleh negatif"
     */
    public OwOUser(String username, double balance) throws InvalidParameterException {
    }

    /**
     * Fungsi untuk melakukan top up balance
     * 
     * @param amount Jumlah yang akan ditambahkan ke balance
     * @throws InvalidTopUpAmountException dengan pesan "Top up minimal 1000"
     */
    public void topUp(double amount) throws InvalidTopUpAmountException {
    }

    /**
     * Fungsi untuk melakukan pembayaran
     * 
     * @param amount Jumlah yang akan dibayarkan
     * @throws InvalidParameterException dengan pesan "Pembayaran tidak boleh negatif"
     * @throws InsufficientBalanceException dengan pesan "Saldo tidak cukup"
     */
    public void pay(double amount) throws InvalidParameterException, InsufficientBalanceException {
    }

    /**
     * Fungsi untuk mengecek balance
     * 
     * Fungsi ini akan mencetak username dan balance dengan format:
     * Username: <username>
     * Balance: <balance>
     * 
     * Gunakan System.out.println untuk mencetak username dan balance
     */
    public void checkBalance() {
    }
}
