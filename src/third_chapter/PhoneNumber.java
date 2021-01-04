package third_chapter;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {
    private String number;
    private String name;
    private List<LastOwner> lastOwners;

    private static final Comparator<PhoneNumber> FIELDS_COMPARATOR =
            Comparator.comparing(PhoneNumber::getNumber).thenComparing(PhoneNumber::getName);

    public PhoneNumber(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public PhoneNumber(String number, String name, List<LastOwner> lastOwners) {
        this.number = number;
        this.name = name;
        this.lastOwners = lastOwners;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.number.equals(number) && pn.name.equals(name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(number);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    /*
        Качество этого метода аналогично методу выше,
        но такая реализация более медленная из-за упаковок и распаковок в случае с примтивными типами.
        Рекомендуется использовать только в случаях, когда производительность не является критичной.
     */
//    @Override
//    public int hashCode() {
//        return Objects.hash(number, name);
//    }

    @Override
    public String toString() {
        return String.format("Номер телефона: %s. Название контакта: %s", number, name);
    }

    @Override
    public PhoneNumber clone() {
        try {
            PhoneNumber clone = (PhoneNumber) super.clone();
            clone.setLastOwners(
                    getLastOwners() == null ? null : getLastOwners().stream().map(LastOwner::newInstance).collect(toList())
            );
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return FIELDS_COMPARATOR.compare(this, o);
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public List<LastOwner> getLastOwners() {
        return lastOwners;
    }

    public void setLastOwners(List<LastOwner> lastOwners) {
        this.lastOwners = lastOwners;
    }
}
