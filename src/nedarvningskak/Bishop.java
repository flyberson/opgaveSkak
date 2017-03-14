/*
 */
package nedarvningskak;

/**
 *
 * @author flyberson
 */
public class Bishop extends ChessPiece {
    int temp=0;
    public Bishop( boolean color, int xposition, int yposition) {
        super("Bishop", color, xposition, yposition);
    }
   // x+2
    //y+2
    public boolean canMoveTo(int x, int y){
        if(super.canMoveTo(x, y)){
            int t1x= x - xposition;
            t1x=Math.abs(t1x);
            int t1y=y -yposition;
            t1y=Math.abs(t1y);
//            int t2x=x+xposition;
//            int t2y= y+yposition;
            if((t1x==t1y//||t2x==t2y
                    )){
                return true;
            }
        }
        
        return false;
        
    }
    
}
