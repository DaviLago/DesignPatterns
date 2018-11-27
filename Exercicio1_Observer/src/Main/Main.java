package Main;

import View.JFrameGraficoView;
import View.JFrameTextoView;

public class Main {

    public static void main(String[] args) {
        JFrameTextoView texto = new JFrameTextoView();
        JFrameGraficoView observer = new JFrameGraficoView();
        texto.createObserver(observer);
    }
    
}
