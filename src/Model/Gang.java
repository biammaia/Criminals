package Model;

import java.util.List;

public class Gang {
    private String id;
    private String name;
    private List<Criminal> criminals;

    public Gang() {
    }

    public Gang(String id, String name, List<Criminal> criminals) {
        this.id = id;
        this.name = name;
        this.criminals = criminals;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Criminal> getCriminals() {
        return criminals;
    }

    public void setCriminals(List<Criminal> criminals) {
        this.criminals = criminals;
    }

    @Override
    public String toString() {
        return "Gang{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", criminals=" + criminals +
                '}';
    }

    // TODO verificar se será necessário adicionar ou remover informações
}
