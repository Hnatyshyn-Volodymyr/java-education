package task_2;

public class EncapsulationDemo {
    private int number;
    private String stringValue;
    private Object anObject;

    public EncapsulationDemo(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public EncapsulationDemo() {
        this.number = 0;
        this.stringValue = "";
        this.anObject = null;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    @Override
    public String toString() {
        return "EncapsulationDemo{" +
                "number=" + number +
                ", stringValue='" + stringValue + '\'' +
                ", anObject=" + anObject +
                '}';
    }

    public static void main(String[] args) {
        EncapsulationDemo demo1 = new EncapsulationDemo(42, "Hello", new Object());

        EncapsulationDemo demo2 = new EncapsulationDemo();
        demo2.setNumber(7);
        demo2.setStringValue("World");
        demo2.setAnObject("Some object");

        System.out.println(demo1);
        System.out.println(demo2);
    }
}