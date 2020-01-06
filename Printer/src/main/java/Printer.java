public class Printer {
    private int sheets = 500;

    public int getSheets(){
        return this.sheets;
    }

    public void print( int pages, int copies ){
        if(pages * copies <= this.sheets){
            this.sheets -= pages * copies;
        }
    }

}
