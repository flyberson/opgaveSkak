/*
 */
package nedarvningskak;

/**
 *
 * @author flyberson
 */
public abstract class ChessPiece {
    protected String name;
    // true hvid false sort
    protected boolean color;
    protected int xposition;
    protected int yposition;

    public ChessPiece(String name, boolean color, int xposition, int yposition) {
        this.name = name;
        this.color = color;
        this.xposition = xposition;
        this.yposition = yposition;
    }
    
    
    public boolean canMoveTo(int x, int y){
        if(x>1||x<8 || y>1 || y<8){
            return true;
            
        }
        
        
        return false;
        
    }
    
    public String positionToField(int x,int y){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char temp = alphabet[x];
        
        return "Move="+temp+y;
    }
    
    
    // need to fix
    public String possibleMoves(){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                   if( canMoveTo(i,j)){
                       System.out.println(positionToField(i, j));
                   }
                }
        }
        
        return "Possible";
    }
   
    public String show(){
        
        return "Name="+name+" "+color+"  "+xposition+"  "+yposition+" "+positionToField(xposition, yposition)+
                "\n Can Move to: "+ possibleMoves();
        
    }
    
    public void move(int x, int y){
        if(canMoveTo(x, y)){
            System.out.println(color+"  "+name+"  "+xposition+"  "+ yposition+ " ->"+ x+ "  "+y);
        xposition=x;
        yposition=y;
        
                
        }
        else{
            System.out.println("Ugyldigt træk!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public int getXposition() {
        return xposition;
    }

    public void setXposition(int xposition) {
        this.xposition = xposition;
    }

    public int getYposition() {
        return yposition;
    }

    public void setYposition(int yposition) {
        this.yposition = yposition;
    }
    
    
}
