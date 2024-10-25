

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        
    

        while(true){
            int a= Integer.parseInt(JOptionPane.showInputDialog("digite um valor: "));
            int escolha= Integer.parseInt(JOptionPane.showInputDialog("escolha entre: \n1 - multiplicação \n2 - divisão \n3 - subtração \n4 - soma \n0 para sair  "));

            int b= Integer.parseInt(JOptionPane.showInputDialog("digite um valor: "));

            switch (escolha) {
            
              

             
                case 1 :{
                    if (escolha==1){
                int res = a*b;
                JOptionPane.showMessageDialog(null,res);
                    }
                }

                case 2 :{
                    if (escolha==2){
                int res = a/b;
                JOptionPane.showMessageDialog(null,res);
                }
            }
                case 3 :{
                    if (escolha==3){
                int res = a-b;
                JOptionPane.showMessageDialog(null,res);
                }
            }
                case 4 :{
                    if (escolha==4){
                int res = a+b;
                JOptionPane.showMessageDialog(null,res);
                }
            }
              

              

            }
            if( escolha == 0) {
                JOptionPane.showMessageDialog(null,"seu otario");
                break;   
            }

        }

        }
        





    }



