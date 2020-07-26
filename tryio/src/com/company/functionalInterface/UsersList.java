package com.company.functionalInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsersList {
    private static final LocalDate PRESENTDATE = LocalDate.of(2019, 7, 20);

    public static void filterListByUsers () {
        List<User> clients = createAndGetUsers();
        Map<Team, List<String>> groupByTeam = clients.stream()
                .filter(d -> d.getLoginDate()
                        .isAfter(PRESENTDATE))
                .collect(Collectors.groupingBy(User::getTeam, Collectors.mapping(User::getEmail, Collectors.toList())));

        System.out.println("\n" + clients + "\n");
        System.out.println("\n" + groupByTeam + "\n");
    }
    public static List<User> createAndGetUsers() {
        List<User> clients = new ArrayList<>();
        clients.add(new User("alf@hi.com", LocalDate.of(2019, 7, 22), Team.FIRST));
        clients.add(new User("kris@lava.com", LocalDate.of(2019, 7, 23), Team.SECOND));
        clients.add(new User("misterio@hak.com", LocalDate.of(2019, 7, 21), Team.THIRD));
        clients.add(new User("min@fyb.com", LocalDate.of(2019, 7, 24), Team.SECOND));
        clients.add(new User("ciena@wat.com", LocalDate.of(2019, 7, 12), Team.SECOND));
        clients.add(new User("toha@tyt.com", LocalDate.of(2019, 7, 27), Team.FIRST));
        clients.add(new User("sckala@bydy.com", LocalDate.of(2019, 7, 13), Team.THIRD));
        clients.add(new User("bikini@bottom.com", LocalDate.of(2019, 7, 14), Team.SECOND));
        clients.add(new User("kerha@yak.com",  LocalDate.of(2019, 7, 16), Team.FIRST));
        clients.add(new User("under@noth.com", LocalDate.of(2019, 7, 15), Team.THIRD));
        return clients;
    }
}
