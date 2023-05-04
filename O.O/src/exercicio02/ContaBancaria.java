package exercicio02;

public class ContaBancaria {
        public float saldo;
        public String titular;

        public float sacar;
        public float depositar;

        public void saque(float valorSaque){
            this.saldo -= valorSaque;
        }
    public void deposito(float valorDeposito){
            this.saldo += valorDeposito;

    }
    }
