

public class FactoryClient {
    public static void main(String[] args) {
       Documents document = DocumentFactory.getDocument("word");
       document.createDocument();
    }
}
