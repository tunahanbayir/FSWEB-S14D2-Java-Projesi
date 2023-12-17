import com.workintech.model.*;
import com.workintech.model.enums.LampType;
import com.workintech.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("yatak odası", new Wall("doğu"), new Wall("batı"), new Wall("kuzey"), new Wall("güney"), new Ceiling(275, PaintColor.BLUE), new Bed("çift kişilik",2,80,1,1), new Lamp(true, 20, LampType.TABLE), new Wardrobe(150,120,10.5), new Carpet(100,150,PaintColor.RED));
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getWall1().create();
        bedroom.getWardrobe().add();
    }
}