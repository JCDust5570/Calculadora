
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

    JTextField visor;

    

    
    public Tela(){
        setTitle("Calculadora"); // Nome da janela
        setSize(400, 500); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar a janela
        setResizable(false); // Não permitir que o usuário redimensione a janela
        setLocationRelativeTo(null); // Centralizar a janela
        setLayout(null); // Não usar gerenciador de layout

        num1 = new JButton("1");
        num1.setBounds(100, 200, 50, 50);
        num1.setFont(new Font("Arial", Font.BOLD, 20));
        num1.setBackground(Color.WHITE);
        add(num1);

        num2 = new JButton("2");
        num2.setBounds(150, 200, 50, 50);
        num2.setFont(new Font("Arial", Font.BOLD, 20));
        num2.setBackground(Color.WHITE);
        add(num2);

        num3 = new JButton("3");
        num3.setBounds(200, 200, 50, 50);
        num3.setFont(new Font("Arial", Font.BOLD, 20));
        num3.setBackground(Color.WHITE);
        add(num3);

        num4 = new JButton("4");
        num4.setBounds(100, 250, 50, 50);
        num4.setFont(new Font("Arial", Font.BOLD, 20));
        num4.setBackground(Color.WHITE);
        add(num4);

        num5 = new JButton("5");
        num5.setBounds(150, 250, 50, 50);
        num5.setFont(new Font("Arial", Font.BOLD, 20));
        num5.setBackground(Color.WHITE);
        add(num5);

        num6 = new JButton("6");
        num6.setBounds(200, 250, 50, 50);
        num6.setFont(new Font("Arial", Font.BOLD, 20));
        num6.setBackground(Color.WHITE);
        add(num6);

        num7 = new JButton("7");
        num7.setBounds(100, 300, 50, 50);
        num7.setFont(new Font("Arial", Font.BOLD, 20));
        num7.setBackground(Color.WHITE);
        add(num7);

        num8 = new JButton("8");
        num8.setBounds(150, 300, 50, 50);
        num8.setFont(new Font("Arial", Font.BOLD, 20));
        num8.setBackground(Color.WHITE);
        add(num8);

        num9 = new JButton("9");
        num9.setBounds(200, 300, 50, 50);
        num9.setFont(new Font("Arial", Font.BOLD, 20));
        num9.setBackground(Color.WHITE);
        add(num9);

        num0 = new JButton("0");
        num0.setBounds(100, 350, 150, 50);
        num0.setFont(new Font("Arial", Font.BOLD, 20));
        num0.setBackground(Color.WHITE);
        add(num0);

        adicao = new JButton("+");
        adicao.setBounds(250, 200, 50, 50);
        adicao.setFont(new Font("Arial", Font.BOLD, 20));
        adicao.setBackground(Color.WHITE);
        add(adicao);

        subtracao = new JButton("-");
        subtracao.setBounds(250, 250, 50, 50);
        subtracao.setFont(new Font("Arial", Font.BOLD, 20));
        subtracao.setBackground(Color.WHITE);
        add(subtracao);

        multiplicacao = new JButton("*");
        multiplicacao.setBounds(250, 300, 50, 50);
        multiplicacao.setFont(new Font("Arial", Font.BOLD, 20));
        multiplicacao.setBackground(Color.WHITE);
        add(multiplicacao);

        divisao = new JButton("/");
        divisao.setBounds(250, 350, 50, 50);
        divisao.setFont(new Font("Arial", Font.BOLD, 20));
        divisao.setBackground(Color.WHITE);
        add(divisao);

        igual = new JButton("=");
        igual.setBounds(300, 250, 50, 50);
        igual.setFont(new Font("Arial", Font.BOLD, 20));
        igual.setBackground(Color.WHITE);
        add(igual);

        limpar = new JButton("C");
        limpar.setBounds(300, 300, 50, 50);
        limpar.setFont(new Font("Arial", Font.BOLD, 20));
        limpar.setBackground(Color.WHITE);
        add(limpar);

        ponto = new JButton(".");
        ponto.setBounds(300, 200, 50, 50);
        ponto.setFont(new Font("Arial", Font.BOLD, 20));
        ponto.setBackground(Color.WHITE);
        add(ponto);

        visor = new JTextField();
        visor.setBounds(100, 100, 200, 50);
        visor.setFont(new Font("Arial", Font.BOLD, 20));
        visor.setBackground(Color.WHITE);
        add(visor);

        num1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "1");
            }
        });

        num2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "2");
            }
        });

        num3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "3");
            }
        });

        num4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "4");
            }
        });

        num5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "5");
            }
        });

        num6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "6");
            }
        });

        num7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "7");
            }
        });

        num8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "8");
            }
        });

        num9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "9");
            }
        });

        num0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "0");
            }
        });

        ponto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + ".");
            }
        });

        adicao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "+");
            }
        });

        subtracao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "-");
            }
        });

        multiplicacao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "*");
            }
        });

        divisao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "/");
            }
        });

        limpar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                visor.setText("");
            }
        });

        igual.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String expressao = visor.getText();
                String[] numeros = expressao.split("[+*/-]");
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



        



        
        


        
        






        setVisible(true);
    }

    
}
