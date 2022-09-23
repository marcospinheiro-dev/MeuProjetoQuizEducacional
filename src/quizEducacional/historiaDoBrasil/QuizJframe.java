package quizEducacional.historiaDoBrasil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class QuizJframe implements ActionListener {

    int seconds = 10000/1000;
    int perguntaAtual = 1;
    int score = 0;

    boolean isTesteIniciado = false;
    boolean isUltimaPerguntaRespondida = false;

    JFrame frame = new JFrame();
    JTextField boasVindas = new JTextField();
    JTextArea textoDaPergunta = new JTextArea();
    JButton botao1 = new JButton();
    JButton botao2 = new JButton();
    JButton botao3 = new JButton();
    JButton botao4 = new JButton();
    JButton botao5 = new JButton();
    JButton proximaQuestao = new JButton();
    JButton iniciar = new JButton();
    JButton reIniciar = new JButton();
    JLabel textoResposta1 = new JLabel();
    JLabel textoResposta2 = new JLabel();
    JLabel textoResposta3 = new JLabel();
    JLabel textoResposta4 = new JLabel();
    JLabel textoResposta5 = new JLabel();
    JLabel cronometroResposta = new JLabel();
    JTextField respCorretaIncorreta = new JTextField();
    JTextField qtdAcerto = new JTextField();

    public QuizJframe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 800);
        frame.getContentPane().setBackground(new Color(47, 74, 145));
        frame.setLayout(null);
        frame.setResizable(false);

        //Boas vindas
        boasVindas.setBounds(0, 0, 650, 50);
        boasVindas.setBackground(new Color(219, 243, 4, 255));
        boasVindas.setForeground(new Color(0, 0, 0));
        boasVindas.setFont(new Font(" ", Font.CENTER_BASELINE, 20));
        boasVindas.setBorder(BorderFactory.createBevelBorder(1));
        boasVindas.setHorizontalAlignment(JTextField.CENTER);
        boasVindas.setEditable(false);
        boasVindas.setText("Boas vindas!");

        //Texto das questões
        textoDaPergunta.setBounds(0, 50, 650, 100);
        textoDaPergunta.setLineWrap(true);
        textoDaPergunta.setWrapStyleWord(true);
        textoDaPergunta.setBackground(new Color(255, 255, 255));
        textoDaPergunta.setForeground(new Color(0, 0, 0));
        textoDaPergunta.setFont(new Font(" ", Font.BOLD, 16));
        textoDaPergunta.setBorder(BorderFactory.createBevelBorder(1));
        textoDaPergunta.setEditable(false);
        textoDaPergunta.setText("");

        //Botão para escolher a resposta
        botao1.setBounds(20, 230, 50, 50);
        botao1.setFont(new Font("MV Boli", Font.BOLD, 20));
        botao1.setFocusable(false);
        botao1.addActionListener(this);
        botao1.setText("1");
        botao1.setVisible(false);

        botao2.setBounds(20, 330, 50, 50);
        botao2.setFont(new Font("MV Boli", Font.BOLD, 20));
        botao2.setFocusable(false);
        botao2.addActionListener(this);
        botao2.setText("2");
        botao2.setVisible(false);

        botao3.setBounds(20, 430, 50, 50);
        botao3.setFont(new Font("MV Boli", Font.BOLD, 20));
        botao3.setFocusable(false);
        botao3.addActionListener(this);
        botao3.setText("3");
        botao3.setVisible(false);

        botao4.setBounds(20, 530, 50, 50);
        botao4.setFont(new Font("MV Boli", Font.BOLD, 20));
        botao4.setFocusable(false);
        botao4.addActionListener(this);
        botao4.setText("4");
        botao4.setVisible(false);

        botao5.setBounds(20, 630, 50, 50);
        botao5.setFont(new Font("MV Boli", Font.BOLD, 20));
        botao5.setFocusable(false);
        botao5.addActionListener(this);
        botao5.setText("5");
        botao5.setVisible(false);

        //Próxima questão
        proximaQuestao.setBounds(220, 150, 200, 50);
        proximaQuestao.setFont(new Font(" ", Font.BOLD, 16));
        proximaQuestao.setFocusable(false);
        proximaQuestao.addActionListener(this);
        proximaQuestao.setEnabled(true);
        proximaQuestao.setText("Próxima questão");
        proximaQuestao.setVisible(false);

        //Botão iniciar
        iniciar.setBounds(240, 380, 150, 50);
        iniciar.setFont(new Font(" ", Font.BOLD, 18));
        iniciar.setFocusable(false);
        iniciar.addActionListener(this);
        iniciar.setEnabled(true);
        iniciar.setText("Iniciar teste");

        //Botão reIniciar
        reIniciar.setBounds(220, 680, 200, 70);
        reIniciar.setFont(new Font(" ", Font.BOLD, 16));
        reIniciar.setFocusable(false);
        reIniciar.setBackground(new Color(74, 211, 68));
        reIniciar.setFont(new Font(" ", Font.PLAIN, 23));
        reIniciar.addActionListener(this);
        reIniciar.setVisible(false);
        reIniciar.setEnabled(true);
        reIniciar.setText("Reiniciar teste");

        //Texto da resposta
        textoResposta1.setBounds(125, 200, 500, 100);
        textoResposta1.setBackground(new Color(50, 50, 50));
        textoResposta1.setForeground(new Color(255, 255, 255));
        textoResposta1.setFont(new Font(" ", Font.PLAIN, 18));
        textoResposta1.setText("");
        textoResposta1.setVisible(false);

        textoResposta2.setBounds(125, 300, 500, 100);
        textoResposta2.setBackground(new Color(50, 50, 50));
        textoResposta2.setForeground(new Color(255, 255, 255));
        textoResposta2.setFont(new Font(" ", Font.PLAIN, 18));
        textoResposta2.setText("");
        textoResposta2.setVisible(false);

        textoResposta3.setBounds(125, 400, 500, 100);
        textoResposta3.setBackground(new Color(50, 50, 50));
        textoResposta3.setForeground(new Color(255, 255, 255));
        textoResposta3.setFont(new Font(" ", Font.PLAIN, 18));
        textoResposta3.setText("");
        textoResposta3.setVisible(false);

        textoResposta4.setBounds(125, 500, 500, 100);
        textoResposta4.setBackground(new Color(50, 50, 50));
        textoResposta4.setForeground(new Color(255, 255, 255));
        textoResposta4.setFont(new Font(" ", Font.PLAIN, 18));
        textoResposta4.setText("");
        textoResposta4.setVisible(false);

        textoResposta5.setBounds(125, 600, 500, 100);
        textoResposta5.setBackground(new Color(50, 50, 50));
        textoResposta5.setForeground(new Color(255, 255, 255));
        textoResposta5.setFont(new Font(" ", Font.PLAIN, 18));
        textoResposta5.setText("");
        textoResposta5.setVisible(false);

        //Cronômetro da resposta
        cronometroResposta.setBounds(525, 180, 80, 80);
        cronometroResposta.setBackground(new Color(255, 255, 255, 255));
        cronometroResposta.setForeground(new Color(25, 25, 25));
        cronometroResposta.setFont(new Font("", Font.BOLD, 20));
        cronometroResposta.setBorder(BorderFactory.createBevelBorder(1));
        cronometroResposta.setOpaque(true);
        cronometroResposta.setHorizontalAlignment(JTextField.CENTER);
        cronometroResposta.setText(String.valueOf(seconds));
        cronometroResposta.setVisible(false);

        //Mostra se a resposta foi certa ou errada
        respCorretaIncorreta.setBounds(475, 500, 150, 50);
        respCorretaIncorreta.setBackground(new Color(255, 255, 255));
        respCorretaIncorreta.setForeground(new Color(25, 25, 25));
        respCorretaIncorreta.setFont(new Font(" ", Font.BOLD, 15));
        respCorretaIncorreta.setBorder(BorderFactory.createBevelBorder(1));
        respCorretaIncorreta.setHorizontalAlignment(JTextField.CENTER);
        respCorretaIncorreta.setEditable(false);
        respCorretaIncorreta.setText("?");
        respCorretaIncorreta.setVisible(false);

        //Mostra a porcentagem de acertos
        qtdAcerto.setBounds(425, 600, 200, 50);
        qtdAcerto.setBackground(new Color(255, 255, 255));
        qtdAcerto.setForeground(new Color(25, 25, 25));
        qtdAcerto.setFont(new Font(" ", Font.BOLD, 20));
        qtdAcerto.setBorder(BorderFactory.createBevelBorder(1));
        qtdAcerto.setHorizontalAlignment(JTextField.CENTER);
        qtdAcerto.setEditable(false);
        qtdAcerto.setText("Acerto em %");
        qtdAcerto.setVisible(false);

        frame.add(qtdAcerto);
        frame.add(respCorretaIncorreta);//respostaCorreta
        frame.add(cronometroResposta);//tempoResposta
        frame.add(textoResposta1);//resposta
        frame.add(textoResposta2);
        frame.add(textoResposta3);
        frame.add(textoResposta4);
        frame.add(textoResposta5);
        frame.add(botao1);//button
        frame.add(botao2);
        frame.add(botao3);
        frame.add(botao4);
        frame.add(botao5);
        frame.add(proximaQuestao);
        frame.add(iniciar);
        frame.add(reIniciar);
        frame.add(textoDaPergunta);
        frame.add(boasVindas);//textfield
        frame.setVisible(true);
    }

    private void mostraBotaoReiniciar(ActionEvent e) {
        reIniciar.setVisible(true);
        proximaQuestao.setVisible(false);
        cronometroResposta.setVisible(false);
        botao1.setVisible(false);
        botao2.setVisible(false);
        botao3.setVisible(false);
        botao4.setVisible(false);
        botao5.setVisible(false);
        textoResposta1.setVisible(false);
        textoResposta2.setVisible(false);
        textoResposta3.setVisible(false);
        textoResposta4.setVisible(false);
        textoResposta5.setVisible(false);
        textoDaPergunta.setVisible(false);
        boasVindas.setVisible(false);
    }

    private void verificaSeTesteFoiIniciado(ActionEvent e) {
        if (Objects.equals(e.getActionCommand(), "Iniciar teste")) {
            isTesteIniciado = true;
        }

        if (isTesteIniciado) {
            iniciar.setVisible(false);
            qtdAcerto.setText("Acerto em %");
            visibilidadeDeBotoes(true);
            proximaQuestao.setVisible(false);

        }
    }

