package co.rs.optika.model;

public class TestBean {
    private long id;
    private String name;
    private double value;

    public TestBean() {
    }

    public TestBean(long id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public Object[] getRowData() {
        return new Object[]{id, name, value};
    }
}
