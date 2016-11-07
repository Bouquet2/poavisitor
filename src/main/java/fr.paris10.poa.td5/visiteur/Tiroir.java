package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public class Tiroir implements PetitObjetBasique{
    private String name;

    public Tiroir(String name) {
        this.name = name;
    }

    public void accept(Visiteur v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tiroir{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
