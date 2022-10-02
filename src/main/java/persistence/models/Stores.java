package persistence.models;

public class Stores {
    private int idstore;
    private String city;
    private int numberEmployees;


    public Stores(int idstore, String city, int numberEmployees) {
        this.idstore = idstore;
        this.city = city;
        this.numberEmployees = numberEmployees;
    }

    public Stores(){

    };


    public int getIdstore() {
        return idstore;
    }

    public void setIdstore(int idstore) {
        this.idstore = idstore;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public String toString() {
        return "Stores{" +
                "idstore=" + idstore +
                ", city='" + city + '\'' +
                ", numberEmployees=" + numberEmployees +
                '}';
    }
}

