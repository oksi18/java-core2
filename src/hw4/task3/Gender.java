package hw4.task3;

public enum Gender {
    Male("Male"),
    Female("Femail");

    private final String type;

    Gender(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "type='" + type + '\'' +
                '}';
    }
}