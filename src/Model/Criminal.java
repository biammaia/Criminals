package Model;


public class Criminal {
    private String id;
    private String cpf;
    private String first_name;
    private String last_name;
    private String birth_date;

    public Criminal(String id, String cpf, String first_name, String last_name, String birth_date) {
        this.id = id;
        this.cpf = cpf;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
    }

    public Criminal() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "Criminal{" +
                "id='" + id + '\'' +
                ", cpf='" + cpf + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date='" + birth_date + '\'' +
                '}';
    }

    // TODO verificar se será necessário adicionar ou remover informações
}
