package seedu.address.model.event;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.common.Category;
import seedu.address.model.common.Date;
import seedu.address.model.common.Name;
import seedu.address.model.common.Tag;


/**
 * Represents an event in SOChedule.
 */
public class Event {
    // Fields
    private final Name name;
    private final Date startDate;
    private final Time startTime;
    private final Date endDate;
    private final Time endTime;
    private final Category category;
    private final Set<Tag> tags = new HashSet<>();

    /**
     * Name field must be present and not null.
     */
    public Event(Name name, Date startDate, Time startTime,
                Date endDate, Time endTime, Category category, Set<Tag> tags) {
        requireAllNonNull(name, startDate, endDate);
        this.name = name;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.category = category;
        this.tags.addAll(tags);
    }
}