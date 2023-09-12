package lucas.entities;
import lucas.interfaces.IRotator;
public abstract class PieceBase implements IRotator {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void rotate_left(){
    if (getName()=="piecedog-rigth"){
        
    }
    };
    @Override
    public void rotate_right(){};
}
