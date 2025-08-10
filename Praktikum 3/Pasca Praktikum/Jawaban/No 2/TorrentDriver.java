import java.util.Scanner;

// Author: Izhar Alif Akbar - 18223129

public class TorrentDriver {

    private static void printSeparator() {
        System.out.println("------------");
    }

    /**
     * Method helper untuk mencetak elemen array
     * @param array
     */
    private static void printArrayElements(Object[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(String.format("%s, ", array[i]));
        }
        if (array.length > 0) {
            System.out.println(array[array.length - 1]);
        }
    }

    /**
     * Method helper untuk mencetak elemen array
     * @param array
     */
    private static void printArrayElements(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(String.format("%d, ", array[i]));
        }
        if (array.length > 0) {
            System.out.println(array[array.length - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tahap 1
        String fileName = scanner.nextLine();
        int numPeers = Integer.parseInt(scanner.nextLine());

        // Tahap 2
        TorrentPeer[] peers = new TorrentPeer[numPeers];
        for (int i = 0; i < numPeers; i++) {
            String[] chunkInput = scanner.nextLine().split(" ");
            int[] chunks = new int[chunkInput.length];
            for (int j = 0; j < chunkInput.length; j++) {
                chunks[j] = Integer.parseInt(chunkInput[j]);
            }
            peers[i] = new TorrentPeer("Peer" + (i + 1), chunks);
        }

        for (TorrentPeer peer : peers) {
            System.out.print(peer.name + " memiliki chunk: ");
            printArrayElements(peer.chunks);
        }
        printSeparator();

        // Tahap 3
        boolean[] uniqueChunks = new boolean[100];
        int totalUniqueChunks = 0;
        for (TorrentPeer peer : peers) {
            for (int chunk : peer.chunks) {
                if (!uniqueChunks[chunk]) {
                    uniqueChunks[chunk] = true;
                    totalUniqueChunks++;
                }
            }
        }

        // Tahap 4
        StringBuilder fileBuilder = new StringBuilder();
        for (int chunk = 1; chunk < uniqueChunks.length; chunk++) {
            if (uniqueChunks[chunk]) {
                for (TorrentPeer peer : peers) {
                    if (peer.hasChunk(chunk)) {
                        System.out.printf("Mengunduh chunk %d dari %s...\n", chunk, peer.name);
                        fileBuilder.append(String.format("[Chunk-%d]", chunk));
                        break;
                    }
                }
            }
        }
        printSeparator();

        // Tahap 5: Menyusun kembali file
        System.out.println("Semua chunk berhasil diunduh!");
        System.out.println("Menyusun kembali file...");
        System.out.printf("File %s berhasil direkonstruksi dari %d chunk.\n", fileName, totalUniqueChunks);
        System.out.println("Isi rekontruksi file: " + fileBuilder.toString());

        scanner.close();
    }
}