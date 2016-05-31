package tai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.agh.tai.Event;
import pl.edu.agh.tai.Place;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DashboardController {

    @RequestMapping(path="api/events", method = RequestMethod.GET)
    public List<Event> showTasks() throws IOException {
        List<Event> events = new ArrayList<>();
        Event event1 = new Event(1, "Juwenalia", new Place(1, "AGH", "Kraków", "MS", 0), null, false);
        event1.setHashtag("flowers");
        events.add(event1);
        events.add(new Event(2, "Open'er", new Place(2, "Lotnisko", "Gdynia", "brak", 12), null, true));

        return events;
    }



}