/*
 */
package nedarvningskak;

/**
 *
 * @author flyberson
 */
public class Knight extends ChessPiece{
    
    public Knight( boolean color, int xposition, int yposition) {
        super("Knight", color, xposition, yposition);
    }
    
     public boolean canMoveTo(int x, int y){
         int tempx;
         int tempy;
         
        if(super.canMoveTo(x, y)){
            tempx=x-xposition;
            tempx=Math.abs(tempx);
            tempy=y-yposition;
            tempy=Math.abs(tempy);
            
            if(((tempx ==3&&tempy==1)||(tempy==3&&tempx==1))){
                
                return true;
            }
        }
        
        return false;
        
    }
    
}
