public class Garcom {

        private int cpf;
        private String nome;
        private String sexo;
        private double salarioFixo;
        private int dataNascimento;




        public Garcom(int cpf, String nome, String sexo, double salarioFixo, int dataNascimento) {
        }

        public Garcom(int cpf, String nome, String email, double salarioFixo) {
            this.cpf = cpf;
            this.nome = nome;
            this.sexo = sexo;
            this.salarioFixo = salarioFixo;
            this.dataNascimento = dataNascimento;
        }
        public int getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(int dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public double getSalarioFixo() {
            return salarioFixo;
        }

        public void setSalarioFixo(double salarioFixo) {
            this.salarioFixo = salarioFixo;
        }
    }

