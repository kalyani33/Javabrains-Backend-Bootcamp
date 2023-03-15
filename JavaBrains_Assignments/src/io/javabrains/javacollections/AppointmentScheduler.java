package io.javabrains.javacollections;

import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

// Implement the  AppointmentScheduler using a NavigableSet internally

public class AppointmentScheduler {
	NavigableSet<LocalDateTime> aptmnts = new TreeSet<>();

    public void addAppointment(LocalDateTime datetime) {
    	aptmnts.add(datetime);
    }

    public LocalDateTime getNextAvailableSlot(LocalDateTime datetime) {
    	return aptmnts.ceiling(datetime);
    }

    public LocalDateTime removeFirstAppointment() {
    	return aptmnts.pollFirst();
    }

    public LocalDateTime removeLastAppointment() {
    	return aptmnts.pollLast();
    }

    public NavigableSet<LocalDateTime> getAppointmentsAfter(LocalDateTime datetime) {
    	NavigableSet<LocalDateTime> set = (NavigableSet<LocalDateTime>) aptmnts.tailSet(datetime,false);
    	return set;
    }

    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();

        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 10, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 11, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 12, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 13, 0));

        LocalDateTime datetime1 = LocalDateTime.of(2023, 3, 4, 10, 30);
        LocalDateTime nextSlot1 = scheduler.getNextAvailableSlot(datetime1);
        System.out.println("Next available slot after " + datetime1 + ": " + nextSlot1);

        LocalDateTime first = scheduler.removeFirstAppointment();
        System.out.println("Removed first appointment: " + first);

        LocalDateTime last = scheduler.removeLastAppointment();
        System.out.println("Removed last appointment: " + last);

        LocalDateTime datetime3 = LocalDateTime.of(2023, 3, 4, 11, 0);
        NavigableSet<LocalDateTime> appointmentsAfter = scheduler.getAppointmentsAfter(datetime3);
        System.out.println("Appointments after " + datetime3 + ": " + appointmentsAfter);
    }
}


/*
 * OUTPUT:: Next available slot after 2023-03-04T10:30: 2023-03-04T11:00 
 * Removed first appointment: 2023-03-04T10:00 
 * Removed last appointment: 2023-03-04T13:00 
 * Appointments after 2023-03-04T11:00: [2023-03-04T12:00]
 */