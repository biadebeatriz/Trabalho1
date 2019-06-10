package View;

import pt.clubedohardware.userinterface.AnimationC;
import pt.clubedohardware.userinterface.IAnimationC;

public class View {
    IAnimationC animation;

    public View(){
        animation = new AnimationC();
    }

    public void setView(String win, String pacient, String doctor){
        this.animation.setDocName(doctor);
        this.animation.setPacientName(pacient);
        this.animation.setWindowName(win);
    }

    public void begin(){
        String[] falas = {"Hii, whats wrong?", "Estou doente ASFUCK"};
        String[] personagens = {"doctor", "pacient"};
        animation.story(falas, personagens);
    }

    public void update(String[][] instancias, int pergunta, String resposta){

    }

}
