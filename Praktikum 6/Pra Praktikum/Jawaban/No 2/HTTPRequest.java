// Author: Izhar Alif Akbar - 18223129

public class HTTPRequest {
    private String request;

    /**
     * Constructor untuk request
     * 
     * @param request Request yang akan dikirimkan
     */
    public HTTPRequest(String request) {
        this.request = request;
    }

    public boolean validateRequest() throws InvalidRequestException, InvalidMethodException {
        // 1. Cek kosong
        if (request == null || request.isEmpty()) {
            throw new InvalidRequestException("Request cannot be empty");
        }

        // 2. Hitung slash
        int firstSlash = request.indexOf('/');
        int lastSlash = request.lastIndexOf('/');
        if (firstSlash == lastSlash) {
            throw new InvalidRequestException("Request has to have 2 /");
        }

        // 3. Ambil method, path, dan protocol dengan substring dan indexOf
        int space1 = request.indexOf(' ');
        int space2 = request.lastIndexOf(' ');

        // Jika tidak ada dua spasi, maka tidak valid
        if (space1 == -1 || space2 == -1 || space1 == space2) {
            throw new InvalidRequestException("Request format is invalid");
        }

        String method = request.substring(0, space1);
        String path = request.substring(space1 + 1, space2);
        String protocol = request.substring(space2 + 1);

        // 4. Validasi protocol
        if (!protocol.startsWith("HTTP/")) {
            throw new InvalidRequestException("Can only send HTTP request");
        }

        // 5. Validasi method
        if (!method.equals("GET") && !method.equals("POST") &&
            !method.equals("DELETE") && !method.equals("PUT")) {
            throw new InvalidMethodException();
        }

        // 6. Jika lolos semua
        System.out.println("Sending " + method + " method");
        return true;
        /*
         * Implementasi dengan aturan:
         * aturan request
         * - Request tidak boleh kosong ("")
         * - Request harus memiliki 2 buah slash (/)
         * - Request hanya bisa mengirimkan HTTP request
         * - Request hanya bisa mengirimkan metode GET, POST, DELETE dan PUT
         * 
         * "GET /url HTTP/1.1" => request yang benar
         * "" => mengembalikkan pesan "Request cannot be empty"
         * "GET url HTTP1.1" => mengembalikan pesan "Request has to have 2 /", hal yang
         * sama berlaku untuk request yang punya 1 slash
         * "GET /url HTP/1.1" => "Can only send HTTP request"
         * "GWT /url HTTP/1.1" => "Method is invalid"
         * 
         * Apabila request mematuhi seluruh aturan, maka request akan mencetak :
         * "Sending <request method> method"
         * request method type disini adalah GET, POST, DELETE atau PUT yang ada pada
         * request
         * 
         * contoh : "GET /url HTTP/1.1" akan mencetak "Sending GET method"
         * 
         * terakhir, apabila request mematuhi seluruh aturan maka ia akan mengembalikkan
         * nilai true
         */
    }
}

class InvalidRequestException extends Exception {
    public InvalidRequestException(String message) {
        super(message);
    }
}

class InvalidMethodException extends Exception {
    public String getMessage() {
        return "Method is invalid";
        // Implementasi custom message InvalidMethodException
        // Return pesan multak berisi: "Method is invalid"
    }
}