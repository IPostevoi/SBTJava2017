package hw2;

/**
 * Created by bakla410 on 29.09.17.
 */
public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife.
     * Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     *
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband
     * and wife, false otherwise
     */
    public boolean marry(Person person) {
        if (person.isMan() != this.isMan()) {
            if (person.getSpouse() == null && this.getSpouse() == null) {
                this.setSpouse(person);
                person.setSpouse(this);
            } else if (person.getSpouse() != null) {
                person.divorce();
                this.setSpouse(person);
                person.setSpouse(this);
            } else {
                this.divorce();
                this.setSpouse(person);
                person.setSpouse(this);
            }
            return true;
        }
        return false;
    }

    /**
     * Sets spouse = null if spouse is not null
     *
     * @return true - if person status has been changed
     */
    public boolean divorce() {
        boolean bool = getSpouse() != null;
        setSpouse(null);
        return bool;
    }

    public boolean isMan() {
        return man;
    }

    public String getName() {
        return name;
    }

    public Person getSpouse() {
        return spouse;
    }

    private void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
}

