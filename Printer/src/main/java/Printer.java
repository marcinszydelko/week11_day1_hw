public class Printer {
    private int sheets = 500;
    private int toner = 1000;

    public int getSheets(){
        return this.sheets;
    }

     public int getToner(){
        return this.toner;
     }

    public void print( int pages, int copies ){
         int totalPages = pages * copies;
        if(totalPages <= this.sheets){
            this.sheets -= totalPages;
            this.toner -= totalPages;
        }
    }

}
