/*
 */
package nedarvningskak;

import java.util.ArrayList;

/**
 *
 * @author flyberson
 */
public class NedarvningSkak {

    static ArrayList<ChessPiece> alist;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alist=new ArrayList<>();
        Rook rook = new Rook(true, 2, 2);

        Bishop bishop = new Bishop(true, 3, 7);

        Knight knight = new Knight(true, 4, 4);
        knight.show();
        rook.show();
        bishop.show();
        
        alist.add(rook);
        alist.add(bishop);
        alist.add(knight);
        for (ChessPiece cp : alist) {
            cp.show();
        }
//        alist.get(0).move(4, 2);
//        alist.get(1).move(8, 1);
//        alist.get(2).move(2, 3);
//        for (ChessPiece cp : alist) {
//            cp.show();
//        }

    }
}
