package hashmap.src.main.java.com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vendas vendas = new Vendas();
        String operacao;
        do {
            operacao = JOptionPane.showInputDialog(
                "----Gerenciamento de Vendas----\n"
                +"1 - Cadastra Venda \n"
                +"2 - Listar Vendas por CPF \n"
                +"3 - Listar Vendas por CPF e Valor Mínimo \n"
                +"4 - Sair"
            );
            switch (operacao) {
                case "1":
                    String cpfVenda = JOptionPane.showInputDialog(
                        "Informe o CPF do Cliente"
                    );
                    String nomeProduto = JOptionPane.showInputDialog(
                        "Informe o nome do Produto"
                    );
                    double precoProduto = Double.parseDouble(JOptionPane.showInputDialog(
                        "Informe o Valor do Produto"
                    ));
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    vendas.cadastroVenda(cpfVenda, produto);
                    JOptionPane.showMessageDialog(null, "Produto Cadastro com Sucesso", nomeProduto, 0);
                    break;
                case "2":
                    String cpfCliente = JOptionPane.showInputDialog(
                        "Informe o CPF do Cliente"
                    );
                    System.out.println(vendas.listaProdutos(cpfCliente).toString()); 
                case "3":
                    String cpfCliente2 = JOptionPane.showInputDialog(
                        "Informe o CPF do Cliente"
                    );
                    double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog(
                        "Informe o Valor  Mínimo da lista"
                    ));
                    try {
                        System.out.println(vendas.listarProdutosFiltro(
                            cpfCliente2, valorMinimo
                            ).toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                default:
                    break;
            }
        } while (operacao!="4");
    }
}