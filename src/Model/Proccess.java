package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Proccess {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private List<Gang> gang;

    @ManyToMany
    private List<Crime> crimes;

    public Proccess() {}
    
    public Proccess(List<Gang> gang, List<Crime> crimes) {
        this.gang = gang;
        this.crimes = crimes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Gang> getGang() {
        return gang;
    }

    public void setGang(List<Gang> gang) {
        this.gang = gang;
    }

    public List<Crime> getCrimes() {
        return crimes;
    }

    public void setCrimes(List<Crime> crimes) {
        this.crimes = crimes;
    }

    @Override
    public String toString() {
        return "Proccess{" +
                "id=" + id +
                ", gang=" + gang +
                ", crimes=" + crimes +
                '}';
    }
}
