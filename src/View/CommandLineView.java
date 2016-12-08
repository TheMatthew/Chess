package View;

import Controller.GameController;
import Controller.Piece;
import Data.Board;
import Data.Point;

/**
 * Created by simon on 08/12/16.
 */
public class CommandLineView extends GameView{
    public CommandLineView(){
    }
    
    @Override
    public void printBoard(Board board){
        Piece[][] data = board.getData();
        for(int y = data.length - 1; y >= 0; y--){
            for(int x = 0; x < data[y].length; x++){
                String result = board.objectAt(new Point(x, y)).getStringType();
                System.out.print("[" + result + "] ");
            }
            System.out.println();
        }
    }
    
    @Override
    public void printSelectedPiece(Board board){
        
        System.out.println("Piece Selected: " + board.getSelectedPiece().getName() + " at " + board.getSelectedPiece().position.x + ":" + board.getSelectedPiece().position.y);
    }
    
    @Override
    public void clearScreen(){
        
        for(int i = 0; i < 100; i++)
            System.out.println("\n");
    }
}

