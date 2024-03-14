public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("nhacmp3", "hay choi nhac", "123", 55.99d, 3500);
        mp3.showInfo();
        System.out.println(" ");
        Book book = new Book("hoc java nang cao", "hoc ngon ngu java", "123", 20.55d, "pham xuan lam", 600, "thuc hanh");
        book.showInfo();
    }
}
