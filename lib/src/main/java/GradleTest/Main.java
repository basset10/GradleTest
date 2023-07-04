package GradleTest;

import static com.osreboot.ridhvl2.HvlStatics.hvlDraw;
import static com.osreboot.ridhvl2.HvlStatics.hvlQuad;

import com.osreboot.ridhvl2.HvlColor;
import com.osreboot.ridhvl2.template.HvlDisplay;
import com.osreboot.ridhvl2.template.HvlDisplayWindowed;
import com.osreboot.ridhvl2.template.HvlTemplateI;

public class Main extends HvlTemplateI{

    public static void main(String[] args){
        new Main();
    }
    
    public Main(){
        super(new HvlDisplayWindowed(144, 1024, "Test Window", false));
    }

    @Override
    public void initialize(){
        
    }
    
    @Override
    public void update(float delta){
        hvlDraw(hvlQuad(0f, 0f, HvlDisplay.getSize()), HvlColor.BLUE);
    }

}