public class Main {
    public static void main(String[] args) {
       Documents document1 = DocumentFactory.createDocument("word"); 
       document1.openDocument();
       Documents document2 = DocumentFactory.createDocument("pdf"); 
       document2.openDocument();
       Documents document3 = DocumentFactory.createDocument("excel"); 
       document3.openDocument();

    }
}
