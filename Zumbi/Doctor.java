package Zumbi;
import java.io.BufferedReader;
import Interfaces.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import graphicCreator.graphicCreator;

public class Doctor  implements IDoctor{

    private int patientN = 0;
    private ITableProducer producer;
    private IResponder responder;
    private IgraphicCreator graphicCreator;
    private IattTable attTable;

    public void connect(ITableProducer producer) {
        this.producer = producer;
    }

    public void connect(IResponder responder) {
        this.responder = responder;
    }
    
    public void connect(IgraphicCreator graphicCreator) {
    	this.graphicCreator = graphicCreator;
    }
    
    public void connect(IattTable attTable) {
    	this.attTable = attTable;
    }


    public void startInterview() {
        String attributes[] = producer.requestAttributes();
        String instances[][] = producer.requestInstances();
        String symptomsP[] = new String[attributes.length - 1];
        String diagnostic = "I don't know";
        ArrayList<Integer> pdoenca = new ArrayList<Integer>();
        int qaskd = 0;
        boolean igual=true;
        String resposta;
        for (int i=0; i < instances.length ;i++){
            pdoenca.add(i);
        }
        
        graphicCreator.update("Início");
        
        while(pdoenca.size()>1 && qaskd<attributes.length - 1 ){
        	System.out.println("qaskd é" + qaskd + "responder é " + responder.ask(attributes[qaskd]));
        	attTable.update(qaskd, responder.ask(attributes[qaskd]));
        	graphicCreator.update(attributes[qaskd]);
            if(responder.ask(attributes[qaskd]).equalsIgnoreCase("t"))
                resposta = "t";
            else
                resposta = "f";
            for(int i=0; i< pdoenca.size();i++){
                if(!resposta.equalsIgnoreCase(instances[pdoenca.get(i)][qaskd])){
                    pdoenca.remove(i);
                    i--;
                }

            }
            qaskd++;
        }
        if(pdoenca.size()>1){
            System.out.println("entrou no if de tamanho > 1");
            for(int i=0; i<pdoenca.size()-1;i++){
                System.out.println("entrou no for pra checar se são iguais");
                if(!instances[pdoenca.get(i)][attributes.length-1].equalsIgnoreCase(instances[pdoenca.get(i+1)][attributes.length-1]))
                    System.out.println("são diferentes");
                igual=false;
            }
        }
        diagnostic = instances[pdoenca.get(0)][attributes.length-1];
        if(!igual){
            for(int i = 1; i < pdoenca.size();i++){
                if(!instances[pdoenca.get(i)][attributes.length-1].equalsIgnoreCase(instances[pdoenca.get(i-1)][attributes.length-1]))
                    diagnostic += " e "+ instances[pdoenca.get(i)][attributes.length-1];
            }
        }



        for (int a = 0; a < attributes.length - 1; a++)
            System.out.println("Question: " + responder.ask(attributes[a]));

        System.out.println("Disease guess: " + diagnostic);
        boolean result = responder.finalAnswer(diagnostic);
        System.out.println("Result: " + ((result) ? "I am right =)" : "I am wrong =("));
        graphicCreator.createGraphic();
    }
}
