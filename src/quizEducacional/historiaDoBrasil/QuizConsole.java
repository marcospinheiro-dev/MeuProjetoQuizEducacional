package quizEducacional.historiaDoBrasil;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class QuizConsole {

//    QuizConsole quiz = new QuizConsole();

//    public Aplicacao(int primeiroQuest) {
//        super(primeiroQuest);
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("DAMOS AS BOAS VINDAS AO NOSSO TESTE DE CONHECIMENTO DA HISTÓRIA DO BRASIL.");
        System.out.println("--------------------------------------------------------------------------");

//        Questoes questao1 = new Questoes();
//        Questoes questao2 = new Questoes();
//        Questoes questao3 = new Questoes();
//        Questoes questao4 = new Questoes();
//        Questoes questao5 = new Questoes();


        System.out.println("1) - A ordem baixada pelo governador de Minas Gerais, Visconde de Barbacena, " +
                "para que se realizasse a Derrama, ou seja, a cobrança dos tributos devidos à coroa " +
                "portuguesa foi a causa imediata da: ");
        System.out.println("[1]Revolta dos Alfaiates.");
        System.out.println("[2]Revolta de Vila Rica.");
        System.out.println("[3]Guerra dos Mascates.");
        System.out.println("[4]Guerra do Contestado.");
        System.out.println("[5]Inconfidência Mineira.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        int questao1 = sc.nextInt();
        while(questao1 < 1 || questao1 > 5){
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao1 = sc.nextInt();
        }
        switch (questao1) {
            case 1:{
                System.out.println("Resposta incorreta!");
                break;
            }
            case 2:
                System.out.println("Resposta incorreta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta incorreta!");
                break;
            case 5:
                System.out.println("Resposta correta!");
                break;
            default:
                break;
        }

        System.out.println("--------------------------------------------");
        System.out.println("2) - A primeira “relação de trabalho” entre portugueses e índios brasileiros foi: ");
        System.out.println("[1]O escambo.");
        System.out.println("[2]A escravidão.");
        System.out.println("[3]A servidão.");
        System.out.println("[4]O colonato.");
        System.out.println("[5]A mita.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        int questao2 = sc.nextInt();
        while(questao2 < 1 || questao2 > 5) {
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao2 = sc.nextInt();
        }
        switch (questao2) {
            case 1:
                System.out.println("Resposta correta!");
                break;
            case 2:
                System.out.println("Resposta incorreta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta incorreta!");
                break;
            case 5:
                System.out.println("Resposta incorreta!");
                break;
        }

        System.out.println("--------------------------------------------");
        System.out.println("3) - Quem foi o primeiro governador-geral do Brasil? ");
        System.out.println("[1]Mem de Sá.");
        System.out.println("[2]Tomé de Sousa.");
        System.out.println("[3]Duarte da Costa.");
        System.out.println("[4]Duarte Coelho.");
        System.out.println("[5]Martim Afonso de Sousa.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        int questao3 = sc.nextInt();
        while(questao3 < 1 || questao3 > 5) {
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao3 = sc.nextInt();
        }
        switch (questao3) {
            case 1:
                System.out.println("Resposta incorreta!");
                break;
            case 2:
                System.out.println("Resposta correta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta incorreta!");
                break;
            case 5:
                System.out.println("Resposta incorreta!");
                break;
        }
        System.out.println("--------------------------------------------");
        System.out.println("4) - Qual era o nome da principal estrada que ligava as Minas Gerais com o Rio de " +
                "Janeiro durante o auge do período da mineração? ");
        System.out.println("[1]Caminho Novo.");
        System.out.println("[2]Estrada Lusitana.");
        System.out.println("[3]Caminho do Ouro.");
        System.out.println("[4]Estrada das Minas.");
        System.out.println("[5]Caminho de Paraty.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        int questao4 = sc.nextInt();
        while(questao4 < 1 || questao4 > 5) {
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao4 = sc.nextInt();
        }
        switch (questao4) {
            case 1:
                System.out.println("Resposta correta!");
                break;
            case 2:
                System.out.println("Resposta incorreta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta incorreta!");
                break;
            case 5:
                System.out.println("Resposta incorreta!");
                break;
        }
        System.out.println("--------------------------------------------");
        System.out.println("5) - Os bandeirantes eram os responsáveis por expedições que ficaram conhecidas como: ");
        System.out.println("[1]Derramas.");
        System.out.println("[2]Capitulações.");
        System.out.println("[3]Processos.");
        System.out.println("[4]Bandeiras.");
        System.out.println("[5]Delegações.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        int questao5 = sc.nextInt();
        while(questao5 < 1 || questao5 > 5) {
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao5 = sc.nextInt();
        }
        switch (questao5) {
            case 1:
                System.out.println("Resposta incorreta!");
                break;
            case 2:
                System.out.println("Resposta incorreta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta correta!");
                break;
            case 5:
                System.out.println("Resposta incorreta!");
                break;
        }
        System.out.println("--------------------------------------------");
        int totalDeAcertos = 0;
        int totalDeErros = 0;

        if (questao1 == 5) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        if (questao2 == 1) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        if (questao3 == 2) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        if (questao4 == 1) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        if (questao5 == 4) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        double soma =totalDeAcertos + totalDeErros;
        double totalPercent = totalDeAcertos / soma * 100.0;
        System.out.println("\nTotal de acertos: " + totalDeAcertos);
        System.out.println("Total de erros: " + totalDeErros);
        System.out.println("Percentual de acertos: " + totalPercent + "%");


//        char guess;
//        char resposta;
//        int index;
//        int seconds = 10;
//
//        JFrame frame = new JFrame();
//        JTextField textfield = new JTextField();
//        JTextArea textarea = new JTextArea();
//        JButton buttonA = new JButton();
//        JButton buttonB = new JButton();
//        JButton buttonC = new JButton();
//        JButton buttonD = new JButton();
//        JButton buttonE = new JButton();
//        JLabel respostaA = new JLabel();
//        JLabel respostaB = new JLabel();
//        JLabel respostaC = new JLabel();
//        JLabel respostaD = new JLabel();
//        JLabel respostaE = new JLabel();
//        JLabel tempoResposta = new JLabel();
//        JTextField respostaCorreta = new JTextField();
//        JTextField percentAcerto = new JTextField();
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(650, 800);
//        frame.getContentPane().setBackground(new Color(66, 69, 234));
//        frame.setLayout(null);
//        frame.setResizable(false);
//
//        textfield.setBounds(0, 0, 650, 50);
//        textfield.setBackground(new Color(69, 153, 164));
//        textfield.setForeground(new Color(25, 255, 0));
//        textfield.setFont(new Font("Ink Free",Font.BOLD,30));
//        textfield.setBorder(BorderFactory.createBevelBorder(1));
//        textfield.setHorizontalAlignment(JTextField.CENTER);
//        textfield.setEditable(false);
//        textfield.setText("Testando....1");
//
//        textarea.setBounds(0, 50, 850, 50);
//        textarea.setLineWrap(true);
//        textarea.setWrapStyleWord(true);
//        textarea.setBackground(new Color(224, 140, 44));
//        textarea.setForeground(new Color(25, 255, 0));
//        textarea.setFont(new Font("MV Boli",Font.BOLD,25));
//        textarea.setBorder(BorderFactory.createBevelBorder(1));
//        textarea.setEditable(false);
//        textarea.setText("Testando....2");
//
//        buttonA.setBounds(0, 100, 100, 100);
//        buttonA.setFont(new Font("MV Boli",Font.BOLD,35));
//        buttonA.setFocusable(false);
//        //buttonA.addActionListener(this);
//        buttonA.setText("A");
//
//        buttonB.setBounds(0, 200, 100, 100);
//        buttonB.setFont(new Font("MV Boli",Font.BOLD,35));
//        buttonB.setFocusable(false);
//        //buttonB.addActionListener(this);
//        buttonB.setText("B");
//
//        buttonC.setBounds(0, 300, 100, 100);
//        buttonC.setFont(new Font("MV Boli",Font.BOLD,35));
//        buttonC.setFocusable(false);
//        //buttonC.addActionListener(this);
//        buttonC.setText("C");
//
//        buttonD.setBounds(0, 400, 100, 100);
//        buttonD.setFont(new Font("MV Boli",Font.BOLD,35));
//        buttonD.setFocusable(false);
//        //buttonD.addActionListener(this);
//        buttonD.setText("D");
//
//        buttonE.setBounds(0, 500, 100, 100);
//        buttonE.setFont(new Font("MV Boli",Font.BOLD,35));
//        buttonE.setFocusable(false);
//        //buttonA.addActionListener(this);
//        buttonE.setText("E");
//
//        respostaA.setBounds(125,100,500,100);
//        respostaA.setBackground(new Color(50, 50, 50));
//        respostaA.setForeground(new Color(25, 255, 0));
//        respostaA.setFont(new Font("MV Boli", Font.PLAIN, 35));
//        respostaA.setText("Novo teste");
//
//        respostaB.setBounds(125,200,500,100);
//        respostaB.setBackground(new Color(50, 50, 50));
//        respostaB.setForeground(new Color(25, 255, 0));
//        respostaB.setFont(new Font("MV Boli", Font.PLAIN, 35));
//        respostaB.setText("Novo teste");
//
//        respostaC.setBounds(125,300,500,100);
//        respostaC.setBackground(new Color(50, 50, 50));
//        respostaC.setForeground(new Color(25, 255, 0));
//        respostaC.setFont(new Font("MV Boli", Font.PLAIN, 35));
//        respostaC.setText("Novo teste");
//
//        respostaD.setBounds(125,400,500,100);
//        respostaD.setBackground(new Color(50, 50, 50));
//        respostaD.setForeground(new Color(25, 255, 0));
//        respostaD.setFont(new Font("MV Boli", Font.PLAIN, 35));
//        respostaD.setText("Novo teste");
//
//        respostaE.setBounds(125,500,500,100);
//        respostaE.setBackground(new Color(50, 50, 50));
//        respostaE.setForeground(new Color(25, 255, 0));
//        respostaE.setFont(new Font("MV Boli", Font.PLAIN, 35));
//        respostaE.setText("Novo teste");
//
//        tempoResposta.setBounds(535, 650, 100,100);
//        tempoResposta.setBackground(new Color(239, 222, 14, 242));
//        tempoResposta.setForeground(new Color(255, 0, 0));
//        tempoResposta.setFont(new Font("Ink Free", Font.BOLD, 60));
//        tempoResposta.setBorder(BorderFactory.createBevelBorder(1));
//        tempoResposta.setOpaque(true);
//        tempoResposta.setHorizontalAlignment(JTextField.CENTER);
//        tempoResposta.setText(String.valueOf(seconds));
//
//        respostaCorreta.setBounds(425, 225, 200, 100);
//        respostaCorreta.setBackground(new Color(25, 25, 25));
//        respostaCorreta.setForeground(new Color(25, 255, 0));
//        respostaCorreta.setFont(new Font("Ink Free", Font.BOLD, 50));
//        respostaCorreta.setBorder(BorderFactory.createBevelBorder(1));
//        respostaCorreta.setHorizontalAlignment(JTextField.CENTER);
//        respostaCorreta.setEditable(false);
//        respostaCorreta.setText("correto");
//
//        percentAcerto.setBounds(425, 325, 200, 100);
//        percentAcerto.setBackground(new Color(255, 255, 255));
//        percentAcerto.setForeground(new Color(25, 255, 0));
//        percentAcerto.setFont(new Font("Ink Free", Font.BOLD, 50));
//        percentAcerto.setBorder(BorderFactory.createBevelBorder(1));
//        percentAcerto.setHorizontalAlignment(JTextField.CENTER);
//        percentAcerto.setEditable(false);
//        percentAcerto.setText("%");
//
//
//        frame.add(percentAcerto);
//        frame.add(respostaCorreta);//respostaCorreta
//        frame.add(tempoResposta);//tempoResposta
//        frame.add(respostaA);//resposta
//        frame.add(respostaB);
//        frame.add(respostaC);
//        frame.add(respostaD);
//        frame.add(respostaE);
//        frame.add(buttonA);//button
//        frame.add(buttonB);
//        frame.add(buttonC);
//        frame.add(buttonD);
//        frame.add(buttonE);
//        frame.add(textarea);
//        frame.add(textfield);//textfield
//        frame.setVisible(true);

        sc.close();

    }


    //package quizEducacional.historiaDoBrasil;

//    public class Questoes {
//        private int primeiraQuest;
//        private int segundaQuest;
//        private int terceiraQuest;
//        private int quartaQuest;
//        private int quintaQuest;
//
//        public Questoes(int primeiroQuest) {
//
//            this.primeiraQuest = primeiroQuest;
//        }
//
//        public int getPrimeiraQuest() {
//            return primeiraQuest;
//        }
//
//        public void setPrimeiraQuest(int primeiraQuest) {
//            this.primeiraQuest = primeiraQuest;
//        }
//
//        public int getSegundaQuest() {
//            return segundaQuest;
//        }
//
//        public void setSegundaQuest(int segundaQuest) {
//            this.segundaQuest = segundaQuest;
//        }
//
//        public int getTerceiraQuest() {
//            return terceiraQuest;
//        }
//
//        public void setTerceiraQuest(int terceiraQuest) {
//            this.terceiraQuest = terceiraQuest;
//        }
//
//        public int getQuartaQuest() {
//            return quartaQuest;
//        }
//
//        public void setQuartaQuest(int quartaQuest) {
//            this.quartaQuest = quartaQuest;
//        }
//
//        public int getQuintaQuest() {
//            return quintaQuest;
//        }
//
//        public void setQuintaQuest(int quintaQuest) {
//            this.quintaQuest = quintaQuest;
//        }
//
//        public Questoes() {
//
//        }
//
//    }

}
