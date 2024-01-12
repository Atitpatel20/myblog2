package com.myblog2.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        List<LocalDate> data = Arrays.asList(
                new LocalDate(25, 8, 2015),
                new LocalDate(14, 2, 2001),
                new LocalDate(26, 12, 2017),
                new LocalDate(7, 05, 1997),
                new LocalDate(28, 3, 2001)
        );
        Map<Long, List<LocalDate>> collect = data.stream().collect(Collectors.groupingBy(str -> str.getYear()));

        for (Map.Entry<Long, List<LocalDate>> entry : collect.entrySet()) {
            Long year = entry.getKey();
            List<LocalDate> detailes = entry.getValue();
            System.out.println("year: " + year);
            for (LocalDate d : detailes) {
                System.out.println(d.getDate());
                System.out.println(d.getMonth());
            }

        }
    }
}
