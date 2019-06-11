package View;

import pt.clubedohardware.userinterface.AnimationC;
import pt.clubedohardware.userinterface.IAnimationC;
import Interfaces.IView;
import java.util.Random;

public class View implements IView{
    IAnimationC animation;
    String name;

    public View(){
        animation = new AnimationC();
        this.begin();
        this.name = this.generateString(new Random(), "qwerty^%#78ials7007323kdcn123", 10);
        this.setView("Grupo 1", this.name, "Andre Santache");
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

    private String generateString(Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

    public void diagnostico(String doenca){
        String[] falas;
        if(doenca.equals("nothing")){
            falas = new String[]{"You're very health zumbi", "EBA"};
        }
        else{
            falas = new String[]{"You have" + doenca, "I'DONT CAREEE KKKK"};
        }
        String[] pers = {"doctor", "pacient"};
        animation.story(falas, pers);
    }

    public void updateV(String[] atributos, int pergunta, String resp){
        String resposta;
        String ask = atributos[pergunta];
        if(resp.equals("t")){
            resposta = " Yes ):";
        }
        else{
            resposta = " No ):";
        }
        String[] falas_atua = {"Do you have"+ ask+ "?", resposta};
        String[] personagens_atual = {"doctor", "pacient"};
        animation.story(falas_atua, personagens_atual);
    }

}
