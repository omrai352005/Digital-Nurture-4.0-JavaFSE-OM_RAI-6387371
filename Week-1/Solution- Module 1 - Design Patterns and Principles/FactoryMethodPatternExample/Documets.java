
interface Documents {
    Object createDocument();
}



class PdfDocument implements Documents {
    public Object createDocument() {
        System.out.println("Creating PDF Document");
        return new PdfDocument();
    }
}   



