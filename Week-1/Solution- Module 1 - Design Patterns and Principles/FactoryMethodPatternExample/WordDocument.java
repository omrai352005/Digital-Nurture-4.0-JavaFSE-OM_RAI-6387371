class WordDocument implements Documents {
    public Object createDocument() {
        System.out.println("Creating Word Document");
        return new WordDocument();
    }
}

