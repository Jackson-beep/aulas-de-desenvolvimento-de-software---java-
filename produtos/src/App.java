public class App {
    public static void main(String[] args) throws Exception {
        Produto caneta = new Produto("Caneta", 5.9, 15436);
        System.out.println(caneta.toString());
        Livros l1 = new Livros("O senhor dos Anéis", 69.9, 12543, "J. R. R. Tolkien");
        System.out.println(l1.toString());

        Produto produtos[] = new Produto[5];
        produtos[0] = new Livros("Bíblia", 49.9, 13643, "Deus");

    }
}