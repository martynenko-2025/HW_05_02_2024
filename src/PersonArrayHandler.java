import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



    public class PersonArrayHandler {
        private Person[] array;

        public PersonArrayHandler(Person[] array) {
            this.array = array;
        }

        @Override
        public String toString() {
            String result = "";
            for (Person person : array) {
                result += person + System.lineSeparator();
            }
            return result;
        }

        public Person get(int index) {
            if (index < 0 || index >= array.length) {
                return null;
            } else {
                return array[index];
            }
        }

        public int indexOfMaxAgePerson() {
            return indexOfMaxAgePerson(0);
        }

        public int indexOfMaxAgePerson(int index) {
            int maxIndex = Math.max(index, 0);
            for (int i = index; i < array.length; i++) {
                if (array[i].getAge() > array[maxIndex].getAge()) {
                    maxIndex = i;
                }
            }
            return maxIndex >= array.length ? -1 : maxIndex;

        }

        public boolean isPersonExists(Person person) {
            for (Person p : array) {
                if (p.equals(person)) {
                    return true;
                }
            }
            return false;
        }

        boolean isPersonExists(Person[] person) {
            for (Person p : person) {
                if (!isPersonExists(p)) {
                    return false;
                }
            }
            return true;
        }

        List retainAll(Person[] person) {
            List<Person> result = new ArrayList<>();
            for (Person p : person) {
                if (isPersonExists(p)) {
                    result.add(p);
                }
            }

            return result;
        }
    }

