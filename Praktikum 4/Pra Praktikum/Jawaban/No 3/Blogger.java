// Author: Izhar Alif Akbar - 18223129

public class Blogger implements Poster {
    private String blogName;
    private int maxBlogs = 100;
    private Blog blogs[];
    private int blogCount = 0;

    private int maxSubscribers = 100;
    private Subscriber[] subscribers;
    private int subscriberCount = 0;

    /** 
     * KONSTRUKTOR - Menciptakan objek Blogger baru dengan subscribers kosong.
     * 
     * @param name: Nama dari Blogger
     */
    public Blogger(String name) {
        blogName = name;
        if(blogs == null){
            blogs = new Blog[maxBlogs];
            blogCount = 0;
        }
        if(subscribers == null){
            subscribers = new Subscriber[maxSubscribers];
            subscriberCount = 0;
        }
    }

    /** Metode yang akan mengembalikan list subscriber */
    public Subscriber[] getSubscribers() {
        return subscribers;
    }

    /** Metode yang akan mengembalikan jumlah subscriber. */
    public int getSubscriberCount() {
        return subscriberCount;
    }

    /** Metode yang akan mengembalikan list blog milik blogger. */
    public Blog[] getBlogs() {
        return blogs;
    }

    /** 
     * Metode untuk menambahkan konten baru ke akun dan menotifikasi seluruh subscriber. Jika blog sudah mencapai maksimum
     * maka tidak akan menambah apa-apa.
     * 
     * Notifikasi ke subscriber akan diberikan dalam format berikut:
     * "Blog {blogName} telah mengunggah blog baru dengan judul {blog.getTitle()}"
     * 
     * @param content: Konten yang akan di-post harus berupa Blog.
     */
    public void post(Content blog) {
        if(blogCount < maxBlogs && blog instanceof Blog){
            blogs[blogCount] = (Blog) blog;
            blogCount++;
            for(Subscriber subscriber : subscribers){
                if(subscriber != null){
                    subscriber.addNotification("Blog " + blogName + " telah mengunggah blog baru dengan judul " + blog.getTitle());
                }
            }
        }
    }

    /** 
     * Metode untuk mengubah Blog yang pernah dibuat dan menotifikasi seluruh subscriber. Jika
     * Blog yang diberikan tidak ada di dalam list blogs, maka jangan lakukan apapun.
     * 
     * Notifikasi ke subscriber akan diberikan dalam format berikut:
     * "Blog {blogName} telah mengubah blog {oldBlog.getTitle()} menjadi {newBlog.getTitle()}"
     * 
     * @param oldBlog: Blog lama yang mungkin ada atau tidak ada di list Blog.
     * @param newBlog: Blog yang akan menggantikan Blog lama
     */
    public void changePost(Content oldBlog, Content newBlog) {
        if (oldBlog instanceof Blog && newBlog instanceof Blog) {
            Blog oldBlogCast = (Blog) oldBlog;
            Blog newBlogCast = (Blog) newBlog;
    
            for (int i = 0; i < blogCount; i++) {
                if (blogs[i].isSame(oldBlogCast)) {
                    blogs[i] = newBlogCast;
    
                    for (Subscriber subscriber : subscribers) {
                        if(subscriber != null){
                            subscriber.addNotification("Blog " + blogName + " telah mengubah blog " 
                                + oldBlogCast.getTitle() + " menjadi " + newBlogCast.getTitle());
                        }
                    }
                    return;
                }
            }
        }
    }

    /** 
     * Metode yang memungkinkan berlangganan ke Poster ini dengan menambahkan ke list Subscriber
     * 
     * @param subscriber: Akun yang ingin berlangganan.
     */
    public void subscribe(Subscriber s) {
        if(subscriberCount < maxSubscribers){
            subscribers[subscriberCount] = s;
            subscriberCount++;
        }
    }
}
