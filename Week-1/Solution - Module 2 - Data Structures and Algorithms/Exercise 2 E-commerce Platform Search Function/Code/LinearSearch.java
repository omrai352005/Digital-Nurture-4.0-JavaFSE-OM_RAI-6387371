public class LinearSearch {
    public static int search(Product[] products , String targetName){
        for(int i=0 ; i<products.length; i++){
            if(products[i].getProductName().equalsIgnoreCase(targetName)){
                return i; 
            }
        }
        return -1 ;
    }
}
