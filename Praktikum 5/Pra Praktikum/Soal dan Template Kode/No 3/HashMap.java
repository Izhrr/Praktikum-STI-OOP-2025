class HashMap<K, V> implements Map<K, V> {
    private static final int BUCKET_SIZE = 100;
    @SuppressWarnings("unchecked")
    private LinkedList<KeyValue<K, V>>[] buckets = new LinkedList[BUCKET_SIZE];

    HashMap() {
        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets[i] = new LinkedList<KeyValue<K, V>>();
        }
    }

    public static class KeyValue<K, V> {
        private K key;
        private V value;

        public KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    /**
     * Hash function untuk Key
     * Gunakan method ini untuk menentukan lokasi penyimpanan Key-Value pada buckets
     * @param key
     * @return nilai hash dari key
     */
    private int getKeyHash(K key) {
        return (key.hashCode() % BUCKET_SIZE + BUCKET_SIZE) % BUCKET_SIZE;
    }

    /**
     * Menyimpan nilai (key, value) ke dalam map
     * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        
    }

    /**
     * Mengembalikan value yang tersimpan untuk key tertentu pada map
     * Mengembalikan null apabila map tidak mengandung key masukan.
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
        
    }

    /**
     * @return banyak elemen di dalam map
     */
    @Override
    public int size() {
        
    }

    /**
     * Menghapus semua elemen yang ada pada map
     */
    @Override
    public void clear() {
        
    }

    /**
     * Mengembalikan true apabila terdapat elemen dengan Key = key di dalam map, dan false bila tidak
     * @param key
     * @return
     */
    @Override
    public boolean containsKey(K key) {
        
    }

    /**
     * Menghapus elemen dengan Key = key dari map jika ada
     * @param key
     */
    @Override
    public void remove(K key) {
        
    }
}
