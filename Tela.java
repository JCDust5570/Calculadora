
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Tela extends JFrame{
    
    JButton num1;
    JButton num2;
    JButton num3;
    JButton num4;
    JButton num5;
    JButton num6;
    JButton num7;
    JButton num8;
    JButton num9;
    JButton num0;
    JButton adicao;
    JButton subtracao;
    JButton multiplicacao;
    JButton divisao;
    JButton igual;
    JButton limpar;
    JButton ponto;
    JButton deletar;
    


    int coluna0 = 50;
    int coluna1 = 100;
    int coluna2 = 150;
    int coluna3 = 200;
    int coluna4 = 250;
    
    int linha0 = 200;
    int linha1 = 250;
    int linha2 = 300;
    int linha3 = 350;

    int Tamanho = 50;





    JTextField visor;

    

    
    public Tela(){
        setTitle("Calculadora"); // Nome da janela
        setSize(450, 500); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar a janela
        setResizable(false); // Não permitir que o usuário redimensione a janela
        setLocationRelativeTo(null); // Centralizar a janela
        setLayout(null); // Não usar gerenciador de layout

        visor = new JTextField();
        visor.setBounds(coluna0, 50, 350, 50);
        visor.setFont(new Font("Arial", Font.PLAIN, 30));
        visor.setEditable(false);
        add(visor);

        num1 = new JButton("1");
        num1.setBounds(coluna1, linha0, Tamanho, Tamanho);
        num1.setBackground(Color.WHITE);
        num1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "1");
            }
        });
        add(num1);

        num2 = new JButton("2");
        num2.setBounds(coluna2, linha0, Tamanho, Tamanho);
        num2.setBackground(Color.WHITE);
        num2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "2");
            }
        });
        add(num2);

        num3 = new JButton("3");
        num3.setBounds(coluna3, linha0, Tamanho, Tamanho);
        num3.setBackground(Color.WHITE);
        num3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "3");
            }
        });
        add(num3);

        num4 = new JButton("4");
        num4.setBounds(coluna1, linha1, Tamanho, Tamanho);
        num4.setBackground(Color.WHITE);
        num4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "4");
            }
        });
        add(num4);

        num5 = new JButton("5");
        num5.setBounds(coluna2, linha1, Tamanho, Tamanho);
        num5.setBackground(Color.WHITE);
        num5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "5");
            }
        });
        add(num5);

        num6 = new JButton("6");
        num6.setBounds(coluna3, linha1, Tamanho, Tamanho);
        num6.setBackground(Color.WHITE);
        num6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "6");
            }
        });
        add(num6);

        num7 = new JButton("7");
        num7.setBounds(coluna1, linha2, Tamanho, Tamanho);
        num7.setBackground(Color.WHITE);
        num7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "7");
            }
        });
        add(num7);

        num8 = new JButton("8");
        num8.setBounds(coluna2, linha2, Tamanho, Tamanho);
        num8.setBackground(Color.WHITE);
        num8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "8");
            }
        });
        add(num8);

        num9 = new JButton("9");
        num9.setBounds(coluna3, linha2, Tamanho, Tamanho);
        num9.setBackground(Color.WHITE);
        num9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "9");
            }
        });
        add(num9);

        num0 = new JButton("0");
        num0.setBounds(coluna1, linha3, 150, Tamanho);
        num0.setBackground(Color.WHITE);
        num0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "0");
            }
        });
        add(num0);

        adicao = new JButton("+");
        adicao.setBounds(coluna4, linha0, Tamanho, Tamanho);
        adicao.setBackground(Color.WHITE);
        adicao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "+");
            }
        });
        add(adicao);

        subtracao = new JButton("-");
        subtracao.setBounds(coluna4, linha1, Tamanho, Tamanho);
        subtracao.setBackground(Color.WHITE);
        subtracao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "-");
            }
        });
        add(subtracao);

        multiplicacao = new JButton("*");
        multiplicacao.setBounds(coluna4, linha2, Tamanho, Tamanho);
        multiplicacao.setBackground(Color.WHITE);
        multiplicacao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "*");
            }
        });
        add(multiplicacao);

        divisao = new JButton("/");
        divisao.setBounds(coluna4, linha3, Tamanho, Tamanho);
        divisao.setBackground(Color.WHITE);
        divisao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "/");
            }
        });
        add(divisao);

        igual = new JButton("=");
        igual.setBounds(coluna0, linha2, Tamanho, Tamanho);
        igual.setBackground(Color.WHITE);
        igual.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String expressao = visor.getText();
                String[] numeros = expressao.split("[+\\-*/]");
                String[] operadores = expressao.split("[0-9]+");
                double resultado = Double.parseDouble(numeros[0]);
                for(int i = 1; i < numeros.length; i++){
                    if(operadores[i].equals("+")){
                        resultado += Double.parseDouble(numeros[i]);
                    }else if(operadores[i].equals("-")){
                        resultado -= Double.parseDouble(numeros[i]);
                    }else if(operadores[i].equals("*")){
                        resultado *= Double.parseDouble(numeros[i]);
                    }else if(operadores[i].equals("/")){
                        resultado /= Double.parseDouble(numeros[i]);
                    }
                }
                visor.setText(String.valueOf(resultado));
            }
        });
        add(igual);

        limpar = new JButton("C");
        limpar.setBounds(coluna0, linha0, Tamanho, Tamanho);
        limpar.setBackground(Color.WHITE);
        limpar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText("");
            }
        });
        add(limpar);

        ponto = new JButton(".");
        ponto.setBounds(coluna0, linha1, Tamanho, Tamanho);
        ponto.setBackground(Color.WHITE);
        ponto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + ".");
            }
        });
        add(ponto);

        deletar = new JButton("DEL");
        deletar.setBounds(coluna0, linha3, Tamanho, Tamanho);
        deletar.setFont(new Font("Arial", Font.PLAIN, 8));
        deletar.setBackground(Color.WHITE);
        deletar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String expressao = visor.getText();
                visor.setText(expressao.substring(0, expressao.length() - 1));
            }
        });
        add(deletar);



        setVisible(true);
    }
   
    
}