//    private void verificaTempo(int i) throws InterruptedException {
//        new Thread().interrupt();
//    }

    private void mostraResultado() {
        qtdAcerto.setText("Você acertou " + score*100/50 + "%");
    }

    private void verificaSeReiniciarTesteFoiExecutado(ActionEvent e) {

        if(Objects.equals(e.getActionCommand(), "Reiniciar teste")) {

            reIniciar.setVisible(false);
            visibilidadeDeBotoes(true);

            botao1.setEnabled(true);
            botao2.setEnabled(true);
            botao3.setEnabled(true);
            botao4.setEnabled(true);
            botao5.setEnabled(true);

            perguntaAtual = 1;
            score = 0;
            isUltimaPerguntaRespondida = false;
        }
    }

    public void visibilidadeDeBotoes(boolean status){

        proximaQuestao.setVisible(status);
        cronometroResposta.setVisible(status);
        botao1.setVisible(status);
        botao2.setVisible(status);
        botao3.setVisible(status);
        botao4.setVisible(status);
        botao5.setVisible(status);
        textoResposta1.setVisible(status);
        textoResposta2.setVisible(status);
        textoResposta3.setVisible(status);
        textoResposta4.setVisible(status);
        textoResposta5.setVisible(status);
        textoDaPergunta.setVisible(status);
        respCorretaIncorreta.setVisible(status);
        qtdAcerto.setVisible(status);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Primeira questão

        verificaSeReiniciarTesteFoiExecutado(e);

        if(e.getSource() == botao1 || e.getSource() == botao2 ||
                e.getSource() == botao3 || e.getSource() == botao4 ||
                e.getSource() == botao5){
            botao1.setEnabled(false);
            botao2.setEnabled(false);
            botao3.setEnabled(false);
            botao4.setEnabled(false);
            botao5.setEnabled(false);
        }

        if (Objects.equals(e.getActionCommand(), "Próxima questão")) {
            botao1.setEnabled(true);
            botao2.setEnabled(true);
            botao3.setEnabled(true);
            botao4.setEnabled(true);
            botao5.setEnabled(true);
            perguntaAtual++;
        }

        verificaSeTesteFoiIniciado(e);
        if(e.getSource() == botao1 || e.getSource() == botao2 ||
                e.getSource() == botao3 || e.getSource() == botao4 ||
                e.getSource() == botao5){
            proximaQuestao.setVisible(true);
        }

        if (perguntaAtual == 1) {

            if (e.getSource() == botao1) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao2) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao3) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao4) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao5) {
                score = score + 10;
                respCorretaIncorreta.setText("Resposta correta");
            }

            if (e.getSource() == iniciar || e.getSource() == reIniciar) {//Botão iniciar = primeiro clic
                textoDaPergunta.setText("1) A ordem baixada pelo governador de Minas Gerais, Visconde de Barbacena, " +
                        "para que se realizasse a Derrama, ou seja, a cobrança dos tributos devidos à coroa " +
                        "portuguesa foi a causa imediata da: ");
                textoResposta1.setText("Revolta dos Alfaiates");
                textoResposta2.setText("Revolta de Vila Rica");
                textoResposta3.setText("Guerra dos Mascates");
                textoResposta4.setText("Guerra do Contestado");
                textoResposta5.setText("Inconfidência Mineira");
            }
        }

        //Segunda questão
        if (perguntaAtual == 2) {


            respCorretaIncorreta.setText("");

            if (e.getSource() == botao1) {
                score = score + 10;
                respCorretaIncorreta.setText("Resposta correta");
            }
            if (e.getSource() == botao2) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao3) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao4) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao5) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == proximaQuestao) {//Segundo clic
                textoDaPergunta.setText("2) A primeira “relação de trabalho” entre portugueses e índios brasileiros foi: ");
                textoResposta1.setText("O escambo");
                textoResposta2.setText("A servidão");
                textoResposta3.setText("O colonato");
                textoResposta4.setText("A mita");
                textoResposta5.setText("A escravidão");
            }
        }

        //Terceira questão
        if (perguntaAtual == 3) {

            respCorretaIncorreta.setText("");

            if (e.getSource() == botao1) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao2) {
                score = score + 10;
                respCorretaIncorreta.setText("Resposta correta");
            }
            if (e.getSource() == botao3) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao4) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao5) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == proximaQuestao) {//Terceiro clic
                textoDaPergunta.setText("3) Quem foi o primeiro governador-geral do Brasil? ");
                textoResposta1.setText("Mem de Sá");
                textoResposta2.setText("Tomé de Sousa");
                textoResposta3.setText("Duarte da Costa");
                textoResposta4.setText("Duarte Coelho");
                textoResposta5.setText("Martim Afonso de Sousa");
            }
        }

        //Quarta questão
        if (perguntaAtual == 4) {

            respCorretaIncorreta.setText("");

            if (e.getSource() == botao1) {
                score = score + 10;
                respCorretaIncorreta.setText("Resposta correta");
            }
            if (e.getSource() == botao2) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao3) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao4) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao5) {
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == proximaQuestao) {//Quarto clic
                textoDaPergunta.setText("4) Qual era o nome da principal estrada que ligava as Minas Gerais com o Rio de " +
                        "Janeiro durante o auge do período da mineração? ");
                textoResposta1.setText("Caminho Novo");
                textoResposta2.setText("Estrada Lusitana");
                textoResposta3.setText("Caminho do Ouro");
                textoResposta4.setText("Estrada das Minas");
                textoResposta5.setText("Caminho de Paraty");
            }
        }

        //Quinta questão
        if (perguntaAtual == 5) {

            respCorretaIncorreta.setText("");

            if (e.getSource() == botao1) {
                isUltimaPerguntaRespondida = true;
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao2) {
                isUltimaPerguntaRespondida = true;
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao3) {
                isUltimaPerguntaRespondida = true;
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == botao4) {
                score = score + 10;
                isUltimaPerguntaRespondida = true;
                respCorretaIncorreta.setText("Resposta correta");
            }
            if (e.getSource() == botao5) {
                isUltimaPerguntaRespondida = true;
                respCorretaIncorreta.setText("Resposta incorreta");
            }
            if (e.getSource() == proximaQuestao) {//quinto clic                //
                textoDaPergunta.setText("5) Os bandeirantes eram os responsáveis por expedições que ficaram conhecidas como: ");
                textoResposta1.setText("Derramas");
                textoResposta2.setText("Capitulações");
                textoResposta3.setText("Processos");
                textoResposta4.setText("Bandeiras");
                textoResposta5.setText("Delegações");
            }
        }
        if (isUltimaPerguntaRespondida) {
            mostraResultado();
            mostraBotaoReiniciar(e);

        }
    }
}



