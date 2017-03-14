/*
 */
package nedarvningskak;

/**
 *
 * @author flyberson
 */
public class Rook extends ChessPiece {
    
    public Rook( boolean color, int xposition, int yposition) {
        super("Rook", color, xposition, yposition);
    }
    
    
    public boolean canMoveTo(int x, int y){
        if(super.canMoveTo(x, y)){
            if((x==xposition||y==yposition)){
                return true;
            }
        }
        
        return false;
        
    }
}
