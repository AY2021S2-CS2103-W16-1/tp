package seedu.address.model.common;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-mm-dd");
    public static final String MESSAGE_CONSTRAINTS =
            "Date should be represented in the format of yyyy-mm-dd";
    public static final String VALIDATION_REGEX = "^[0-9]{4}-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])$";

    private LocalDate date;

    /**
     * Constructs an {@code Date}.
     *
     * @param dateString A valid date.
     */
    public Date(String dateString) {
        requireNonNull(dateString);
        checkArgument(isValidDate(dateString), MESSAGE_CONSTRAINTS);
        date = LocalDate.parse(dateString, DATE_FORMATTER);
    }

    public LocalDate getDate() {
        return this.date;
    }

    /**
     * Returns true if a given string is a valid date.
     */
    public static boolean isValidDate(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    /**
     * Returns the date in a string.
     */
    public String toString() {
        return this.date.format(DATE_FORMATTER);
    }
}
