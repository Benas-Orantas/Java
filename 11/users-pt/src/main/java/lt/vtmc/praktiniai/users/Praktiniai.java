package lt.vtmc.praktiniai.users;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
//        int count = 0;
//        for (User user : users) {
//            if (user.getAge() > 25) {
//                count++;
//            }
//        }
//        return count;
        return (int) users.stream().filter(u -> u.getAge() > 25).count();
    }

    public static double getAverageAge(List<User> users) {
//        int sum = 0;
//        for (User user : users) {
//            sum += user.getAge();
//        }
//        return (double) sum / users.size();
        return (double) users.stream().mapToInt(User::getAge).sum() / users.size();
//        return (double) users.stream().mapToInt(User::getAge).average(); cannot convert to double
    }

    public static Integer getMinAge(List<User> users) {
        int min = 2147483647;
        for (User user : users) {
            if (user.getAge() < min) {
                min = user.getAge();
            }
        }
        return min;
//        return (int) users.stream().mapToInt(User::getAge).min(); sadly doesn't work...
    }

    public static User findByName(List<User> users, String name) {
        User result = new User("Is not in list");
        for (User user : users) {
            if (user.getName().equals(name)) {
                result = user;
            }
        }
        return result;
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
    }

    public static User findOldest(List<User> users) {
//        int max = 0;
//        User oldest = new User("Empty List");
//        for (User user : users) {
//            if (user.getAge() > max) {
//                oldest = user;
//            }
//        }
//        return oldest;
        return users.stream().max(Comparator.comparing(User::getAge)).orElse(null);
    }

    public static int sumAge(List<User> users) {
//        int sum = 0;
//        for (User user : users) {
//            sum += user.getAge();
//        }
//        return sum;
        return users.stream().mapToInt(User::getAge).sum();
    }

}
