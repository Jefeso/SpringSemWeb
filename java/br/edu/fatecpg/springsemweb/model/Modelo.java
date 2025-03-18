package br.edu.fatecpg.springsemweb.model;

public class Modelo {
        private String codigo;
        private String nome;

        // Getters e Setters
        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Modelo{" +
                    "codigo='" + codigo + '\'' +
                    ", nome='" + nome + '\'' +
                    '}';
        }
    }
