public class DocumentFactory {
    public static Documents createDocument(String docType){
           if(docType.trim().equalsIgnoreCase("word")){
             return new WordDocument(); 
           }
           else if(docType.trim().equalsIgnoreCase("pdf")){
             return new PdfDocument(); 
           }
           else if(docType.trim().equalsIgnoreCase("excel")){
             return new ExcelDocument(); 
           }
           else{
            return null;
           }
    }
}
   