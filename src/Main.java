import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    
    int opcao = 0;
    
    while (opcao != 6) {
    	 System.out.println("====MERCADINHO====");
    	 System.out.println("1 - cadastrar produto");
    	 System.out.println("2 - Registrar venda");
    	 System.out.println("3 - Calcular total da venda");
    	 System.out.println("4 - Emitir recibo");
    	 System.out.println("5 - Sair");
    	 System.out.println("6- Escolha uma opcao: ");
    	 
    	 opcao = sc.nextInt();
    	 
       switch (opcao) {
       
       case 1:
    	   break;
    	   
       case 2:
    	   break;
    	   
       case 3:
    	   break;
    	   
       case 4:
    	   break;
       
       case 5:
           break;
           
       case 6:
    	   System.out.println("Encerrando o sistema...");
    	   break;
    	   
    	   default:
    		   System.out.println("Opcao invalida!");
    		   break;
    			
       }
    }
    
    sc.close();
    
	}

}
