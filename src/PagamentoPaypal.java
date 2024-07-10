public class PagamentoPaypal extends Pagamento {
    private String emailConta;

    public PagamentoPaypal(double valor, String emailConta) {
        super(valor);
        this.emailConta = emailConta;
    }

    public String getEmailConta() {
        return emailConta;
    }

    public void setEmailConta(String emailConta) {
        this.emailConta = emailConta;
    }

    @Override
    public void processarPagamento() {
        // Implementação do processamento de pagamento com PayPal
        System.out.println("Processando pagamento com PayPal: " + emailConta);
    }
}
