package structural;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MySpeakDao implements SpeckDao{
    @Override
    public void speak() {
        System.out.println("Hello world");
    }
}
